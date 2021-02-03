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
        almacenMotores.add(new MotorCoche(1400));
        almacenMotores.add(new MotorCoche(1900));

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
    }
}
