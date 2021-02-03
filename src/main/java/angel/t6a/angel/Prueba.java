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
        almacenMotores.add (new Motor(4, "Gasolina"));
        almacenMotores.add (new Motor(3, "Diésel"));
        
        // MotorCoche
        almacenMotores.add(new MotorCoche(1400));
        almacenMotores.add(new MotorCoche(1900));
        
        // Berlina
        almacenMotores.add(new Berlina("BMW", 3));
        almacenMotores.add(new Berlina("Audi", 5));
        
        // Furgoneta
        almacenMotores.add(new Furgoneta("Volkswagen", "Caravelle"));
        almacenMotores.add(new Furgoneta("Citroën", "Jumpy"));
        
        
    }
}
