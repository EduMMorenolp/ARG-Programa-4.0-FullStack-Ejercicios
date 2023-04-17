/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicioextra1;

import raices.Raices;
import raicesservicio.RaicesServicio;

/**
 *
 * @author no_de
 */
public class Guia8EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Vamos a realizar una clase llamada Raices, donde representaremos los
         * valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
         * como atributos, llamémosles a, b y c. Hay que insertar estos 3
         * valores para construir el objeto a través de un método constructor.
         * Luego, en RaicesServicio las operaciones que se podrán realizar son
         * las siguientes: Método getDiscriminante(): devuelve el valor del
         * discriminante (double). El discriminante tiene la siguiente fórmula:
         * (b^2)-4*a*c Método tieneRaices(): devuelve un booleano indicando si
         * tiene dos soluciones, para que esto ocurra, el discriminante debe ser
         * mayor o igual que 0. Método tieneRaiz(): devuelve un booleano
         * indicando si tiene una única solución, para que esto ocurra, el
         * discriminante debe ser igual que 0. Método obtenerRaices(): llama a
         * tieneRaíces() y si devolvió́ true, imprime las 2 posibles
         * soluciones. Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́
         * true imprime una única raíz. Es en el caso en que se tenga una única
         * solución posible. Método calcular(): esté método llamará
         * tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
         * soluciones que tiene nuestra ecuación con los métodos obtenerRaices()
         * o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de
         * no existir solución, se mostrará un mensaje. Nota: Fórmula ecuación
         * 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de
         * -b
         */

        RaicesServicio num = new RaicesServicio();

        /**
         * a = 1, b = 2, c = 1 (tiene una única solución)
         * a = 2, b = -7, c = 3 (tiene dos soluciones)
         * a = 1, b = 1, c = 2 (no tiene soluciones reales)
         */
        num.valores();
        num.calcular();

    }

}
