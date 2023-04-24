/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class FechaServicio {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        /**
         * Método fechaNacimiento que pregunte al usuario día, mes y año de su
         * nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El
         * método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new
         * Date(anio, mes, dia);
         */

        System.out.println("Ingrese el AÑO de nacimiento : ");
        int anio = leer.nextInt();
        System.out.println("Ingrese el MES de nacimiento : ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el DIA de nacimiento : ");
        int dia = leer.nextInt();
        // Creacion del Obejeto.
        Date fechaNacimiento = new Date((anio - 1900), (mes - 1), dia);
        return fechaNacimiento;
    }

    public Date fechaActual() {
        /**
         * Método fechaActual que cree un objeto fecha con el día actual. Para
         * esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
         * fechaActual = new Date(); El método debe retornar el objeto Date.
         */
        Date fechaActual = new Date();
        //System.out.println(""+ fechaActual);
        return fechaActual;
    }

    public int Diferencia(Date fechaActual, Date fechaNaciemiento) {
        /**
         * Método diferencia que reciba las dos fechas por parámetro y retorna
         * la diferencia de años entre una y otra (edad del usuario).
         */
        /**
         * getTime() Returns the number of milliseconds since January 1, 1970,
         * 00:00:00 GMT represented by this Date object.
         */
        //System.out.println(fechaActual);
        //System.out.println(fechaNaciemiento);
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L; // milisegundos por año
        long diferenciaEnMilisegundos = fechaActual.getTime() - fechaNaciemiento.getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
        return diferenciaEnAnos;
    }
}
