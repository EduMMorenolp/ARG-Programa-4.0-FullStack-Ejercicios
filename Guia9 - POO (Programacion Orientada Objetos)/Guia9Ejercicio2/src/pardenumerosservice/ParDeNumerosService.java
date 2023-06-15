/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardenumerosservice;

import pardenumeros.ParDeNumeros;

/**
 *
 * @author no_de
 */
public class ParDeNumerosService {
    
    ParDeNumeros Numeros = new ParDeNumeros();
    
    public void mostrarValores(){
        double Numero1 = Numeros.getN1();
        System.out.println("Numero1 = " + Numero1);        
        double Numero2 = Numeros.getN2();
        System.out.println("Numero2 = " + Numero2);
    }
    
    public double devolverMayor(){
        double mayor;
        if (Numeros.getN1() > Numeros.getN2()){
            mayor = Numeros.getN1();
        }else{
            mayor = Numeros.getN2();
        }
        return mayor;
    }
    
    public void calcularPotencia(){
        double resultado;
        if (Numeros.getN2() > Numeros.getN1()){
            resultado = Math.pow(Numeros.getN2(), Numeros.getN1());
        }else{ 
            resultado = Math.pow(Numeros.getN1(), Numeros.getN2());
        }
        System.out.println("La potencia es : " + Math.round(resultado));
    }
    
    public void  calculaRaiz(){
        //Math.min() se utiliza para obtener el valor absoluto y calcular el menor de los dos valores.
        //Math.abs() para obtener el valor absoluto de ambos números
        //Math.sqrt() Calcular la raíz cuadrada
        double menorNumero = Math.min(Math.abs(Numeros.getN1()), Math.abs(Numeros.getN2())); 
        double resultado = Math.sqrt(menorNumero); 
        System.out.println("La Raiz es : " + resultado);
    }
    
}
