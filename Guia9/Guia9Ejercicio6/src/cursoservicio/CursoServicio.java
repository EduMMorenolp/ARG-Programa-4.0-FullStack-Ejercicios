/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoservicio;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class CursoServicio {
    
    Curso cursos = new Curso();
    Scanner leer = new Scanner(System.in); //.useDelimiter("\n");

    public void cargarAlumnos() {
        /**
         * METODO D Método cargarAlumnos(): este método le permitirá al usuario
         * ingresar los alumnos que asisten a las clases. Nosotros nos
         * encargaremos de almacenar esta información en un arreglo e iterar con
         * un bucle, solicitando en cada repetición que se ingrese el nombre de
         * cada alumno.
         */
        System.out.println("Ingrese los alumnos de la clase");
        for (int i = 0; i < 6; i++) {
            String alumnos = leer.nextLine();
            cursos.getAlumnos()[i] = alumnos;  
        }  
    }
    
      
    public Curso crearCurso() {
        /**
         * METODO E Método crearCurso(): el método crear curso, le pide los
         * valores de los atributos al usuario y después se le asignan a sus
         * respectivos atributos para llenar el objeto Curso. En este método
         * invocamos al método cargarAlumnos() para asignarle valor al atributo
         * alumnos
         */
        System.out.println("Ingres el nombre del curso : ");
        cursos.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la Cantidad de Dias por semana : ");
        cursos.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Horas por dia :");
        cursos.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese el Precio por Hora :");
        cursos.setPrecioPorHora(leer.nextInt());
        System.out.println("Ingrese Turno M/T : ");
        cursos.setTurno(leer.next());
        cargarAlumnos();
        //System.out.println(cursos.toString());
        
        return new Curso();
    }

    public int calcularGananciaSemanal(Curso Ganacia) {
        /**
         * METODO F Método calcularGananciaSemanal(): este método se encarga de
         * calcular la ganancia en una semana por curso. Para ello, se deben
         * multiplicar la cantidad de horas por día, el precio por hora, la
         * cantidad de alumnos y la cantidad de días a la semana que se repite
         * el encuentro.
         */
        
        int Ganancias = cursos.getCantidadHorasPorDia() * cursos.getPrecioPorHora() * 5 * cursos.getCantidadDiasPorSemana();
        System.out.println("Las Ganancias son : " + Ganancias);
        
        return Ganancias;
    }
    

    
}
