/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passservicio;

import java.util.Scanner;
import pass.Pass;

/**
 *
 * @author no_de
 */
public class PassServicio {

    //Pass n2 = new Pass();
    Scanner leer = new Scanner(System.in);

    public PassServicio() {
    }

    public PassServicio(Pass n1) {
        
        n1.setDni(00000000);
        n1.setNombre("admin");
        n1.setPass("admin");
    }

    public void crearPass(Pass n1) {
        /**
         * Crear un método para ingresar una contraseña (crearPass). En este
         * método, debemos validar que la longitud sea correcta. (10). En caso
         * de ser correcto, almaceno la contraseña. Si ingreso a esta opción del
         * menú, indefectiblemente deberá dejar su contraseña asignada.
         */
        //if ("admin".equals(n1.getPass())){
        System.out.println("Ingrese la Nueva Contraseña");
        String pass = leer.nextLine();
        n1.setPass(pass);
        do{
        if (pass.length() == 10) {
            System.out.println("Cambio de contraseña CORRECTO ....");
            n1.setPass(pass);
        } else {
            System.out.println("contraseña muy larga... vuelva a intenar.");
        }
        }while (pass.length() != 10);
        //}
        
    }

    public void analizarPass(Pass n1) {
        /**
         * Crear un método para analizar la contraseña(analizarPass). Donde: o
         * SI Existe al menos una letra z : Es nivel MEDIO o Si Existe al menos
         * una letra z y al menos 2 letras a: Es nivel ALTO o Si ninguna
         * condición se cumple es nivel BAJO
         */
        int contz = 0;
        int conta = 0;
        for (int i = 1; i < 11 ; i++) {
            //System.out.println("!!!ERROR!!!");
            //if ("z".equals(n1.getPass().substring(i, i + 1))) {
            if (n1.getPass().substring(i, i+1).equals("z") ){    
                contz++;
            }
            if ("a".equals(n1.getPass().substring(i, i + 1))) {
                
                conta++;
            }
        }
        if (contz >= 1) {
            System.out.println("Clave Nivel Medio");
            if (contz > 1 && conta >= 2) {
                System.out.println("Clave Nivel Alto");
            } else {
                System.out.println("Clave Nivel Bajo");
            }
            
        }
    }

    public void modNombre(Pass n1) {
        /**
         * Crear los métodos correspondientes para modificar el nombre o DNI.
         * Atención! Primero debe ingresar el pass para poder realizar dicha
         * gestión. Caso contrario se impedirá el acceso a modificar los datos
         */
        if (!"admin".equals(n1.getPass())) {
            System.out.println("Primero deve ingresar el nuevo Password");
        } else {
            System.out.println("Introdusca el nuevo Nombre de Usuario");
            n1.setNombre(leer.nextLine());
        }
    }

    public void modDni(Pass n1) {
        /**
         * Crear los métodos correspondientes para modificar el nombre o DNI.
         * Atención! Primero debe ingresar el pass para poder realizar dicha
         * gestión. Caso contrario se impedirá el acceso a modificar los datos
         */
        if (!"admin".equals(n1.getPass())) {
            System.out.println("Primero deve ingresar el nuevo Password");
        } else {
            System.out.println("Introdusca el nuevo Nombre de DNI");
            n1.setDni(leer.nextInt());
        }
    }
    
    public void modContrasenia(Pass n1){
        /**
         * 
         */
        System.out.println("Ingrese la contraseña Actual :");
        String contraseña = leer.nextLine();
        if (contraseña.equals(n1.getPass()) ) {
            crearPass(n1); 
        }else{
            System.out.println("Contraseña incorrecta");
        }
        
    }

    public void menu(Pass n1) {
        /**
         * A través de un menú de opciones: o A) ingresar la contraseña,
         * recordar que antes de guardarla debe ser ingresada una contraseña
         * valida). o B) Mensaje al usuario que tipo de NIVEL es su contraseña o
         * C) Modificar contraseña, donde primero debe poner su contraseña
         * anterior para dar permiso o C) Modificar nombre, donde primero debe
         * poner su contraseña para dar permiso, SINO impedir cambios o D)
         * Modificar DNI, donde primero debe poner su contraseña para dar
         * permiso, SINO impedir cambios
         */
        String var;
        System.out.println("OPCION A : Ingresar contraseña \n"
                + "OPCION B : Tipo de Nivel de contraseña \n"
                + "OPCION C : Modificar Contraseña\n"
                + "OPCION D : Modificar DNI\n"
                + "OPCION J : Modificar nombre\n"
                + "OPCION S : Salir");
        do {
            System.out.println("Ingrese la OPCION : ");
            var = leer.nextLine().toUpperCase();
            switch (var) {
                case "A":
                    crearPass(n1); 
                    break;
                case "B":
                    analizarPass(n1);
                    break;
                case "C":
                    modContrasenia(n1);
                    break;
                case "J":
                    modNombre(n1);
                    break;
                case "D":
                    modDni(n1);
                    break;
                case "S":
                    System.out.println("Adios....");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (!"S".equals(var));

    }

}
