/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Esqueleto {

    /**
     * Las armaduras de Stark se encuentran definidas por un color primario y un
     * color secundario. Se encuentran compuestas de dos propulsored, uno en
     * cada bota; y dos repulsores, uno en cada guante (los repulsores se
     * utilizan también como armas). Tony los utiliza en su conjunto para volar
     */
    /**
     * La armadura tiene un nivel de resistencia, que depende del material con
     * el que está fabricada, y se mide con un número entero cuya unidad de
     * medida de dureza es Rockwell
     */
    /**
     * Todas las armaduras poseen un nivel de salud el cual se mide de 0 a 100.
     * La batería a pesar de estar en el pecho de Tony, es considerada como
     * parte de la armadura.
     */
    
    public String nombreArmadura;
    public String colorPrimario;
    public String colorSecundario;
    public int nivelSalud;
    public int resistencia;
    public Botas botaIzquierda;
    public Botas botaDerecha;
    public Guantes guanteIzquierdo;
    public Guantes guanteDerecho;
    public Cascos casco;
    public Generador bateria;

    public Esqueleto() {
    }

    public Esqueleto(int nivelSalud, String nombreArmadura, String colorPrimario, String colorSecundario, int resistencia, Botas botaIzquierda, Botas botaDerecha, Guantes guanteIzquierdo, Guantes guanteDerecho, Cascos casco, Generador bateria) {
        this.nombreArmadura = nombreArmadura;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelSalud = nivelSalud;
        this.resistencia = resistencia;
        this.botaIzquierda = botaIzquierda;
        this.botaDerecha = botaDerecha;
        this.guanteIzquierdo = guanteIzquierdo;
        this.guanteDerecho = guanteDerecho;
        this.casco = casco;
        this.bateria = bateria;
    }

    public String getNombreArmadura() {
        return nombreArmadura;
    }

    public void setNombreArmadura(String nombreArmadura) {
        this.nombreArmadura = nombreArmadura;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Botas getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(Botas botaIzquierda) {
        this.botaIzquierda = botaIzquierda;
    }

    public Botas getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(Botas botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public Guantes getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(Guantes guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    public Guantes getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(Guantes guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public Cascos getCasco() {
        return casco;
    }

    public void setCasco(Cascos casco) {
        this.casco = casco;
    }

    public Generador getBateria() {
        return bateria;
    }

    public void setBateria(Generador bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "\n Armadura {" + "\n Color Primario : " + colorPrimario + "\n Color Secundario : " + colorSecundario + "\n Nivel Salud : " + nivelSalud + '}';
    }

    public void Caminar(int tiempo) {
        int energiaConsumida = ((botaDerecha.usarBotas() + botaIzquierda.usarBotas())* EnumUso.NORMAL.getNivel() )* tiempo;
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - energiaConsumida);
    }

    public void Correr(int tiempo) {
        int energiaConsumida = ((botaDerecha.usarBotas() + botaIzquierda.usarBotas())* EnumUso.MEDIO.getNivel()) * tiempo;
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - energiaConsumida);
    }

    public void Propulsar(int tiempo) {
        int energiaConsumida = ((botaDerecha.usarBotas() + botaIzquierda.usarBotas())* EnumUso.INTENSO.getNivel()) * tiempo;
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - energiaConsumida);
    }

    public void Volar(int tiempo) {
        int energiaConsumidaB = ((botaDerecha.usarBotas() + botaIzquierda.usarBotas())* EnumUso.INTENSO.getNivel()) * tiempo;
        int energiaConsumidaG = ((guanteDerecho.usarGuantes() + guanteIzquierdo.usarGuantes())* EnumUso.MEDIO.getNivel()) * tiempo;
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - energiaConsumidaB -energiaConsumidaG);
    }
    
    public int Disparo(int cantidad){
        // Cantidad va ser si se usa solo 1 o 2 guantes.
        int energiaConsumida = (guanteIzquierdo.usarGuantes() + guanteDerecho.usarGuantes())* EnumUso.INTENSO.getNivel();
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - energiaConsumida);
        int danio;
        if (cantidad == 1){
            danio = guanteIzquierdo.Atacar(); 
        }else {
            danio = guanteIzquierdo.Atacar() + guanteDerecho.Atacar();
        }
        return danio;
    }
    
    public void Leer(String texto) {
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - casco.usarCascos());
        String text = "\n RECIVIDO EL TEXTO : ";
        System.out.println(text + texto);
    }

    public void Escribir() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" -- BIENVENIDO TONY -- ");
        bateria.setEnergiaTotal(bateria.getEnergiaTotal() - casco.usarCascos());
        System.out.println(" Ingresa el Comando deseado : ");
        String texto =leer.nextLine();
        Leer(texto);
        }

}
