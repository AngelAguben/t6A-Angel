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
public class Frigorifico extends Electrodomestico implements MuestraInformacion, Comparable<Frigorifico> {

    private int capacidadLitros;

    public Frigorifico(int capacidadLitros, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadLitros = capacidadLitros;
    }

    public Frigorifico(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public String toString() {
        return super.toString() + "Frigorifico{" + "capacidadLitros=" + capacidadLitros + '}';
    }

    @Override
    public void muestra() {
        System.out.println("Capacidad en litros: " + this.capacidadLitros);
    }

    @Override
    public int compareTo(Frigorifico frigo) {
        return this.capacidadLitros - frigo.getCapacidadLitros();
    }

}
