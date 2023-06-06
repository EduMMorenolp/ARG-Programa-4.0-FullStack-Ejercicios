/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto;

import barcos.entidades.Barcos;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Alquiler {

    private String nombre;

    private int clienteDni;

    private LocalDate fechaAlquiler = LocalDate.now();

    private LocalDate fechaDevolucion = LocalDate.now();

    private int posAmarre;

    private Barcos Barco;
    
    
    public void crearAlguiler(Barcos BarcoAlquilado){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
        
        System.out.println(" INGRESE DATOS DEL CLIENTE ");
        System.out.println("Ingrese su nombre : ");
        nombre = leer.next();
        System.out.println("Ingrese el DNI : ");
        clienteDni = leer.nextInt();
        System.out.println("Ingrese fecha de Alguiler Año : ");
        int anio = leer.nextInt();
        System.out.println("Ingrese fecha de Alguiler Mes : ");
        int mes = leer.nextInt();
        System.out.println("Ingrese fecha de Alguiler Dia : ");
        int dia = leer.nextInt();
        fechaAlquiler = LocalDate.of(anio,mes,dia);
        System.out.println("Ingrese fecha de Devolucion Año : ");
        int anio1 = leer.nextInt();
        System.out.println("Ingrese fecha de Devolucion Mes : ");
        int mes1 = leer.nextInt();
        System.out.println("Ingrese fecha de Devolucion Dia : ");
        int dia1 = leer.nextInt();
        fechaDevolucion = LocalDate.of(anio1,mes1,dia1);
        System.out.println("Ingrese la Posicion del Amarre : ");
        posAmarre = leer.nextInt();
        System.out.println("-- INGRESANDO EL BARCO --");
        Barco = BarcoAlquilado;
        
    }
    

    public int precioAlguiler() {

        /**
         * Un alquiler se calcula multiplicando el número de días de ocupación
         * (calculado con la fecha de alquiler y devolución)
         */
        int precio;
        int dias = diasAlquiler();
        int eslora = Barco.modulo();
        precio = eslora * dias;
        
        return precio;
    }
    
    public int diasAlquiler(){
        int dias;
        
        dias = fechaDevolucion.getDayOfYear() - fechaAlquiler.getDayOfYear(); 
        
        return dias;
    }

    public Alquiler() {
    }

    public Alquiler(String nombre, int clienteDni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barcos Barco) {
        this.nombre = nombre;
        this.clienteDni = clienteDni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.Barco = Barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(int clienteDni) {
        this.clienteDni = clienteDni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barcos getBarco() {
        return Barco;
    }

    public void setBarco(Barcos Barco) {
        this.Barco = Barco;
    }

}
