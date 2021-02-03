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
public abstract class Motor { // Clase A

    private int cilindros; // Cilindros del motor
    private int combus; // Combustible del motor

    public Motor() {
    }

    public Motor(int cilindros, int combus) {
        this.cilindros = cilindros;
        this.combus = combus;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getCombus() {
        return combus;
    }

    public void setCombus(int combus) {
        this.combus = combus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cilindros;
        hash = 59 * hash + this.combus;
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
        final Motor other = (Motor) obj;
        if (this.cilindros != other.cilindros) {
            return false;
        }
        if (this.combus != other.combus) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindros=" + cilindros + ", combus=" + combus + '}';
    }

    // Método que sobrescribiremos en las clases hijas
    public void arrancar() { // metodoA
        System.out.println("Arrancando motor...");
    }

}
