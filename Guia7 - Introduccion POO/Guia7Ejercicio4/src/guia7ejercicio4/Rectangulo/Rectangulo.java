/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4.Rectangulo;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    private int Perimetro;
    private int Superficie;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void crearParametros(){
        Scanner leer = new Scanner(System.in); 
        System.out.print("Ingrese al altura : ");
        this.altura = leer.nextInt();
        System.out.print("Ingrese la base : ");
        this.base = leer.nextInt();      
    }
            
    public void Perimetro(){
        this.Perimetro = (base + altura) * 2;
        System.out.println("El perimetro es : " + Perimetro);
    }
    
    public void Superficie(){
        this.Superficie = base * altura;
        System.out.println("La base es : " + base);
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public int getSuperficie() {
        return Superficie;
    }

    public void setPerimetro(int Perimetro) {
        this.Perimetro = Perimetro;
    }

    public void setSuperficie(int Superficie) {
        this.Superficie = Superficie;
    }
    
    public void Dibujar(){
        
        for (int i = 1; i <= altura ; i++) {
            System.out.println("");
            for (int j = 1; j <= base ; j++) {
                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }System.out.println("");
    }
}
