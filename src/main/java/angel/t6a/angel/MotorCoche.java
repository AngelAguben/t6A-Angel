/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.t6a.angel;

/**
 *
 * @author Ángel
 */
public class MotorCoche extends Motor { // Clase B

    private int cc; // Centímetros cúbicos

    public MotorCoche() {
    }

    public MotorCoche(int cc) {
        super();
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cc;
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
        final MotorCoche other = (MotorCoche) obj;
        if (this.cc != other.cc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MotorCoche{" + "cc=" + cc + '}';
    }

    @Override
    public void arrancar() { // metodoA
        System.out.println("Arrancando motor del coche...");
    }

    // MetodoB que solo exista en B(MotorCoche)
    public void cambiarAceite() {
        System.out.println("Cambiando aceite del motor del coche...(Sale negro)");
    }

}
