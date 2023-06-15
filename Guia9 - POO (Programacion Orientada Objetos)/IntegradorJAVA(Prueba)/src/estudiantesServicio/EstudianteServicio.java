/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantesServicio;

import estudiantes.Estudiantes;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class EstudianteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargaAlumnos(Estudiantes[] Alumnos) {
        int nota;
        String nombre;
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("Ingrese nombre del Estudiante N°: " + i + " = ");
            nombre = leer.next();
            System.out.println("Ingrese la Nota (N° entero) entre 1/10 del Estudiante N°: " + i + " = ");
            nota = leer.nextInt();
            do {
                if (nota < 1 || nota > 10) {
                    System.out.println("Ingreso mal la nota vuelva a ingresarla : ");
                    nota = leer.nextInt();
                }
            } while (nota < 1 || nota > 10);
            Alumnos[i] = new Estudiantes();
            Alumnos[i].setNombre(nombre);
            Alumnos[i].setNota(nota);
        }
    }
    public void mostrarPromedio(Estudiantes[] Alumnos) {
        /**
         * Calcular y mostrar el promedio de notas de todo el curso
         */
        double notas = 0;
        for (Estudiantes Alumno : Alumnos) {
            notas = notas + Alumno.getNota();
        }
        System.out.println("El Promedio de las notas del curso es de : " + (notas / Alumnos.length));
    }
    public Object[] mayorPromedio(Estudiantes[] Alumnos) {
        /**
         * Retornar otro arreglo con los nombre de los alumnos que recibieron
         * una nota mayor al promedio del curso
         */
        int notas = 0;
        int cont = 0;
        for (Estudiantes Alumno : Alumnos) {
            notas = notas + Alumno.getNota();
        }
        int promedio = notas / Alumnos.length;
        for (Estudiantes Alumno : Alumnos) {
            if (Alumno.getNota() >= promedio) {
                cont++;
            }
        }
        String[] nombresMayorPromedio = new String[cont];
        for (int i = 0; i < cont; i++) {
            if (Alumnos[i].getNota() >= promedio) {
                nombresMayorPromedio[i] = Alumnos[i].getNombre();
            }
        }
        return nombresMayorPromedio;
    }
    public void mejoresAlumnos(Object[] nombresAlumnos) {
        /**
         * Por último, deberemos mostrar todos los estudiantes con una nota
         * mayor al promedio.
         */
        System.out.println("Nombres de los Mejores Alumnos : ");
        for (Object nombresAlumno : nombresAlumnos) {
            System.out.println("Alumno : " + nombresAlumno);
        }
    }
}
