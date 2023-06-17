/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio6;

/**
 *
 * @author no_de
 */
public class Sentencia {
    
    public void metodoA(int a, int b) {
        System.out.println("sentencia_a1 : " + (a+b));
        System.out.println("sentencia_a2 : " + (a-b));

        try {
            System.out.println("sentencia_a3 : " + (a*b));
            System.out.println("sentencia_a4 : " + (a/b));
            throw new MioException("Se produjo una excepción MioException");
        } catch (MioException e) {
            System.out.println(e.toString());
        }

        System.out.println("sentencia_a5 : " + "A : " + a + " B : " + b);
    }  
}
