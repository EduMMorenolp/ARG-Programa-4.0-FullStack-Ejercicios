/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextras6;

import guia7ejercicioextras6.Rectangulo.Rectangulo;

/**
 *
 * @author no_de
 */
public class Guia7EjercicioExtras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y
         * un método "calcular_area" que calcule y devuelva el área del
         * rectángulo. Luego crea un objeto "rectangulo1" de la clase
         * "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
         */
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);
        
    }

}
