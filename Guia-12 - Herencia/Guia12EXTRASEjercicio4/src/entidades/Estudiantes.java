/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
public class Estudiantes extends Persona {
    private int matricula;

    public Estudiantes() {
    }

    public Estudiantes(int matricula, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(nombre, apellidos, estadoCivil, numIdentificacion);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {

        return super.toString() + "Estudiantes{" + "matricula=" + matricula + '}';

    }
    
    
}
