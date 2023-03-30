/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extrasejercicio4;

/**
 *
 * @author no_de
 */
public class Guia5EXTRASEjercicio4 {

    /**
     * @param args the command line arguments
     * Los profesores del curso de
     * programación de Egg necesitan llevar un registro de las notas adquiridas
     * por sus 10 alumnos para luego obtener una cantidad de aprobados y
     * desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
     * 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
     * de cada nota son: 
     * 
     * Primer trabajo práctico evaluativo 10% 
     * Segundo trabajo práctico evaluativo 15%
     * Primer Integrador 25%
     * Segundo integrador 50%
     * 
     * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
     * Al final del programa los profesores necesitan obtener por pantalla la
     * cantidad de aprobados y desaprobados, teniendo en cuenta que solo
     * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del
     * curso.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        double matriz [][] = new double [10][5];
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        int aprobo=0;
        int noaprobo=0;
        
        //int vectorProm [] = new int [10];
        
        
        for (int i = 0; i < 10; i++) {
           //System.out.print("Primer trabajo práctico evaluativo: ");
            matriz [i][0] = (int) (Math.random() * 10 + 1);
            //System.out.print("Segundo trabajo práctico evaluativo: ");
            matriz [i][1] = (int) (Math.random() * 10 + 1);
            //System.out.print("Primer Integrador: ");
            matriz [i][2] = (int) (Math.random() * 10 + 1);
            //System.out.print("Segundo Integrador: ");
            matriz [i][3] = (int) (Math.random() * 10 + 1);
        
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print("-"+matriz [i][j]+"-");
            }
        }
        
         for (int i = 0; i < 10; i++) {
            System.out.println(" ");
           
                 nota1 = matriz [i][0] * 0.10;
                 nota2 = matriz [i][1] * 0.15;
                 nota3 = matriz [i][2] * 0.25;
                 nota4 = matriz [i][3] * 0.50;
                 matriz [i][4]= (nota1+nota2+nota3+nota4);
                 
                 if (matriz [i][4] >= 7) {
                    aprobo ++;
                } else {
                     noaprobo ++;
              
           
            }
        }
         for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 5; j++) {
                System.out.print("-"+matriz [i][j]+"-");
            }
        }
         for (int i = 0; i < 10; i++) {
            
        }
        System.out.println(" ");
        System.out.println("Cantidad de aprobados: " + aprobo);
        System.out.println("Cantidad de desaprobados: " + noaprobo);
        
        }
}