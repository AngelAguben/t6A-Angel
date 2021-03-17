/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act16;

import java.util.Random;

/**
 *
 * @author Ángel
 */
public class Robot implements Comparable<Robot> {

    private int numSerie;
    private int salud;

    public Robot(int numSerie) {
        Random random = new Random();

        this.numSerie = numSerie;
        this.salud = random.nextInt(100 - 1 + 1) + 1;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", salud=" + salud + '}';
    }

    // Además, debe ser posible ordenar los robots por número de serie usando 
    // <<Comparable>>.
    @Override
    public int compareTo(Robot rob) {
        return this.numSerie - rob.numSerie;
    }

}
