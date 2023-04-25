/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class PersonaServicio {

    Persona p = new Persona();

    public Persona crearPersona() {
        /**
         * Método crearPersona que pida al usuario Nombre y fecha de nacimiento
         * de la persona a crear. Retornar el objeto Persona creado.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese fecha de nacimiento dia/mes/año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        p.setFechaNacimiento(dia, mes, anio);
        return p;
    }

    public int calcularEdad() {
        /**
         * Método calcularEdad que calcule la edad del usuario utilizando el
         * atributo de fecha de nacimiento y la fecha actual.
         */
        Date fechaActual = new Date();
        fechaActual.getTime();
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;
        long diferenciaEnMilisegundos = fechaActual.getTime() - p.getFechaNacimiento().getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
        //System.out.println("La edad es de : " + diferenciaEnAnos);
        return diferenciaEnAnos;
    }

    public boolean menorQue(Persona n1, int edad) {
        /**
         * Método menorQue recibe como parámetro una Persona y una edad. Retorna
         * true si la persona es menor que la edad consultada o false en caso
         * contrario.
         */
        return (calcularEdad() < edad);
    }

    public void mostrarPersona() {
        /**
         * Método mostrarPersona que muestra la información de la persona
         * deseada.
         */
        System.out.println(" Nombre : " + p.getNombre());
        System.out.println(" Edad : " + calcularEdad());
        System.out.println(" Fecha de Nacimieto : " + p.getFechaNacimiento());
    }

}
