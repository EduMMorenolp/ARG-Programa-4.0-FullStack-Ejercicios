/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicioextras;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3EjerEXTRAS_5 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Una obra social tiene tres clases de socios:
        Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
        Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
        Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
        Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
        y determine el importe en efectivo a pagar por dicho socio.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la clase del socio (A/B/C): ");
        char clase = input.nextLine().charAt(0);
        
        System.out.print("Ingrese el costo del tratamiento: ");
        double costo = input.nextDouble();

        double descuento = 0.0;
        switch (clase) {
            case 'A':
                descuento = 0.5;
                break;
            case 'B':
                descuento = 0.35;
                break;
            case 'C':
                descuento = 0.0;
                break;
            default:
                System.out.println("La clase de socio ingresada no es válida.");
                return;
        }

        double importePagar = costo * (1 - descuento);
        System.out.println("El importe a pagar es: " + importePagar);
    }
}

