/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextras4.Cuenta;

import java.util.Scanner;

/**
 *
 * @author e.m.morenolp@gmail.com
 */
public class Cuenta {
    
    private int saldo = 1000;
    private String titular = "Edu";

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    } 
    
    public void retirarDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar ? " );
        int dinero = leer.nextInt();
        saldo = saldo - dinero;
         if (saldo < 0){
             System.out.println("Ya no tiene dinero en la cuenta");          
        }else{System.out.println("Dinero Restante en cuenta :" + saldo );  
        }            
    } 
    
}
