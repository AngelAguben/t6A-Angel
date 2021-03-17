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
public class Microondas extends Electrodomestico implements MuestraInformacion, Comparable<Microondas> {

    private int potenciaMax;

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public Microondas(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return super.toString() + "Microondas{" + "potenciaMax=" + potenciaMax + '}';
    }

    @Override
    public void muestra() {
        System.out.println("La potencia máxima del microondas es: " + potenciaMax);
    }

    @Override
    public int compareTo(Microondas micro) {
        return this.potenciaMax - micro.getPotenciaMax();
    }

}
