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
public class Estudiante extends Persona {

    private String idEstudiante;

    public Estudiante(String idEstudiante, String nombre, String apellidos, String NIF, Direccion direccion) {
        super(nombre, apellidos, NIF, direccion);
        this.idEstudiante = idEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "idEstudiante=" + idEstudiante + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Identificarse como estudiante");
    }
}
