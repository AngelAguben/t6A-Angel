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
public final class MotorBerlina extends MotorCoche { // Clase C

    private String marca;
    private boolean turbo;

    public MotorBerlina() {
        super();
    }

    public MotorBerlina(String marca, boolean turbo) {
        super();
        this.marca = marca;
        this.turbo = turbo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getPuertas() {
        return turbo;
    }

    public void setPuertas(boolean turbo) {
        this.turbo = turbo;
    }

    
    

    @Override // POLIMORFICO
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        // CONVERSIÓN EXPLICITA
        final MotorBerlina other = (MotorBerlina) obj;
        if (this.turbo != other.turbo) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    @Override // POLIMORFICO
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + (this.turbo ? 1 : 0);
        return hash;
    }

    // toString
    @Override // POLIMORFICO
    public String toString() {
        return super.toString() + "Berlina{" + "marca=" + marca + ", puertas=" + turbo + '}';
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
