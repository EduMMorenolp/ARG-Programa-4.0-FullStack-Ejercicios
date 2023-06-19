/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarvis;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author no_de
 */
public class Radar {

    public ArrayList<Objetos> Objetos;

    public Radar() {
    }

    public Radar(ArrayList<Objetos> Objetos) {
        this.Objetos = Objetos;
    }

    public ArrayList<Objetos> getObjetos() {
        return Objetos;
    }

    public void detectarObjetos() {
        try {
            Objetos = new ArrayList<>();
            Random random = new Random();
            int randomObjetos = random.nextInt(10);
            for (int i = 0; i < randomObjetos; i++) {
                int randomX = random.nextInt(10);
                int randomY = random.nextInt(10);
                int randomZ = random.nextInt(10);
                int randomRest = random.nextInt(1000);
                int randomDistancia = random.nextInt(10000);
                boolean randomHostil = random.nextBoolean();
                Objetos.add(new Objetos(randomX, randomY, randomZ, randomHostil, randomRest, randomDistancia));
            }
        } catch (Exception e) {
            System.out.println("ERROR al crear Objeto");
        }
    }

    public void UbicacionObejtos() {
        for (Objetos Objeto : Objetos) {
            System.out.println(Objeto.toString());
        }
    }
}
