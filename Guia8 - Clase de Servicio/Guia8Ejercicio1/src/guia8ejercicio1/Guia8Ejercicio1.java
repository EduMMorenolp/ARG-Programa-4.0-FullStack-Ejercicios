/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1;

import Entidades.cuentaBancaria;
import Servicios.cuentaBancariaServicios;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia8Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada CuentaBancaria en el paquete Entidades con
         * los siguientes atributos: numeroCuenta(entero), dniCliente(entero
         * largo), saldoActual. Agregar constructor vacío, con parámetros,
         * getters y setters. Agregar la clase CuentaBancariaServicio en el
         * paquete Servicios que contenga: Método para crear cuenta pidiéndole
         * los datos al usuario. Método ingresar(double): recibe una cantidad de
         * dinero a ingresar y se le sumará al saldo actual. Método
         * retirar(double): recibe una cantidad de dinero a retirar y se le
         * restara al saldo actual. Si la cuenta no tiene la cantidad de dinero
         * a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
         * Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
         * Validar que el usuario no saque más del 20%. Método consultarSaldo:
         * permitirá consultar el saldo disponible en la cuenta. Método
         * consultarDatos: permitirá mostrar todos los datos de la cuenta.
         */
        
        
        cuentaBancariaServicios Persona1 = new cuentaBancariaServicios();
        System.out.println("BIENVENIDO ! a USI BANK");
        System.out.println(" Cree Una Cuenta BANCARIA ");
        cuentaBancaria Cuenta1 = Persona1.Crearcuenta();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println(
                   "OPCION 1 = Ingresar dinero \n"
                 + "OPCION 2 = Retirar dinero \n"
                 + "OPCION 3 = Retirar dinero Entra rapido \n"
                 + "OPCION 4 = Consultar saldo \n"
                 + "OPCION 5 = Consultar datos  \n"
                 + "OPCION 6 = Salir");
        int var;
        do {   
        System.out.println("Ingrese una opcion : ");
        var = leer.nextInt();       
        switch (var) {
            case 1: 
                 Persona1.ingresar(Cuenta1);
                 break;
            case 2:
                 Persona1.retirar(Cuenta1);
                 break;
            case 3: 
                 Persona1.extraRapida(Cuenta1);
                 break;
            case 4:
                Persona1.consultarSaldo(Cuenta1);
                break;
            case 5:
                Persona1.consultarDatos(Cuenta1);
                break;
            case 6:
                System.out.println("Adios... vuelva pronto.");
            } 
        } while (var != 6);
    }
}
    
   
