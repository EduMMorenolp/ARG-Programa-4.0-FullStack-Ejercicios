/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.cuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class cuentaBancariaServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public cuentaBancaria Crearcuenta(){ 
        System.out.println("Ingrese su Numero de Cuenta Bancaria para operar");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI de Cliente");
        long dniCliente = leer.nextLong();
        System.out.println("Cuanto Dinero Ingresa?");
        double saldoActual = leer.nextDouble();
        
        return new cuentaBancaria(numeroCuenta, dniCliente, saldoActual);    
    }
    public void ingresar(cuentaBancaria numeroCuenta) {
         double ingreso;
        System.out.println("Cuanto dinero Ingresa ? ");
        ingreso = leer.nextDouble();
        numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() + ingreso);   
    }
    
    public void retirar(cuentaBancaria numeroCuenta) {
         double retiro;
        System.out.println("Cuanto dinero Ingresa ?");
        retiro = leer.nextDouble();    
        double balance = numeroCuenta.getSaldoActual();
        if (balance < retiro) {
            System.out.println("No tiene sufuciente saldo");
            numeroCuenta.setSaldoActual(0);
        } else {
            numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() - retiro); 
        }      
    }
    public void extraRapida(cuentaBancaria numeroCuenta) {
        System.out.println("Extracción rápida hasta 20% - Ingrese el monto a retirar");
        double ext = leer.nextDouble();
        if (ext < (numeroCuenta.getSaldoActual() * 0.2)) {
            numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() - ext);
            System.out.println("El saldo actual es: " + numeroCuenta.getSaldoActual());
        } else {
            System.out.println("No se puede retirar lo solicitado");
        }
    }
    public void consultarSaldo(cuentaBancaria numeroCuenta){
        System.out.println("Su saldo es de : \n " + "Numero de Cuenta :"+ numeroCuenta.getNumeroCuenta() + " Saldo : " + numeroCuenta.getSaldoActual());
    }
    public void consultarDatos(cuentaBancaria numeroCuenta){
        System.out.println("Sus Datos son : \n Numero de Cuenta : " + numeroCuenta.getNumeroCuenta()
                          + "\n DNI : " + numeroCuenta.getDniCliente() );
    }   
    }
