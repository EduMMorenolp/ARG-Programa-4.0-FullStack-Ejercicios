/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduraServicio;

import Entidades.Botas;
import Entidades.Cascos;
import Entidades.Esqueleto;
import Entidades.Generador;
import Entidades.Guantes;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class armaduraServicios extends Esqueleto {

    public Esqueleto crearArmadura() {

        Esqueleto armadura = new Esqueleto();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- CREACION DE ARMADURA --");

        // Menú de opciones
        System.out.println("Seleccione una opción:");
        System.out.println("1. Creación manual");
        System.out.println("2. Creación automática");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                armadura = crearArmaduraManual();
                break;
            case 2:
                armadura = crearArmaduraAutomatica();
                break;
            default:
                System.out.println("Opción inválida. Se creará la armadura de forma automática.");
                armadura = crearArmaduraAutomatica();
                break;
        }

        // Mostrar información de la armadura creada
        System.out.println("Información de la Armadura:");
        System.out.println(armadura.toString());
        System.out.println();

        return armadura;

    }

    // Método para la creación automática de la armadura
    private Esqueleto crearArmaduraAutomatica() {
        Esqueleto armadura = new Esqueleto();

        System.out.println("-- CREACION AUTOMATICA DE ARMADURA --");

        // Creación de los objetos necesarios para las armaduras
        Botas botaIzquierda = new Botas(true);
        Botas botaDerecha = new Botas(true);
        Guantes guanteIzquierdo = new Guantes(50, true);
        Guantes guanteDerecho = new Guantes(60, true);
        Cascos casco = new Cascos(true);
        Generador bateria = new Generador(100, true);

        // Ingresar nombre de la armadura
        System.out.print("Nombre de la armadura: ");
        String nombreArmadura = "Armadura Automática";
        armadura.setNombreArmadura(nombreArmadura);

        // Ingresar color primario
        System.out.print("Color primario: ");
        String colorPrimario = "Rojo";
        armadura.setColorPrimario(colorPrimario);

        // Ingresar color secundario
        System.out.print("Color secundario: ");
        String colorSecundario = "Negro";
        armadura.setColorSecundario(colorSecundario);

        // Ingresar resistencia
        System.out.print("Resistencia: ");
        int resistencia = 150;
        armadura.setResistencia(resistencia);

        // Asignar los objetos a la armadura
        armadura.setBotaIzquierda(botaIzquierda);
        armadura.setBotaDerecha(botaDerecha);
        armadura.setGuanteIzquierdo(guanteIzquierdo);
        armadura.setGuanteDerecho(guanteDerecho);
        armadura.setCasco(casco);
        armadura.setBateria(bateria);

        return armadura;
    }

    // Método para la creación manual de la armadura
    private Esqueleto crearArmaduraManual() {
        Esqueleto armadura = new Esqueleto();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- CREACION MANUAL DE ARMADURA --");

        // Ingresar nombre de la armadura
        System.out.print("Nombre de la armadura: ");
        String nombreArmadura = leer.next();
        armadura.setNombreArmadura(nombreArmadura);

        // Ingresar color primario
        System.out.print("Color primario: ");
        String colorPrimario = leer.next();
        armadura.setColorPrimario(colorPrimario);

        // Ingresar color secundario
        System.out.print("Color secundario: ");
        String colorSecundario = leer.next();
        armadura.setColorSecundario(colorSecundario);

        // Ingresar resistencia
        System.out.print("Resistencia: ");
        int resistencia = leer.nextInt();
        armadura.setResistencia(resistencia);

        // Creación de los objetos necesarios para las armaduras
        Botas botaIzquierda = new Botas(true);
        Botas botaDerecha = new Botas(true);

        // Ingresar daño de los guantes izquierdo y derecho
        System.out.print("Daño del guante izquierdo: ");
        int danioGuanteIzquierdo = leer.nextInt();
        Guantes guanteIzquierdo = new Guantes(danioGuanteIzquierdo, true);

        System.out.print("Daño del guante derecho: ");
        int danioGuanteDerecho = leer.nextInt();
        Guantes guanteDerecho = new Guantes(danioGuanteDerecho, true);

        Cascos casco = new Cascos(true);

        // Ingresar capacidad del generador
        System.out.print("Capacidad del generador: ");
        float capacidadGenerador = leer.nextFloat();
        Generador bateria = new Generador(capacidadGenerador, true);

        // Asignar los objetos a la armadura
        armadura.setBotaIzquierda(botaIzquierda);
        armadura.setBotaDerecha(botaDerecha);
        armadura.setGuanteIzquierdo(guanteIzquierdo);
        armadura.setGuanteDerecho(guanteDerecho);
        armadura.setCasco(casco);
        armadura.setBateria(bateria);

        return armadura;
    }

}
