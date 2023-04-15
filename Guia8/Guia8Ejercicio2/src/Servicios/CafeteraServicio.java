/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author no_de */
public class CafeteraServicio {

    /**
     * Metodo llenarCafetera() Metodo servirTaza(int) Método vaciarCafetera()
     * Método agregarCafe(int)
     */
    Scanner leer = new Scanner(System.in);
    
    
    
    public void llenarCafetera(Cafetera cafe) {
        System.out.println("Cafetera LLENA ...");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());    
    }

    public int servirTaza(Cafetera cafe) {
        /**
         * Método servirTaza(int): se pide el tamaño de una taza vacía, el
         * método recibe el tamaño de la taza y simula la acción de servir la
         * taza con la capacidad indicada. Si la cantidad actual de café “no
         * alcanza” para llenar la taza, se sirve lo que quede. El método le
         * informará al usuario si se llenó o no la taza, y de no haberse
         * llenado en cuanto quedó la taza.
         */
        System.out.println("Ingrese el tamaño de la taza :");
        int taza = leer.nextInt();
        System.out.println("-- LLENANDO SU TAZA AGUARDE --");
        
        cafe.setCantidadActual(cafe.getCantidadActual()-taza);
        
        return taza;
    }

    public void vaciarCafetera(Cafetera cafe) {
        System.out.println("Vaciando la Cafetera ... ");
        cafe.setCantidadActual(0);
    }

    public int agregarCafe(Cafetera cafe ) {
        
       int cantCafe;
        System.out.println("Capacidad Actual es de : " + cafe.getCantidadActual());
        System.out.println("Ingrese Cantidad de Cafe que va Agregar : ");
        cantCafe = leer.nextInt();
        if (cafe.getCantidadActual() + cantCafe > cafe.getCapacidadMaxima()) {
            System.out.println("Capacidad Maxima Exedida por : " + (cafe.getCantidadActual() + cantCafe - cafe.getCapacidadMaxima()));
        } else {
            System.out.println("Se agrego el Cafe, Capacidad Actual : ");
            cafe.setCantidadActual(cafe.getCantidadActual() + cantCafe); 
        }
    return cafe.getCantidadActual();
    }
}
