/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extrasejercicio4;

import servicios.Servicios;

/**
 * @author no_de
 */
public class Guia12EXTRASEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione 
        la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres 
        tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de 
        información debe gestionar esta aplicación: 
        • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de 
        identificación y su estado civil. 
        • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
        incorporación a la facultad y qué número de despacho tienen asignado. 
        • En cuanto a los estudiantes, se requiere almacenar el curso en el que están 
        matriculados. 
        • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento 
        pertenecen (lenguajes, matemáticas, arquitectura, ...). 
        • Sobre el personal de servicio, hay que conocer a qué sección están asignados 
        (biblioteca, decanato, secretaría, ...). 
        El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A 
        continuación, debe programar las clases definidas en las que, además de los constructores, 
        hay que desarrollar los métodos correspondientes a las siguientes operaciones: 
        • Cambio del estado civil de una persona. 
        • Reasignación de despacho a un empleado. 
        • Matriculación de un estudiante en un nuevo curso. 
        • Cambio de departamento de un profesor. 
        • Traslado de sección de un empleado del personal de servicio. 
        • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba 
        que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
        */
        
        
        System.out.println("Hola Cris, Hola Pato, Hola Luis, Hola Edu"); 
        
        Servicios ser = new Servicios();
        
        ser.menuFacultad();
        
        
        /*
        Tienen que desde git hacer el pull obetener los camibios que realizo
        EduMoreno y hacer un merge, desde su Rama de trabajo de la Edu
        modificacionesEdu, esto subira los cambios que eh reazilado y una vez 
        impletado las tareas, notificar la realizacion del mismo.
        */
        
        /*
        TAREAS PARA CRIS 
        - Completar y Terminar el METODO crearPROFESOR en SERVICIOS.
        - Completar y hacer el swicht del mismo.
        LOGICA y CONSTRUCCION en el MENU en SERVICIOS
        OPCION 2
        OPCION 7 
        */
        
        /*
        TAREAS PARA PATO
        - Completar y Terminar el MEOTOD crearPersonalServicio en SERVICIOS.
        - Completar y hacer el swicht del mismo.
        LOGICA y CONSTRUCCION en el MENU en SERVICIOS
        OPCION 1
        OPCION 8
        */
        
        /*
        TAREAS PARA LUIS
        - Completar y Terminar el MEOTOD ingresarEstudiante en SERVICIOS.
        - Completar y hacer el swicht del mismo.
        LOGICA y CONSTRUCCION en el MENU en SERVICIOS
        OPCION 3
        OPCION 6
        */
        
        
    }
    
}
