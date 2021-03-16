/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13;

/**
 *
 * @author angel
 */
public abstract class Persona implements Identificable{
    private String nombre;
    private String apellidos;
    private String NIF;
    private Direccion direccion;

    public Persona(String nombre, String apellidos, String NIF, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion + '}';
    }

//    @Override
//    public void identificate() {
//        for (Persona perso : col) {
//            
//        }
//    }
    
    
    
}
