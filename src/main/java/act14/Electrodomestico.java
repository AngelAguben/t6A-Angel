/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act14;

/**
 *
 * @author Ángel
 */
public abstract class Electrodomestico {

    private double consumo;
    private String modelo;

    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "consumo=" + consumo + ", modelo=" + modelo + '}';
    }

}
