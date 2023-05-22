/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polizas;

import java.util.Date;

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
        return fDePago = new FormaDePago().FormasDePago();
    }

    public String getfDePago() {
        return fDePago;
    }

    @Override
    public String toString() {
        return "Coutas{" + "numCouta=" + numCouta + ", montoCouta=" + montoCouta + ", pago=" + pago + ", fVencimiento=" + fVencimiento + ", fDePago=" + fDePago + '}';
    }
    
    
    
}