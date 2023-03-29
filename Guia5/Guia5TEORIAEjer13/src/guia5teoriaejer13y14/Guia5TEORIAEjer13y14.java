/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5teoriaejer13y14;

/**
 * Ejercicio 13y14 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
 * de compañeros de equipo y define su tipo de dato de tal manera que te permita
 * alojar sus nombres más adelante.
 */
public class Guia5TEORIAEjer13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Equipo = new String[5];
        
        
        Equipo[0] = "Ramiro Carpio";
        Equipo[1] = "Soul Mamani";
        Equipo[2] = "Alejo Quaranta";
        Equipo[3] = "Diego Antritu";
        Equipo[4] = "Emi Orona";
        
        for (int i = 0 ; i < 4 ; i++){
           System.out.println("[" + Equipo[i] + "]");
                
        } 
        
    }
    
}
