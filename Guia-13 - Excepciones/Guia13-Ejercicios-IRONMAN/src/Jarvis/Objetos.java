/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarvis;

/**
 *
 * @author no_de
 */
public class Objetos {

    /**
     * Las ubicaciones de los objetos están dadas por las coordenadas X, Y y Z.
     * Los objetos pueden ser marcados o no como hostiles. JARVIS también puede
     * detectar la resistencia del objeto, y puede detectar hasta 10 objetos de
     * manera simultánea.
     */
    
    public int x;
    public int y;
    public int z;
    public boolean hostil;
    public int resistencia;
    public int distancia;
    
    public Objetos() {
    }

    public Objetos(int x, int y, int z, boolean hostil, int resistencia, int distancia) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostil = hostil;
        this.resistencia = resistencia;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        String estado;
        if (hostil){
          estado = " Hostil ";
        }else{
            estado = " NO Hostil";
        }
        return "\n Objeto {" + "\n Posicion X : " + x + "\n Posicion Y : " + y + "\n Posicion Z : " + z + "\n  Hostil : " + estado + "\n Resistencia : " + resistencia + "\n Distancia :" + distancia +'}';
    }
    
    
}
