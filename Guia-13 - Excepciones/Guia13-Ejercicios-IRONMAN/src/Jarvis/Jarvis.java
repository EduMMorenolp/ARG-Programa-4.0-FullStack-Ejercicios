/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarvis;

import Entidades.Esqueleto;
import java.util.Random;

/**
 *
 * @author no_de
 */
public class Jarvis extends Esqueleto {

    public void estadoDispositivos() {
        /**
         * Mostrando Estado Hacer un método que JARVIS muestre el estado de
         * todos los dispositivos y toda la información de la Armadura.
         */
        System.out.println(" -- INFORMACION DE LA ARMADURA -- ");
        super.toString();
        System.out.println(" -- ESTADO DE LA ARMADURA -- ");
        if (super.bateria.isEstado()) {
            System.out.println(" Bateria estado : Funcionando");
        } else {
            System.out.println(" Bateria estado : Roto ");
        }
        if (super.casco.isEstado()) {
            System.out.println(" Casco estado : Funcionando");
        } else {
            System.out.println(" Casco estado : Roto ");
        }
        if (super.botaDerecha.isEstado()) {
            System.out.println(" Bota Derecha estado : Funcionando");
        } else {
            System.out.println(" Bota Derecha : Roto ");
        }
        if (super.botaIzquierda.isEstado()) {
            System.out.println(" Bota Izquierda estado : Funcionando");
        } else {
            System.out.println(" Bota Izquierda : Roto ");
        }
        if (super.guanteIzquierdo.isEstado()) {
            System.out.println(" Guante Izquierda estado : Funcionando");
        } else {
            System.out.println(" Guante Izquierda : Roto ");
        }
        if (super.guanteDerecho.isEstado()) {
            System.out.println(" Guante Derecho estado : Funcionando");
        } else {
            System.out.println(" Guante Derecho : Roto ");
        }
    }

    public void estadoBaterias() {
        /**
         * Estado de la Batería Hacer un método para que JARVIS informe el
         * estado de la batería en porcentaje a través de la consola. Poner como
         * carga máxima del reactor el mayor float posible. Ejecutar varias
         * acciones y mostrar el estado de la misma.
         */

        System.out.println(" -- ESTADO DE LA BATERIA -- ");
        float energiaTT = super.bateria.getEnergiaTT();
        float energiaConsumida = super.bateria.getEnergiaTotal();
        float porcentaje = (energiaConsumida / energiaTT) * 100;
        System.out.println("Porcentaje de energía consumida: " + porcentaje + "%");
    }

    public void estadoReactor() {
        /**
         * Hacer un método para que JARVIS informe el estado del reactor en
         * otras dos unidades de medida. Hay veces en las que Tony tiene
         * pretensiones extrañas. Buscar en Wikipedia la tabla de
         * transformaciones.
         */
        float cargaReactor = super.bateria.getEnergiaTT() - super.bateria.getEnergiaTotal();
        float kilovatios = cargaReactor * 0.000239006f; // Conversión a Kilovatios
        float julios = cargaReactor * 3600; // Conversión a Julios

        System.out.println(" -- ESTADO DEL REACTOR -- ");
        System.out.println("Carga del reactor en Kilovatios: " + kilovatios + " kW");
        System.out.println("Carga del reactor en Julios: " + julios + " J");
    }

    public void revisarDispositivos() {
        /**
         * Reparando Daños Hay veces que se puede reparar los daños de un
         * dispositivo, en general es el 40% de las veces que se puede hacer.
         * Utilizar la clase Random para modelar este comportamiento. En caso de
         * estar dentro de la probabilidad (es decir probabilidad menor o igual
         * al 40%) marcar el dispositivo como sano. Si no dejarlo dañado.
         * Revisando Dispositivos Los dispositivos son revisados por JARVIS para
         * ver si se encuentran dañados. En caso de encontrar un dispositivo
         * dañado se debe intentar arreglarlo de manera insistente. Para esos
         * intentos hay un 30% de posibilidades de que el dispositivo quede
         * destruido, pero se deberá intentar arreglarlo hasta que lo repare, o
         * bien hasta que quede destruido. 16 Hacer un método llamado revisar
         * dispositivos que efectúe lo anteriormente descrito, el mecanismo
         * insistente debe efectuarlo con un bucle do while
         */
        Random random = new Random();

        // Batería
        System.out.println("Revisando Batería");
        if (!super.bateria.isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    super.bateria.setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": La batería fue reparada exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": La batería no pudo ser reparada. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - La batería está funcionando correctamente.");
        }

        // Casco
        System.out.println("Revisando Casco");
        if (!super.casco.isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    super.casco.setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": El casco fue reparado exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": El casco no pudo ser reparado. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - El casco está funcionando correctamente.");
        }

        // Bota Derecha
        System.out.println("Revisando Bota Derecha");
        if (!super.botaDerecha.isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    super.botaDerecha.setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": La bota derecha fue reparada exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": La bota derecha no pudo ser reparada. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - La bota derecha está funcionando correctamente.");
        }

        // Bota Izquierda
        System.out.println("Revisando Bota Izquierda");
        if (!super.botaIzquierda.isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    super.botaIzquierda.setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": La bota izquierda fue reparada exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": La bota izquierda no pudo ser reparada. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - La bota izquierda está funcionando correctamente.");
        }

        // Guante Izquierdo
        System.out.println("Revisando Guante Izquierdo");
        if (!super.guanteIzquierdo.isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    super.guanteIzquierdo.setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": El guante izquierdo fue reparado exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": El guante izquierdo no pudo ser reparado. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - El guante izquierdo está funcionando correctamente.");
        }

        // Guante Derecho
        System.out.println("Revisando Guante Derecho");
        if (!super.guanteDerecho.isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    super.guanteDerecho.setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": El guante derecho fue reparado exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": El guante derecho no pudo ser reparado. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - El guante derecho está funcionando correctamente.");
        }
    }

}
