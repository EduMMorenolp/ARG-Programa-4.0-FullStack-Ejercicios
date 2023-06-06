/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extrasejercicio1Main;

import Puerto.Alquiler;
import barcos.entidades.Barcos;
import barcos.entidades.BarcosMotor;
import barcos.entidades.Veleros;
import barcos.entidades.YatesdeLujo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author no_de
 */
public class Guia12EXTRASEjercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * En un puerto se alquilan amarres para barcos de distinto tipo. Para
         * cada Alquiler se guarda: el nombre, documento del cliente, la fecha
         * de alquiler, fecha de devolución, la posición del amarre y el barco
         * que lo ocupará. Un Barco se caracteriza por: su matrícula, su eslora
         * en metros y año de fabricación. Sin embargo, se pretende diferenciar
         * la información de algunos tipos de barcos especiales: • Número de
         * mástiles para veleros. 
         * • Potencia en CV para barcos a motor. •
         * Potencia en CV y número de camarotes para yates de lujo. Un alquiler
         * se calcula multiplicando el número de días de ocupación (calculado
         * con la fecha de alquiler y devolución), por un valor módulo de cada
         * barco (obtenido simplemente multiplicando por 10 los metros de
         * eslora). En los barcos de tipo especial el módulo de cada barco se
         * calcula sacando el módulo normal y sumándole el atributo particular
         * de cada barco. En los veleros se suma el número de mástiles, en los
         * barcos a motor se le suma la potencia en CV y en los yates se suma la
         * potencia en CV y el número de camarotes. Utilizando la herencia de
         * forma apropiada, deberemos programar en Java, las clases y los
         * métodos necesarios que permitan al usuario elegir el barco que quiera
         * alquilar y mostrarle el precio final de su alquiler
         */
        
        Barcos barco1 = new Barcos(10, 19817, LocalDate.of(1999,6,5));
        Veleros barco2 = new Veleros(2, 10, 12654, LocalDate.of(1986,10,4));
        YatesdeLujo barco3 = new YatesdeLujo(3, 100, 10, 1654, LocalDate.of(1986,6,4));
        BarcosMotor barco4 = new BarcosMotor(25, 10, 12658, LocalDate.of(1977,6,4));
        
        ArrayList<Barcos> listaBarcos = new ArrayList<>();
        listaBarcos.add(barco1);
        listaBarcos.add(barco2);
        listaBarcos.add(barco3);
        listaBarcos.add(barco4);
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("--- BIENVENIDO A BARCOS PEPITO ---");
        
        
        System.out.println("Barcos Disponibles de Alquiler : ");
        for (Barcos barcoUnidad : listaBarcos) {
            System.out.println(barcoUnidad.toString());
            int valor = barcoUnidad.modulo();
            System.out.println("El Precio es : " + valor);
            System.out.println("Desea Alquilar este Barco ? S/N :");
            String resp = leer.next();
            if (resp.equals("S")){
                Alquiler nuevoAlquiler = new Alquiler();
                nuevoAlquiler.crearAlguiler(barcoUnidad);
            }
        }
    }

}
