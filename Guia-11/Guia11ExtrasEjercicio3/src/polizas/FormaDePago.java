/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polizas;

import java.util.Scanner;

/**
 * @author no_de
 */
public class FormaDePago {
    
    private final String efectivo = "Efectivo";
    private final String transBanca = "Transferencia bancaria";
    private final String tarjeBanca = "Tarjeta de crédito";
    private final String devAuto = "Débito automático";
    private final String pagoLinea = "Pago en línea";

    public FormaDePago() {
    }

    public String FormasDePago() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ELIGA LA FORMA DE PAGO : \n");
        System.out.println("OPCION 1 : Efectivo \n"
                + "OPCION 2 : Transferencia bancaria \n"
                + "OPCION 3 : Tarjeta de credito \n"
                + "OPCION 4 : Debito automatico \n"
                + "OPCION 5 : Pago en line \n");
        int var;
        String fDePago = "";
        do{
        var = leer.nextInt();
        switch (var) {
            case 1:
                fDePago = efectivo;
                break;
            case 2:
                fDePago = transBanca;
                break;
            case 3:
                fDePago = tarjeBanca;
                break;
            case 4:
                fDePago = devAuto;
                break;
            case 5:
                fDePago = pagoLinea;
                break;
            default:
                System.out.println("Ingreso Mal la OPCION vuelva a ingresar : ");
        }
        } while (var != 1 && var != 2 && var != 3 && var != 4 && var != 5);
        return fDePago;
    }
   
}
