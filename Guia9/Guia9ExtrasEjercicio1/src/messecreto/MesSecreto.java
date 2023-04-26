/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messecreto;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author no_de
 */
public class MesSecreto {
    
    Random rand = new Random();
    Scanner leer = new Scanner(System.in);
    String[] mesesSecreto = new String[12];
    String mesSecreto;

    public void MesesSecreto() {
        this.mesesSecreto[0] = "enero";
        this.mesesSecreto[1] = "febrero";
        this.mesesSecreto[2] = "marzo";
        this.mesesSecreto[3] = "abril";
        this.mesesSecreto[4] = "mayo";
        this.mesesSecreto[5] = "junio";
        this.mesesSecreto[6] = "julio";
        this.mesesSecreto[7] = "agosto";
        this.mesesSecreto[8] = "septiembre";
        this.mesesSecreto[9] = "octubre";
        this.mesesSecreto[10] = "noviembre";
        this.mesesSecreto[11] = "diciembre";
        mesSecreto = mesesSecreto[rand.nextInt(12)];
        //System.out.println("el mes secreto es : " + mesSecreto);
    }
    
    
    public void juegoMesSecreto(){
        boolean acertado = false;
        System.out.println("BIENVENIDO a MES SECRETO");
        System.out.println("Adivine el mes en minuscula ejemplo : enero/octubre/ect");
        do{
            System.out.println("Adivine el mes : ");
            String prediccion = leer.nextLine();
            if (prediccion.equals(mesSecreto)){
                System.out.println("FELICITACIONES USTED ACERTO !");
                acertado = true;
            }else{
                System.out.println("INCORRECTO vuelva a intentarlo");
            } 
        }while (!acertado);   
    }

}
