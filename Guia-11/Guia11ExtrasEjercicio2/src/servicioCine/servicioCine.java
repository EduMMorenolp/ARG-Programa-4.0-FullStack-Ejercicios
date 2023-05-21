/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioCine;

import cine.Cine;
import espectador.Espectador;
import java.util.ArrayList;
import java.util.Random;
import peliculas.Peliculas;

/**
 *
 * @author no_de
 */
public class servicioCine {

    public Peliculas ingresarPelicula(Peliculas p) {

        System.out.println("---CARGANDO PELICULA---");

        System.out.println("Ingresando Nombre : Star Wars : The Clone Wars");
        p.setTituloP("Star Wars");
        System.out.println("Ingresando Director :  George Lucas");
        p.setDirectorP("George Lucas");
        System.out.println("Edad Minima : 18");
        p.setEdadminP(18);
        System.out.println("Duracion : 2 hs");
        p.setDuracionP(2);

        return p;
    }

    public ArrayList ingresarEspectador() {

        System.out.println("---CARGANDO ESPECTADORES---");
        
        /**
         * INGRESO MANUAL DE ESPECTADORES
         */

        Espectador e1 = new Espectador("Juan", 16, 10);
        Espectador e2 = new Espectador("Carla", 25, 20);
        Espectador e3 = new Espectador("Diana", 36, 5);
        Espectador e4 = new Espectador("Carlos", 42, 2);
        Espectador e5 = new Espectador("Pepe", 36, 100);
        Espectador e6 = new Espectador("Cereza", 18, 10);
        Espectador e7 = new Espectador("Pancho", 21, 10);
        Espectador e8 = new Espectador("Sofia", 60, 10);
        Espectador e9 = new Espectador("Edu", 38, 0);
        Espectador e10 = new Espectador("Manu", 38, 1000);
        Espectador e11 = new Espectador("Sergio", 55, 150);
        Espectador e12 = new Espectador("Claudia", 99, 99);

        ArrayList<Espectador> espectadores = new ArrayList<>();

        espectadores.add(e1);
        espectadores.add(e2);
        espectadores.add(e3);
        espectadores.add(e4);
        espectadores.add(e5);
        espectadores.add(e6);
        espectadores.add(e7);
        espectadores.add(e8);
        espectadores.add(e9);
        espectadores.add(e10);
        espectadores.add(e11);
        espectadores.add(e12);

        return espectadores;
    }

    public Cine inicioCine(Peliculas p) {

        Cine c = new Cine();

        ArrayList<Espectador> e = ingresarEspectador();

        Random random = new Random();
        String[][] salaC = new String[8][6];
        int fila, columna;

        System.out.println("--- INICIANDO EL CINE ---");

        c.setPeliculaC(p.getTituloP());
        System.out.println("Precio de la Pelicula : $ 3 USD");
        c.setPrecioC(3);

        for (int i = 0; i < salaC.length; i++) {
            for (int j = 0; j < salaC[i].length; j++) {
                salaC[i][j] = " ";
            }
        }

        for (Espectador espectador : e) {
            do {
                fila = random.nextInt(8);
                columna = random.nextInt(6);
            } while (!salaC[fila][columna].equals(" "));
            int edad = espectador.getEdadE();
            int dinero = espectador.getDineroE();
            String nombre = espectador.getNombreE();
            if (edad >= p.getEdadminP() && dinero >= c.getPrecioC()) {
                salaC[fila][columna] = "X";
                System.out.println("Se ha ubicado al espectador " + nombre
                        + " en el asiento " + (char) ('A' + columna) + (fila + 1));
            } else {
                System.out.println("El espectador " + nombre + " no cumple los requisitos para ver la película.");
            }
        }

        c.setSalaC(salaC);

        return c;
    }

    public void mostrarCine(Cine c) {

        for (int i = c.getSalaC().length - 1; i >= 0; i--) {
            for (int j = 0; j < c.getSalaC()[i].length; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " ");
                if (c.getSalaC()[i][j].equals(" ")) {
                    System.out.print("  ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println("  A B C D E F");
    }
}
