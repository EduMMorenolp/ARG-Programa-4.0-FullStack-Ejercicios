/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polizas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Coutas {

    /**
     * : Se registrarán y podrán consultar las cuotas generadas en cada póliza.
     * Esas cuotas van a contener la siguiente información: número de cuota,
     * monto total de la cuota, si está o no pagada, fecha de vencimiento, forma
     * de pago (efectivo, transferencia, etc.).
     */
    
    private int numCouta;
    private int montoCouta;
    private boolean pago;
    private Date fVencimiento;
    private String fDePago;

    public Coutas() {
    }

    public Coutas(int numCouta, int montoCouta, boolean pago, Date fVencimiento) {
        this.numCouta = numCouta;
        this.montoCouta = montoCouta;
        this.pago = pago;
        this.fVencimiento = fVencimiento;
    }

    public int getNumCouta() {
        return numCouta;
    }

    public void setNumCouta(int numCouta) {
        this.numCouta = numCouta;
    }

    public int getMontoCouta() {
        return montoCouta;
    }

    public void setMontoCouta(int montoCouta) {
        this.montoCouta = montoCouta;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Date getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(Date fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public String setfDePago() {
        return fDePago = FormasDePago();
    }

    public String getfDePago() {
        return fDePago;
    }

    @Override
    public String toString() {
        return "\n numCouta=" + numCouta + "\n montoCouta=" + montoCouta + "\n pago=" + pago + "\n fecha Vencimiento=" + fVencimiento + "\n forma de Pago=" + fDePago;
    }
    
    public String FormasDePago() {
        Scanner leer = new Scanner(System.in);
        FormaDePago fdp = new FormaDePago();
        System.out.println("ELIGA LA FORMA DE PAGO : \n");
        System.out.println("OPCION 1 : Efectivo \n"
                + "OPCION 2 : Transferencia bancaria \n"
                + "OPCION 3 : Tarjeta de credito \n"
                + "OPCION 4 : Debito automatico \n"
                + "OPCION 5 : Pago en line \n");
        int var;
        String fDePago = " ";
        do{
        var = leer.nextInt();
        switch (var) {
            case 1:
                fDePago = fdp.getEfectivo();
                break;
            case 2:
                fDePago = fdp.getTransBanca();
                break;
            case 3:
                fDePago = fdp.getTarjeBanca();
                break;
            case 4:
                fDePago = fdp.getDevAuto();
                break;
            case 5:
                fDePago = fdp.getPagoLinea();
                break;
            default:
                System.out.println("Ingreso Mal la OPCION vuelva a ingresar : ");
        }
        } while (var != 1 && var != 2 && var != 3 && var != 4 && var != 5);
        return fDePago;
    }
    
}