/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio3;

import baraja.Baraja;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia11Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Realizar una baraja de cartas españolas orientada a objetos. Una
         * carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y
         * un palo (espadas, bastos, oros y copas). Esta clase debe contener un
         * método toString() que retorne el número de carta y el palo. La baraja
         * estará compuesta por un conjunto de cartas, 40 exactamente. Las
         * operaciones que podrá realizar la baraja son: • barajar(): cambia de
         * posición todas las cartas aleatoriamente. • siguienteCarta():
         * devuelve la siguiente carta que está en la baraja, cuando no haya más
         * o se haya llegado al final, se indica al usuario que no hay más
         * cartas. • cartasDisponibles(): indica el número de cartas que aún se
         * puede repartir. • darCartas(): dado un número de cartas que nos
         * pidan, le devolveremos ese número de cartas. En caso de que haya
         * menos cartas que las pedidas, no devolveremos nada, pero debemos
         * indicárselo al usuario. • cartasMonton(): mostramos aquellas cartas
         * que ya han salido, si no ha salido ninguna indicárselo al usuario •
         * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir,
         * si se saca una carta y luego se llama al método, este no mostrara esa
         * primera carta.
         */
        Baraja baraja = new Baraja();
        Scanner leer = new Scanner(System.in);
        int var;
        System.out.println("---JUEGO DE CARTAS---");
        do {
            System.out.println("\n Elija una opcion de la baraja :");
            System.out.println("OPCION 1 : crearBaraja \n"
                    + "OPCION 2 : Barajar Cartas \n"
                    + "OPCION 3 : Siguiente Carta \n"
                    + "OPCION 4 : Cartas Disponibles \n"
                    + "OPCION 5 : Dar Cartas \n"
                    + "OPCION 6 : Cartas del Monton \n"
                    + "OPCION 7 : Mostrar Baraja \n"
                    + "OPCION 0 : Salir \n");
            var = leer.nextInt();
            switch (var) {
                case 1:
                    baraja.crearBaraja();
                    break;
                case 2:
                    baraja.barajarCartas();
                    break;
                case 3:
                    baraja.siguienteCarta();
                    break;
                case 4:
                    int cartasDisponibles = baraja.cartasDisponibles();
                    System.out.println("Las cartas Diponibles son : "+ cartasDisponibles);
                    break;
                case 5:
                    baraja.darCartas();
                    break;
                case 6:
                    baraja.cartasMonton();
                    break;
                case 7:
                    baraja.mostrarBaraja();
                    break;
                case 0:
                    System.out.println("Adios.. vuelva pronto.");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        } while (var != 0);
    }
}
