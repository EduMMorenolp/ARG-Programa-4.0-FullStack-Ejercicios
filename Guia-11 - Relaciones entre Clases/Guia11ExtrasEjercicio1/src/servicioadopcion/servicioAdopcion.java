/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioadopcion;

import java.util.ArrayList;
import java.util.Scanner;
import perro.Perro;
import persona.Persona;

/**
 *
 * @author no_de
 */
public class servicioAdopcion {

    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Perro> perros = new ArrayList<>();

    public Persona agregarPersona(Persona p) {

        Scanner leerP = new Scanner(System.in);

        System.out.println("[PERSONA] Ingrese los Siguientes Datos : ");
        System.out.println("Nombre : ");
        String nombre = leerP.nextLine();
        System.out.println("Apellido : ");
        String apellido = leerP.nextLine();
        System.out.println("Edad :");
        int edad = leerP.nextInt();
        System.out.println("DNI :");
        int dni = leerP.nextInt();

        p.setNombre(nombre);
        p.setApeliido(apellido);
        p.setEdad(edad);
        p.setDni(dni);
        return p;
    }

    public Perro agregarPerros(Perro d) {

        Scanner leerP2 = new Scanner(System.in);

        System.out.println("[PERRO] Ingrese los Siguientes Datos : ");
        System.out.println("Nombre : ");
        String nombre = leerP2.nextLine();
        System.out.println("Raza : ");
        String raza = leerP2.nextLine();
        System.out.println("Tamaño : ");
        String tamanio = leerP2.nextLine();
        System.out.println("Edad :");
        int edad = leerP2.nextInt();

        d.setNombre(nombre);
        d.setRaza(raza);
        d.setTamanio(tamanio);
        d.setEdad(edad);
        return d;
    }

    public void listaPersonas() {

        Scanner leerLP = new Scanner(System.in);
        String resp2;

        Perro perroVacio = new Perro();

        Persona p1 = new Persona("Carlos", "Pelado", 32777999, 43, perroVacio);
        Persona p2 = new Persona("Diana", "Cortina", 17555666, 14, perroVacio);
        Persona p3 = new Persona("Cesia", "Cruz", 32666666, 37, perroVacio);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println("Desea Agregar Una Persona = S/N : ");
        String resp = leerLP.nextLine().toUpperCase();
        if (resp.equals("S")) {
            do {
                Persona p0 = new Persona();
                personas.add(agregarPersona(p0));

                System.out.println("Desea Agregar otro Persona ? S/N");
                resp2 = leerLP.next().toUpperCase();
            } while (resp2.equals("S"));
        }
        System.out.println("---LISTA PERSONAS---");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        System.out.println("\n");
    }

    public void listaPerros() {

        Scanner leer = new Scanner(System.in);

        Perro p1 = new Perro("Jokina", "Galgo", 4, "Mediano");
        Perro p2 = new Perro("Chiquito", "Beagle", 1, "Chico");

        perros.add(p1);
        perros.add(p2);

        String resp2;

        System.out.println("Desea Agregar Un Perro ? S/N : ");
        String resp = leer.nextLine().toUpperCase();
        if (resp.equals("S")) {
            do {
                Perro p0 = new Perro();
                perros.add(agregarPerros(p0));
                System.out.println("Desea Agregar otro Perro ? S/N");
                resp2 = leer.next().toUpperCase();
            } while (resp2.equals("S"));
        }
        System.out.println("---LISTA PERROS---");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        System.out.println("\n");
    }

    public void adoptarPerro() {

        Scanner leer = new Scanner(System.in);

        Perro dog = new Perro("Vacio", "Vacio", 0, "Vacio");

        for (Persona persona : personas) {

            System.out.println(persona.getNombre() + " Desea Adoptar ? S/N :");
            String resp = leer.nextLine().toUpperCase();
            if (resp.equals("S")) {

                System.out.println("---LISTA PERROS PARA ADOPTAR---");
                for (Perro perro : perros) {
                    System.out.println(perro);
                }
                System.out.println("Elija el NOMBRE del PERRO para Adoptar :");
                String adop = leer.nextLine();
                System.out.println("\n");
                for (Perro perro : perros) {
                    if (perro.getNombre().equals(adop)) {
                        if (perro.isAdoptado()) {
                            System.out.println("Este Perro ya fue adoptado, Disculpe");
                            break;
                        } else {
                            persona.setPerro(perro);
                            perro.setAdoptado(true);

                            break;
                        }
                    }
                }

            }
        }
        System.out.println("\n");
        System.out.println("---LISTA PERSONAS---");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
