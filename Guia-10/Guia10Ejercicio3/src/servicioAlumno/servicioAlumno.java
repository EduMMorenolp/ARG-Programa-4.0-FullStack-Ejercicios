/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioAlumno;

import alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class servicioAlumno {

    Scanner leer = new Scanner(System.in);
    ArrayList<Object> Alumnos = new ArrayList<>();

    public Alumno datosAlumno() {
        ArrayList<Integer> notas = new ArrayList<>(3);
        Alumno Alumno = new Alumno();
        String nombre;

        System.out.println("Ingrese nombre Alumno : ");
        nombre = leer.nextLine();
        Alumno.setNombre(nombre);

        System.out.println("Ingrese las Notas del Alumno : ");
        for (int i = 0; i < 3; i++) {
            notas.add(leer.nextInt());
            leer.nextLine();
            /**
             * leer.nextLine();
             * consume el final de línea para correjir el que se muestre dos
             * veces. "Ingrese las Notas del Alumno : "
             */
        }
        Alumno.setNotas(notas);

        return Alumno;
    }

    public void crearAlumnos() {
        System.out.println("----BIENVENIDO----");
        String respuesta;
        do {
            System.out.println("Desea Ingresar un Alumno ? S/N : ");
            respuesta = leer.nextLine().toUpperCase();
            if ("S".equals(respuesta)) {
                Alumnos.add(datosAlumno());
            }
        } while (!"N".equals(respuesta));
        System.out.println(Alumnos.toString());
    }

    public void notaFinal() {
        System.out.println("---SACANDO PROMEDIO DE ALUMNOS---");
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno : ");
            String nombre = leer.nextLine();
            boolean encontrado = false;
            for (Object obj : Alumnos) {
                Alumno alumno = (Alumno) obj;
                if (alumno.getNombre().equals(nombre)) {
                    ArrayList<Integer> notas = alumno.getNotas();
                    int suma = 0;
                    for (int nota : notas) {
                        suma += nota;
                    }
                    double promedio = suma / (double) notas.size();
                    System.out.println("La nota final de " + nombre + " es: " + promedio);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Alumno no encontrado.");
            }
            System.out.println("Desea saber la nota de otro alumno? S/N");
            respuesta = leer.nextLine().toUpperCase();
        } while (!respuesta.equals("N"));
    }
}
