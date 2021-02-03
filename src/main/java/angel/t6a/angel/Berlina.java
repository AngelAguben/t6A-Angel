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
    }

    public Berlina(String marca, int puertas) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.marca);
        hash = 37 * hash + this.puertas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Berlina other = (Berlina) obj;
        if (this.puertas != other.puertas) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Berlina{" + "marca=" + marca + ", puertas=" + puertas + '}';
    }

    @Override
    public void arrancar() { // metodoA
        System.out.println("Arrancando motor de la berlina...");
    }

    // Crea un método “metodoC” que sólo exista en la clase C. (ponerAleron)
    public void ponerAleron() {
        System.out.println("Poniendo alerón to guapo... (+15cv)");
    }

}
