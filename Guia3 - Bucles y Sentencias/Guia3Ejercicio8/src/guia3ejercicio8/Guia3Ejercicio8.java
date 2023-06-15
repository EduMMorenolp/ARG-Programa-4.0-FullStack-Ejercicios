/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio8;

/**
 *
 * @author no_de
 */
public class Guia3Ejercicio8 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("* ");
                    continue;
                }else{
                    System.out.print("  ");
                    continue;
                }
            }System.out.println("");
        }System.out.println("");
    }
}


    

