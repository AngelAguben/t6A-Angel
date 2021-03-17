/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13;

import java.util.ArrayList;

/**
 *
 * @author Ángel
 */
public class PruebaAct13 {

    public static void main(String[] args) {
        ArrayList<Persona> gente = new ArrayList<>();

        gente.add(new Estudiante("0987", "Antonio", "González Pérez", "87562350Y", new Direccion("Sol", "Estepona", "29680", "España")));
        gente.add(new Estudiante("4635", "Carlos", "Collado Fernández", "23455467U", new Direccion("Luna", "Estepona", "29680", "España")));
        gente.add(new Profesor("Matemáticas", "Paco", "Jones", "32951847K", new Direccion("Maria", "Estepona", "29680", "España")));
        gente.add(new Profesor("Lengua", "María", "Pérez Ruiz", "98561822S", new Direccion("Av. Andalucía", "Estepona", "29680", "España")));

        for (Persona persona : gente) {
            persona.identificate();

            if (persona instanceof Estudiante) {
                System.out.println("ID del estudiante: " + ((Estudiante) persona).getIdEstudiante());

            }
            if (persona instanceof Profesor) {
                System.out.println("Especialidad del profesor: " + ((Profesor) persona).getEspecialidad());

            }
        }
    }
}
