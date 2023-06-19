/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarvis;

import java.util.Random;

/**
 *
 * @author no_de
 */
public class Radar {

    private Objetos[] Objetos;

    public Radar() {
    }

    public Radar(Objetos[] Objetos) {
        this.Objetos = Objetos;
    }

    public void detectarObjetos() {
        try {
            Random random = new Random();
            int randomObjetos = random.nextInt(10);
            for (int i = 0; i < randomObjetos; i++) {
                int randomX = random.nextInt(10);
                int randomY = random.nextInt(10);
                int randomZ = random.nextInt(10);
                int randomRest = random.nextInt(25);
                int randomDistancia = random.nextInt(5000);
                boolean randomHostil = random.nextBoolean();
                Objetos[i] = new Objetos(randomX, randomY, randomZ, randomHostil, randomRest, randomDistancia);
            }
        } catch (Exception e) {
            System.out.println("ERROR al crear Objeto");
        }
    }

    public void UbicacionObejtos() {
        try {
            for (int i = 0; i < Objetos.length; i++) {
                Objetos[i].toString();
            }
        } catch (Exception e) {
            System.out.println("ERROR al Ubicar Objetos");
        }
    }

    public Objetos[] getObjetos() {
        return Objetos;
    }

}
