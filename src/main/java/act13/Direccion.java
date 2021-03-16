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
public class Direccion {

    private String nombreCalle;
    private String nombreCiudad;
    private String codPostal;
    private String nombrePais;

    public Direccion(String nombreCalle, String nombreCiudad, String codPostal, String nombrePais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.codPostal = codPostal;
        this.nombrePais = nombrePais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombreCalle=" + nombreCalle + ", nombreCiudad=" + nombreCiudad + ", codPostal=" + codPostal + ", nombrePais=" + nombrePais + '}';
    }

}
