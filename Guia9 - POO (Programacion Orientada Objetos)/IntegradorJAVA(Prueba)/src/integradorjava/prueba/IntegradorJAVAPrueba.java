/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjava.prueba;

import estudiantes.Estudiantes;
import estudiantesServicio.EstudianteServicio;

/**
 *
 * @author no_de
 */
public class IntegradorJAVAPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya
         * rindieron el examen final. La escuela nos ha pedido que calculemos el
         * promedio de notas final de todos sus alumnos y saber qué alumnos han
         * recibido una nota por encima de ese promedio. Para esto vamos a tener
         * que crear un objeto de tipo Estudiante, sus atributos van a ser
         * nombre y nota (representando la nota obtenida en el final). La
         * escuela consta con tan solo 8 estudiantes, por lo que deberemos crear
         * los 8 estudiantes con sus respectivas notas. Una vez creado los
         * estudiantes deberemos guardar los estudiantes en un arreglo de
         * objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
         * dos tareas que nos ha pedido la escuela. 1. Calcular y mostrar el
         * promedio de notas de todo el curso 2. Retornar otro arreglo con los
         * nombre de los alumnos que recibieron una nota mayor al promedio del
         * curso 3. Por último, deberemos mostrar todos los estudiantes con una
         * nota mayor al promedio. Nota: para crear un vector de objetos la
         * definición es la siguiente: Objeto nombreVector[] = new Objeto[];
         */

        EstudianteServicio pN = new EstudianteServicio();
        Estudiantes [] pNN = new Estudiantes[3];
        
        
        
        
        pN.cargaAlumnos(pNN);
        pN.mostrarPromedio(pNN);
        Object [] Lista = pN.mayorPromedio(pNN);
        pN.mejoresAlumnos(Lista);
        
        
    }

}
