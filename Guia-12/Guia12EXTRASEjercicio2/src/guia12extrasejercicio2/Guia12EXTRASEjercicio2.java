/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extrasejercicio2;

import edificio.entidades.Edificio;
import edificio.entidades.EdificioDeOficinas;
import edificio.entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author no_de
 */
public class Guia12EXTRASEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear una superclase llamada Edificio con los siguientes atributos:
         * ancho, alto y largo. La clase edificio tendrá como métodos: • Método
         * calcularSuperficie(): calcula la superficie del edificio. • Método
         * calcularVolumen(): calcula el volumen del edifico. Estos métodos
         * serán abstractos y los implementarán las siguientes clases: • Clase
         * Polideportivo con su nombre y tipo de instalación que puede ser
         * Techado o Abierto, esta clase implementará los dos métodos abstractos
         * y los atributos del padre. • Clase EdificioDeOficinas con sus
         * atributos número de oficinas, cantidad de personas por oficina y
         * número de pisos. Esta clase implementará los dos métodos abstractos y
         * los atributos del padre. De esta clase nos interesa saber cuántas
         * personas pueden trabajar en todo el edificio, el usuario dirá cuántas
         * personas entran en cada oficina, cuantas oficinas y el número de piso
         * (suponiendo que en cada piso hay una oficina). Crear el método
         * cantPersonas(), que muestre cuantas personas entrarían en un piso y
         * cuantas en todo el edificio. 16 Por último, en el main vamos a crear
         * un ArrayList de tipo Edificio. El ArrayList debe contener dos
         * polideportivos y dos edificios de oficinas. Luego, recorrer este
         * array y ejecutar los métodos calcularSuperficie y calcularVolumen en
         * cada Edificio. Se deberá mostrar la superficie y el volumen de cada
         * edificio. Además de esto, para la clase Polideportivo nos interesa
         * saber cuántos polideportivos son techados y cuantos abiertos. Y para
         * la clase EdificioDeOficinas deberemos llamar al método cantPersonas()
         * y mostrar los resultados de cada edificio de oficinas.
         */
        
        ArrayList<Edificio> Edificios = new ArrayList<>(); 
        
        // Agregar dos polideportivos
        Edificios.add(new Polideportivo("Polideportivo 1", true, 30, 20, 10));
        Edificios.add(new Polideportivo("Polideportivo 2", false, 25, 15, 12));
  
        // Agregar dos edificios de oficinas
        Edificios.add(new EdificioDeOficinas(40, 30, 20, 5, 10, 3));
        Edificios.add(new EdificioDeOficinas(35, 25, 18, 7, 8, 4));
        
        // Calcular y mostrar superficie y volumen de cada edificio
        for (Edificio edificio : Edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());
            System.out.println("-----------------------------");
        }

        // Contar polideportivos techados y abiertos
        int techados = 0;
        int abiertos = 0;

        for (Edificio edificio : Edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoInstalacion()) {
                    techados++;
                } else {
                    abiertos++;
                }
            }
        }

        System.out.println("Polideportivos techados: " + techados);
        System.out.println("Polideportivos abiertos: " + abiertos);

        // Mostrar cantidad de personas en edificios de oficinas
        for (Edificio edificio : Edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPersonas();
                System.out.println("-----------------------------");
            }
        }
        
    }

}
