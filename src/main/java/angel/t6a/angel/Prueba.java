/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.t6a.angel;

import java.util.ArrayList;

/**
 *
 * @author Ángel
 */
public class Prueba {

    public static void main(String[] args) {

        // Creamos la lista de objetos de la superclase A y vamos a añadir dos 
        // objetos de cada
        ArrayList<Motor> almacenMotores = new ArrayList<>();

        // Motor
        almacenMotores.add(new Motor(4, "Gasolina"));
        almacenMotores.add(new Motor(3, "Diésel"));

        // MotorCoche
        // A este mc1 le he tenido que poner un nombre para poder hacer le 
        // CONVERSIÓPN IMPLICITA
        // En una lista de motor meto cosas que no son de motor
        MotorCoche mc1 = new MotorCoche(1900);
        almacenMotores.add(new MotorCoche(1400));
        almacenMotores.add(mc1);

        // Berlina
        almacenMotores.add(new Berlina("BMW", 3));
        almacenMotores.add(new Berlina("Audi", 5));

        // Furgoneta
        almacenMotores.add(new Furgoneta("Volkswagen", "Caravelle"));
        almacenMotores.add(new Furgoneta("Citroën", "Jumpy"));

        // Recorre la lista y realiza las siguientes acciones:
        // llama a métodos propios de cada clase (“metodoB”, “metodoC” y “metodoD”).
        // llama a “metodoA” de todos los objetos.
        for (Motor aux : almacenMotores) {

            // Conversiones explícitas
            // Le digo el tipo de objeto que tiene que ser
            // Entrará sólo con los MotoresCoche 
            if (aux instanceof MotorCoche) {
                System.out.println("---Cambio de aceite---");
                ((MotorCoche) aux).cambiarAceite();
            }
            // Entrará sólo con las berlinas de la lista
            if (aux instanceof Berlina) {
                System.out.println("---Poner alerón---");
                Berlina tmp = (Berlina) aux;
                tmp.ponerAleron();
            }
            // Entrará sólo con las furgonetas de la lista
            if (aux instanceof Furgoneta) {
                System.out.println("---Meter caja de aguacates---");
                Furgoneta x = (Furgoneta) aux;
                x.meterCajaAguacates();
            }
            // Esto lo hace cada vez con cada objeto de la lista
            System.out.println("---Arrancar vehículo---");
            System.out.println(aux);
            aux.arrancar();
        }

        // Usa los métodos indexof(Object o), contains(Object o) y 
        // remove(Object o) de la clase ArrayList, sobre la lista de objetos 
        // que ya tienes, para buscar un objeto en la lista, saber si existe un
        // objeto en la lista y borrar un objeto de la lista, respectivamente. 
        // Si funcionan correctamente significa que el método equals está 
        // correctamente implementado
        System.out.println("Posición de mc1: " + almacenMotores.indexOf(mc1));
        System.out.println("¿Existe mc1? " + almacenMotores.contains(mc1));
        System.out.println("Antes de borrar el elemento mc1");
        almacenMotores.forEach(System.out::println);
        System.out.println("Despues de borrar el elemento mc1");
        almacenMotores.remove(mc1);
        almacenMotores.forEach(System.out::println);
        System.out.println("¿Existe mc1? " + almacenMotores.contains(mc1));
    }
}
