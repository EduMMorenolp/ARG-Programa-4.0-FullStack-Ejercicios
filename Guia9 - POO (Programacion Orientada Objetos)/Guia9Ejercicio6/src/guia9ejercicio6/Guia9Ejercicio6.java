/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio6;

import cursoservicio.CursoServicio;
import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia9Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Un profesor particular está dando cursos para grupos de cinco alumnos
         * y necesita un programa para organizar la información de cada curso.
         * Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
         * serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno
         * (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
         * arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
         * nombres de cada alumno. A continuación, se implementarán los
         * siguientes métodos: Un constructor por defecto. Un constructor con
         * todos los atributos como parámetro. Métodos getters y setters de cada
         * atributo. Método cargarAlumnos(): este método le permitirá al usuario
         * ingresar los alumnos que asisten a las clases. Nosotros nos
         * encargaremos de almacenar esta información en un arreglo e iterar con
         * un bucle, solicitando en cada repetición que se ingrese el nombre de
         * cada alumno. Método crearCurso(): el método crear curso, le pide los
         * valores de los atributos al usuario y después se le asignan a sus
         * respectivos atributos para llenar el objeto Curso. En este método
         * invocamos al método cargarAlumnos() para asignarle valor al atributo
         * alumnos Método calcularGananciaSemanal(): este método se encarga de
         * calcular la ganancia en una semana por curso. Para ello, se deben
         * multiplicar la cantidad de horas por día, el precio por hora, la
         * cantidad de alumnos y la cantidad de días a la semana que se repite
         * el encuentro.
         */
        Scanner leer = new Scanner(System.in);
        CursoServicio cla1 = new CursoServicio();
        
        
        
        
        System.out.println("Cuantos cursos tiene actualmente ? :");
        int CantCursos = leer.nextInt();
        //String[] alumnos = new String[5];
        int Gananciatotal = 0;
        Curso[] c = new Curso[CantCursos];
        for (int i = 0; i < CantCursos; i++) {
            c[i] = cla1.crearCurso();
            cla1.calcularGananciaSemanal(c[i]);
            //Gananciatotal =+ cla1.calcularGananciaSemanal(c[i]);
        }
        //System.out.println("Ganacias totales son : " + Gananciatotal);
        //Curso c1 = cla1.crearCurso();
        //Curso c2 = cla1.crearCurso();
        //cla1.calcularGananciaSemanal(c1);
        //cla1.calcularGananciaSemanal(c2);
    }

}
