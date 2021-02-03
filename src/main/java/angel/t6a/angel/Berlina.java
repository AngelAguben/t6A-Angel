/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.t6a.angel;

import java.util.Objects;

/**
 *
 * @author Ángel
 */
public final class Berlina extends MotorCoche { // Clase C

    private String marca;
    private int puertas;

    public Berlina() {
        super();
    }

    public Berlina(String marca, int puertas) {
        super();
        this.marca = marca;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override // POLIMORFICO
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.marca);
        hash = 37 * hash + this.puertas;
        return hash;
    }

    @Override // POLIMORFICO
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        // CONVERSIÓN EXPLICITA
        final Berlina other = (Berlina) obj;
        if (this.puertas != other.puertas) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    // toString
    @Override // POLIMORFICO
    public String toString() {
        return super.toString() + "Berlina{" + "marca=" + marca + ", puertas=" + puertas + '}';
    }

    @Override // POLIMORFICO
    public void arrancar() { // metodoA
        System.out.println("Arrancando motor de la berlina...");
    }

    // Crea un método “metodoC” que sólo exista en la clase C. (ponerAleron)
    public void ponerAleron() {
        System.out.println("Poniendo alerón to guapo... (+15cv)");
    }

    // Crea un método “metodoB2” en B que se vaya a sobrescribir en C y D. (vender)
    @Override // POLIMORFICO
    public void vender() {
        System.out.println("Vendiendo berlina a presio amigo...");
    }
}
