/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2;

import pardenumeros.ParDeNumeros;
import pardenumerosservice.ParDeNumerosService;

/**
 *
 * @author no_de
 */
public class Guia9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada ParDeNumeros que tenga como atributos dos
         * números reales con los cuales se realizarán diferentes operaciones
         * matemáticas. La clase debe tener un constructor vacío, getters y
         * setters. En el constructor vacío se usará el Math.random para generar
         * los dos números. Crear una clase ParDeNumerosService, en el paquete
         * Servicios, que deberá además implementar los siguientes métodos:
         * Método mostrarValores que muestra cuáles son los dos números
         * guardados. Método devolverMayor para retornar cuál de los dos
         * atributos tiene el mayor valor Método calcularPotencia para calcular
         * la potencia del mayor valor de la clase elevado al menor número.
         * Previamente se deben redondear ambos valores. Método calculaRaiz,
         * para calcular la raíz cuadrada del menor de los dos valores. Antes de
         * calcular la raíz cuadrada se debe obtener el valor absoluto del
         * número.
         */
        
        ParDeNumerosService nN = new ParDeNumerosService();
        
        nN.mostrarValores();
        System.out.println("El Numero mayor es : " + nN.devolverMayor());
        nN.calcularPotencia();
        nN.calculaRaiz();
        
    }
}
