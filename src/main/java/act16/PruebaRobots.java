/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Ángel
 */
public class PruebaRobots {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Robot> almacen = new ArrayList<>();
        ArrayList<Robot> robotsSanos = new ArrayList<>();
        // Crearemos un robot para después buscarlo
        Robot buscaYCaptura = new Robot(465);

        // Creamois aleatoriamente los robots y los añadimos a la lista
        for (int i = 0; i <= 20; i++) {
            almacen.add(new Robot(random.nextInt(999 - 100 + 1) + 100));
        }

        // Muestra la lista llena de robots
        System.out.println("---Lista si ordenar---");
        for (Robot robot : almacen) {
            System.out.println(robot);
        }
        System.out.println("");

        // Creamos el criterio
        Comparator<Robot> criterioSalud = (v1, v2) -> v1.getSalud() - (v2.getSalud());

        // Y luego implementamos el cirterio
        Collections.sort(almacen, criterioSalud);

        // Lista ordenada por salud de menor a mayor
        System.out.println("---Lista ordenada por salud de menor a mayor---");
        for (Robot robot : almacen) {
            System.out.println(robot);
        }
        System.out.println("");

        // Lista ordenada por salud de mayor a menor
        Collections.sort(almacen, criterioSalud.reversed());
        System.out.println("---Lista ordenada por salud de mayor a menor---");
        for (Robot robot : almacen) {
            System.out.println(robot);
        }
        System.out.println("");

        // Imprimimos la lista de robots sanos llamando al método
        System.out.println("---Robots Sanos: ---");
        for (Robot robotSano : robotsConMasDe50(almacen)) {
            System.out.println(robotSano);
        }
        System.out.println("");

        // Ordenar la lista por número de serie
        System.out.println("---Robots ordenados por número de serie---");
        Collections.sort(almacen);
        for (Robot robot : almacen) {
            System.out.println(robot);
        }
        System.out.println("------");

        // Búsqueda del robot
        System.out.println("---Búsqueda del robot---");
        // Meteremos al robot para que lo encuentre
        almacen.add(buscaYCaptura);
        // Y ordenamos la lista 
        Collections.sort(almacen);

        // Y lo imprimiremos por pantalla
        System.out.println(almacen.get(buscarRobot(buscaYCaptura, almacen)));

    }

    // Devolver en una lista de robots aquellos que tienen más del 50% de 
    // vida. Imprime dicha lista
    public static ArrayList<Robot> robotsConMasDe50(ArrayList<Robot> tienda) {
        ArrayList<Robot> robotsSanos = new ArrayList<>();
        for (Robot robot : tienda) {
            if (robot.getSalud() > 50) {
                robotsSanos.add(robot);
            }
        }
        return robotsSanos;
    }

    // Una vez ordenada la lista por número de serie, realizar búsqueda binaria 
    // de algún robot dentro de la lista.
    public static int buscarRobot(Robot buscar, ArrayList almac) {
        Comparator<Robot> criterio = (r1, r2) -> r1.getNumSerie() - r2.getNumSerie();
        return Collections.binarySearch(almac, buscar, criterio);
    }
}
