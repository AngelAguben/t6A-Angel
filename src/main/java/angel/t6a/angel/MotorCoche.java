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

    private int cenCub; // Centímetros cúbicos

    public MotorCoche() {
    }

    public MotorCoche(int cenCub) {
        super();
        this.cenCub = cenCub;
    }

    public int getcenCub() {
        return cenCub;
    }

    public void setcenCub(int cenCub) {
        this.cenCub = cenCub;
    }

    @Override // POLIMORFICO
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cenCub;
        return hash;
    }

    @Override // POLIMORFICO
    public boolean equals(Object obj) {
        // Así se comprobaría con la clase padre
        if (!super.equals(obj)) {
            return false;
        }
        // CONVERSIÓN EXPLICITA
        final MotorCoche other = (MotorCoche) obj;

        if (this.cenCub != other.cenCub) {
            return false;
        }
        return true;
    }

    // toString
    @Override // POLIMORFICO
    public String toString() {
        return super.toString() + "MotorCoche{" + "cenCub=" + cenCub + '}';
    }

    @Override // POLIMORFICO
    public void arrancar() { // metodoA
        System.out.println("Arrancando motor del coche...");
    }

    // MetodoB que solo exista en B(MotorCoche)
    public void cambiarAceite() {
        System.out.println("Cambiando aceite del motor del coche...(Sale negro)");
    }

    // Crea un método “metodoB2” en B que se vaya a sobrescribir en C y D. (vender)
    public void vender() {
        System.out.println("Vendiendo motor a presio amigo...");
    }

}
