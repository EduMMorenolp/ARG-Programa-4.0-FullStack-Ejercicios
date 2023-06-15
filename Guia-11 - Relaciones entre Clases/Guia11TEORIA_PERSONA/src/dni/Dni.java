/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

/**
 *
 * @author no_de
 */
public class Dni {
    
    private String serie;
    private int Dni;

    public Dni() {
    }

    public Dni(String serie, int Dni) {
        this.serie = serie;
        this.Dni = Dni;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", Dni=" + Dni + '}';
    }  
}
