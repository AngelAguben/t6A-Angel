/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Ángel
 */
public class Prueba14 {

    public static void main(String[] args) {

        // Lista de todos los electrodomésticos
        ArrayList<Electrodomestico> electros = new ArrayList<>();
        // Lista de frigorífico y microondas que son MuestraInformacion
        ArrayList<MuestraInformacion> minielectros = new ArrayList<>();
        // Lista de las 3 neveras
        ArrayList<Frigorifico> frigos = new ArrayList<>();

        // METER DATOS EN LA LISTA ELECTROS
        // Frigoríficos 
        electros.add(new Frigorifico(500, 400, "Balay"));
        electros.add(new Frigorifico(300, 250, "Samusing"));

        // Microondas
        electros.add(new Microondas(500, 150, "Samsung"));
        electros.add(new Microondas(500, 150, "Balay"));

        // CampanaExtractora
        electros.add(new CampanaExtractora(80, 100, "Balay"));
        electros.add(new CampanaExtractora(50, 80, "Samsung"));

        // METER DATOS EN LA LISTA MINIELECTROS
        for (Electrodomestico electro : electros) {
            if (electro instanceof Microondas) {
                minielectros.add((Microondas) electro);
            }
            if (electro instanceof Frigorifico) {
                minielectros.add((Frigorifico) electro);
            }
        }

        // Ejecutar el método de muestra
        for (MuestraInformacion minielectro : minielectros) {
            minielectro.muestra();
        }

        // METER DATOS EN LA LISTA FRIGOS
        frigos.add(new Frigorifico(500, 300, "Balay"));
        frigos.add(new Frigorifico(800, 300, "Samsung"));
        frigos.add(new Frigorifico(700, 300, "Balay"));
        System.out.println("------");
        
        for (Frigorifico frigo : frigos) {
            System.out.println(frigo.toString());
        }
        System.out.println("---ORDENADA---");
        
        //  En una lista nueva de tres frigoríficos con los valores que tú 
        // quieras, ordena los elementos por su capacidad en litros.
        Collections.sort(frigos);
        for (Frigorifico frigo : frigos) {
            System.out.println(frigo.toString());
        }
    }
}
