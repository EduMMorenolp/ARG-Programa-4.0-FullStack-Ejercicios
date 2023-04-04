/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class libro1 {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public libro1() {
        // constructor vacío
    }
    
    public libro1(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de ISBN del libro: ");
        this.ISBN = leer.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = leer.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = leer.nextInt();
    }
    
    public void mostrarInformacion() {
        System.out.println("Número de ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}


