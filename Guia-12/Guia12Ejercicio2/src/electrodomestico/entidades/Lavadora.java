/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico.entidades;

import electrodomestico.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergia, int peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavador() {
        /**
         * Método crearLavadora (): este método llama a crearElectrodomestico()
         * de la clase padre, lo utilizamos para llenar los atributos heredados
         * del padre y después llenamos el atributo propio de la lavadora.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--- LAVADORA ---");
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la Lavadora : ");
        // Asi tube que setear todos los atributos de Electrodomestico mala mia.
        // Tarea para la casa.
        setCarga(leer.nextInt());
    }

    // El OVERRIDE lo usamos para sobre escribir el metodo de la Clase PADRE/MADRE
    @Override
    public void precioFinal() {
        /**
         * Método precioFinal(): este método será heredado y se le sumará la
         * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará
         * el precio en $500, si la carga es menor o igual, no se incrementará
         * el precio. Este método debe llamar al método padre y añadir el código
         * necesario. Recuerda que las condiciones que hemos visto en la clase
         * Electrodoméstico también deben afectar al precio.
         */
        
        if (carga > 30){
            setPrecio(getPrecio() + 500 );
        }
    }

    @Override
    public String toString() { 
        return super.toString() + " Lavadora{" + "carga=" + carga + '}';
    }

    
}
