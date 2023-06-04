/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Electrodomestico {

    /**
     * Electrodoméstico con los siguientes atributos: precio, color, consumo
     * energético (letras entre A y F) y peso.
     */
    protected double precio;
    protected String color;
    protected char consumoEnergia;
    protected int peso;

    public Electrodomestico(double precio, String color, char consumoEnergia, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public void comprobarConsumoEnergetico(char letra) {
        /**
         * Método comprobarConsumoEnergetico(char letra): comprueba que la letra
         * es correcta, sino es correcta usara la letra F por defecto. Este
         * método se debe invocar al crear el objeto y no será visible. (letras
         * entre A y F) A | B | C | D | E | F
         */
        letra = Character.toUpperCase(letra);
        if (letra != 'A' && letra != 'B' && letra != 'C'
        && letra != 'D' && letra != 'E' && letra != 'F') {
            // el char no se declara entre comillas "" sino entre comillas simples.
            setConsumoEnergia('F');
        }
    }

    public void comprobarColor(String color) {
        /**
         * Método comprobarColor(String color): comprueba que el color es
         * correcto, y si no lo es, usa el color blanco por defecto. Los colores
         * disponibles para los electrodomésticos son blanco, negro, rojo, azul
         * y gris. No importa si el nombre está en mayúsculas o en minúsculas.
         * Este método se invocará al crear el objeto y no será visible.
         */
        color = color.toLowerCase();
        if (!"blanco".equals(color) && !"negro".equals(color) && !"rojo".equals(color)
                && !"azul".equals(color) && !"gris".equals(color)) {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        /**
         * Metodo crearElectrodomestico(): le pide la información al usuario y
         * llena el electrodoméstico, también llama los métodos para comprobar
         * el color y el consumo. Al precio se le da un valor base de $1000.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("--- INGRESE ELECTRODOMESTICO ---");

        System.out.println("Ingrese el precio : ");
        this.precio = leer.nextInt() + 1000;
        System.out.println("Ingrese el color : ");
        this.color = leer.next();
        comprobarColor(this.color);
        System.out.println("Ingrese el peso : ");
        this.peso = leer.nextInt();
        System.out.println("Ingrese el Consumo Electrico la letra A|B|C|D|E|F : ");
        String consumoE = leer.next();
        this.consumoEnergia = consumoE.charAt(0);
        comprobarConsumoEnergetico(this.consumoEnergia);
    }

    public void precioFinal() {
        /**
         * Método precioFinal(): según el consumo energético y su tamaño,
         * aumentará el valor del precio. Esta es la lista de precios:
         */
        /*
        LETRA PRECIO
        A $1000
        B $800
        C $600
        D $500
        E $300
        F $100

        PESO PRECIO
        Entre 1 y 19 kg $100
        Entre 20 y 49 kg $500
        Entre 50 y 79 kg $800
        Mayor que 80 kg $1000
         */
        char var = consumoEnergia;
        switch (var) {
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio = this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;
        }

        int pesoValor = this.peso;
        if (pesoValor >= 1 && pesoValor <= 19) {
            this.precio = this.precio + 100;
        }
        if (pesoValor >= 20 && pesoValor <= 49) {
            this.precio = this.precio + 500;
        }
        if (pesoValor >= 50 && pesoValor <= 79) {
            this.precio = this.precio + 800;
        }
        if (pesoValor >= 80) {
            this.precio = this.precio + 1000;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + '}';
    }
    
    

}
