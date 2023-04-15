/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Programa Nespresso. Desarrolle una clase Cafetera en el paquete
         * Entidades con los atributos capacidadMáxima (la cantidad máxima de
         * café que puede contener la cafetera) y cantidadActual (la cantidad
         * actual de café que hay en la cafetera). Agregar constructor vacío y
         * con parámetros así como setters y getters.
         * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
         * Método llenarCafetera(): hace que la cantidad actual sea igual a la
         * capacidad máxima.
         * Método servirTaza(int): se pide el tamaño de una
         * taza vacía, el método recibe el tamaño de la taza y simula la acción
         * de servir la taza con la capacidad indicada. Si la cantidad actual de
         * café “no alcanza” para llenar la taza, se sirve lo que quede.
         * El método le informará al usuario si se llenó o no la taza, y de no
         * haberse llenado en cuanto quedó la taza.
         * Método vaciarCafetera(): pone la cantidad de café actual en cero.
         * Método agregarCafe(int): se le pide al usuario una cantidad de café,
         * el método lo recibe y se añade a la cafetera la cantidad de
         * café indicada.
         */
        
        CafeteraServicio Unidad1 = new CafeteraServicio();
        Cafetera cafe = new Cafetera();
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("MENU : \n"
                + "OPCION 1 - Llenar cafetera \n"
                + "OPCION 2 - Vaciar cafetera \n"
                + "OPCION 3 - Servir taza \n"
                + "OPCION 4 - Agregar cafe \n"
                + "OPCION 5 - Salir");
        
        int var;
        
        do {
            System.out.println(" Que desea realizar ? ");
            var = leer.nextInt();
        switch (var) {
            
            case 1:
                Unidad1.llenarCafetera(cafe);
                continue;
            case 2:
                Unidad1.vaciarCafetera(cafe);
                continue;
            case 3:
                Unidad1.servirTaza(cafe);
                continue;
            case 4:
                int CA = Unidad1.agregarCafe(cafe);
                System.out.println(CA);  
                continue;
            case 5:
                System.out.println("Adios....");
                break;
        }
        } while (var != 5); 
        
    } 
}
