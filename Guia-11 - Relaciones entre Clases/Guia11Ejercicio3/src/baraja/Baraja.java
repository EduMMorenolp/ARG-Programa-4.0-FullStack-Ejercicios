/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja;

import carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList<>();
    private ArrayList<Carta> barajaMonton = new ArrayList<>();
    private Carta carta;

    public void crearBaraja() {
        System.out.println("---ARMANDO BARAJA ESPAÑOLA---");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                carta = new Carta();
                switch (i) {
                    case 0:
                        carta.setPalo("Espada");
                        break;
                    case 1:
                        carta.setPalo("Basto");
                        break;
                    case 2:
                        carta.setPalo("Oro");
                        break;
                    case 3:
                        carta.setPalo("Copa");
                        break;
                }
                carta.setNumero(j);
                if (j != 8 && j != 9) {
                    baraja.add(carta);
                }
            }
        }
    }

    public void barajarCartas() {
        /**
         * cambia de posición todas las cartas aleatoriamente.
         */
        System.out.println("---BRAJANDO CARTAS---");
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        /**
         * devuelve la siguiente carta que está en la baraja, cuando no haya más
         * o se haya llegado al final, se indica al usuario que no hay más
         * cartas.
         */
        if (baraja.isEmpty()) {
            System.out.println("No hay mas Cartas");
        } else {
            for (Carta cartaS : baraja) {
                System.out.println("Su Carta Nueva es : \n" + cartaS);
                barajaMonton.add(cartaS);
                baraja.remove(cartaS);
                break;
            }
        }

    }

    public int cartasDisponibles() {
        /**
         * indica el número de cartas que aún se puede repartir.
         */
        return baraja.size();
    }

    public void darCartas() {
        /**
         * dado un número de cartas que nos pidan, le devolveremos ese número de
         * cartas. En caso de que haya menos cartas que las pedidas, no
         * devolveremos nada, pero debemos indicárselo al usuario.
         */
        Scanner leer = new Scanner(System.in);
        int cantCartass;
        System.out.println("Cuantas cartas desea ? : ");
        cantCartass = leer.nextInt();
        if (cantCartass > baraja.size()) {
            System.out.println("No hay cartas suficientes...");
        } else {
            System.out.println("Sus Cartas Nuevas son : \n");
            for (int i = 0; i < cantCartass; i++) {
                for (Carta auxd : baraja) {
                    System.out.println(auxd);
                    barajaMonton.add(auxd);
                    baraja.remove(auxd);
                    break;

                }
            }

        }
    }

    public void cartasMonton() {
        /**
         * mostramos aquellas cartas que ya han salido, si no ha salido ninguna
         * indicárselo al usuario
         */
        System.out.println("--- CARTAS DEL MONTON ---");
        for (Carta cartaM : barajaMonton) {
            if (barajaMonton.isEmpty()) {
                System.out.println("No hay cartas en el Monton");
            } else {
                System.out.println(cartaM);
            }
        }
    }

    public void mostrarBaraja() {
        /**
         * muestra todas las cartas hasta el final. Es decir, si se saca una
         * carta y luego se llama al método, este no mostrara esa primera carta.
         */
        System.out.println("--- BARAJA ---");
        for (Object auxM : baraja) {
            System.out.println(auxM);
        }
    }

}
