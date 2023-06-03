/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12teoria_interfaz;

import interfaz.NewInterface;

/**
 *
 * @author no_de
 */
public class Guia12TEORIA_INTERFAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Vamos a crear una interfaz con un método abstracto. Luego desde el
         * main intentaremos instanciar un objeto a partir de la interfaz
         */
        
        Clase p = new Clase();
        
        p.saludar();
        p.adios();
                
    }
}

class Clase implements NewInterface {

    @Override
    public void saludar() {
        System.out.println("Holis.... ");
    }

    @Override
    public void adios() {
        System.out.println("Adiozzzz ");
    }
    
}
