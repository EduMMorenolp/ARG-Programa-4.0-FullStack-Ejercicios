/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio5;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/**
 *
 * @author no_de
 */
public class Guia9Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Implemente la clase Persona en el paquete entidades. Una persona
         * tiene un nombre y una fecha de nacimiento (Tipo Date), constructor
         * vacío, constructor parametrizado, get y set. Crear una clase
         * PersonaService, en el paquete servicio, con los siguientes métodos:
         * Método crearPersona que pida al usuario Nombre y fecha de nacimiento
         * de la persona a crear. Retornar el objeto Persona creado. Método
         * calcularEdad que calcule la edad del usuario utilizando el atributo
         * de fecha de nacimiento y la fecha actual. Método menorQue recibe como
         * parámetro una Persona y una edad. Retorna true si la persona es menor
         * que la edad consultada o false en caso contrario. Método
         * mostrarPersona que muestra la información de la persona deseada.
         */
        Scanner leer = new Scanner(System.in);
        PersonaServicio p1 = new PersonaServicio(); 
        Persona per1 = p1.crearPersona();
        System.out.println(" Ingrese una edad para comparar si es > O < a la deseada");
        int edad = leer.nextInt();
        p1.mostrarPersona();
         if (p1.menorQue(per1, edad)){
            System.out.println(" Es menor que la edad igresada");
        }else{
            System.out.println(" Es mayor que la edad ingresada");
        }
        
    }

}
