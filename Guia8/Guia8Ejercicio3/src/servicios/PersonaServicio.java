/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class PersonaServicio {

    public PersonaServicio() {
        
    }
    
    public String getNombre(Persona n){
        return n.getNombre();
    }
    
    public boolean esMayorDeEdad(Persona n) {
        /*
          Método esMayorDeEdad(): indica si la persona es mayor de edad.
          La función devuelve un booleano.
         */
        return (n.getEdad() >= 18);
    }

    public Persona crearPersona() {
        /*
        Metodo crearPersona(): el método crear persona, le pide los valores de
        los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Persona. Además, comprueba que el
        sexo introducido sea correcto, es decir, H, M o O. Si no es correcto 
        se deberá mostrar un mensaje
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el Nombre :");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el Edad :");
        int edad = leer.nextInt();

        System.out.println("Ingrese el Sexo H/M/O : ");
        
        String sexo = leer.next();
        
        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println(" Usted Ingreso mal el Sexo, vuelva a ingresarlo :");
            sexo = leer.nextLine();
        } 
     
        
        System.out.println("Ingrese el Peso :");
        int peso = leer.nextInt();

        System.out.println("Ingrese el Altura en Centimetros :");
        int altura = leer.nextInt();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona n) {
        /**
         * Método calcularIMC(): calculara si la persona está en su peso ideal
         * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
         * valor menor que 20, significa que la persona está por debajo de su
         * peso ideal y la función devuelve un -1. Si la fórmula da por
         * resultado un número entre 20 y 25 (incluidos), significa que la
         * persona está en su peso ideal y la función devuelve un 0. Finalmente,
         * si el resultado de la fórmula es un valor mayor que 25 significa que
         * la persona tiene sobrepeso, y la función devuelve un 1.
         */
        int Peso = n.getPeso();
        int Altura =  n.getAltura();
        int IMC = 2;
        
        if ( Peso/(Altura*Altura) < 20 ){
            IMC = -1;  
        }
        if (Peso/(Altura*Altura) >= 20 && Peso/(Altura*Altura) <= 25){
            IMC = 0;  
        }
        if ( Peso/(Altura*Altura) > 25 ){
            IMC = 1;  
        }
        return IMC;        
    }

}
