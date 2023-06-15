/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3.Operacion;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Operacion {
    /**
     * Crear una clase llamada Operacion que tenga como atributos privados
     * numero1 y numero2. A continuación, se deben crear los siguientes métodos:
     * Método constructor con todos los atributos pasados por parámetro. 
     * Método
     * constructor sin los atributos pasados por parámetro. 
     * Métodos get y set.
     * Método para crearOperacion(): que le pide al usuario los dos números y
     * los guarda en los atributos del objeto. 
     * Método sumar(): calcular la suma
     * de los números y devolver el resultado al main.
     * Método restar(): calcular
     * la resta de los números y devolver el resultado al main
     * Método
     * multiplicar(): primero valida que no se haga una multiplicación por cero,
     * si fuera a multiplicar por cero, el método devuelve 0 y se le informa al
     * usuario el error. Si no, se hace la multiplicación y se devuelve el
     * resultado al main Método dividir(): primero valida que no se haga una
     * división por cero, si fuera a pasar una división por cero, el método
     * devuelve 0 y se le informa al usuario el error se le informa al usuario.
     * Si no, se hace la división y se devuelve el resultado al main.
     */
    
    private int numero1;
    private int numero2;
    
    public Operacion() {
        // Constructor vacío
    }
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getNumero1() {
        return numero1;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }
    
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = sc.nextInt();
    }
    
    public int sumar() {
        return this.numero1 + this.numero2;
    }
    
    public int restar() {
        return this.numero1 - this.numero2;
    }
    
    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero.");
            return 0;
        }
        else {
            return this.numero1 * this.numero2;
        }
    }
    
    public float dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
        else {
            return (float) this.numero1 / this.numero2;
        }
    }
}
