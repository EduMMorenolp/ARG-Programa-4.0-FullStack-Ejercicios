/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9extrasejercicio1;

import messecreto.MesSecreto;

/**
 *
 * @author no_de
 */
public class Guia9ExtrasEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una clase en Java donde declares una variable de tipo array de
         * Strings que contenga los doce meses del año, en minúsculas. A
         * continuación, declara una variable mesSecreto de tipo String, y hazla
         * igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
         * programa debe pedir al usuario que adivine el mes secreto. Si el
         * usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva
         * a intentar adivinar el mes secreto. Un ejemplo de ejecución del
         * programa podría ser este: Adivine el mes secreto. Introduzca el
         * nombre del mes en minúsculas: febrero No ha acertado. Intente
         * adivinarlo introduciendo otro mes: agosto ¡Ha acertado!
         */

        MesSecreto juego = new MesSecreto();

        /**
         * this.mesesSecreto[0] = "enero"
         * this.mesesSecreto[1] = "febrero"
         * this.mesesSecreto[2] = "marzo"
         * this.mesesSecreto[3] = "abril"
         * this.mesesSecreto[4] = "mayo"
         * this.mesesSecreto[5] = "junio"
         * this.mesesSecreto[6] = "julio"
         * this.mesesSecreto[7] = "agosto"
         * this.mesesSecreto[8] = "septiembre"
         * this.mesesSecreto[9] = "octubre"
         * this.mesesSecreto[10] = "noviembre"
         * this.mesesSecreto[11] = "diciembre"
         */
        juego.MesesSecreto();
        juego.juegoMesSecreto();
    }
}
