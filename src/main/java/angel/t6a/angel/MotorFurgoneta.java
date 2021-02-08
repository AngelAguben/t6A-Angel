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
public final class MotorFurgoneta extends MotorCoche { // Clase D

    private String marca;
    private String modelo;

    public MotorFurgoneta() {
        super();
    }

    public MotorFurgoneta(String marca, String modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // EN TODOS LOS MÉTODOS QUE PONE OVERRIDE SON SOBRESCRITOS ES DECIR, SON
    // POLOMORFICOS
    @Override // POLIMORFICO
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.marca);
        hash = 17 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    @Override // POLIMORFICO
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        // CONVERSIÓN EXPLICITA
        final MotorFurgoneta other = (MotorFurgoneta) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    // toString
    @Override // POLIMORFICO
    public String toString() {
        return super.toString() + "Furgoneta{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }

    // MetodoA que se sobrescribe
    @Override // POLIMORFICO
    public void arrancar() { // metodoA
        System.out.println("Arrancando motor de la furgoneta...");
    }

    // Crea un método “metodoD” que sólo exista en la clase D.(meterCajaAguacates)
    public void meterCajaAguacates() {
        System.out.println("Metiendo la caja de aguacates...");
    }

    // Crea un método “metodoB2” en B que se vaya a sobrescribir en C y D. (vender)
    @Override // POLIMORFICO
    public void vender() {
        System.out.println("Vendiendo fragoneta a presio amigo...");
    }
}
