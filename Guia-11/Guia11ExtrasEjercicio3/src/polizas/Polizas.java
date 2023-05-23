/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polizas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Polizas {

    /**
     * Se registrará una póliza, donde se guardará los datos tanto de un
     * vehículo, como los datos de un solo cliente. Los datos incluidos en ella
     * son: número de póliza, fecha de inicio y fin de la póliza, cantidad de
     * cuotas, forma de pago, monto total asegurado, incluye granizo, monto
     * máximo granizo, tipo de cobertura (total, contra terceros, etc.). Nota:
     * prestar atención al principio de este enunciado y pensar en las
     * relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a
     * muchos, de muchos a uno o de muchos a muchos
     */
    
    private Date fInicio;
    private Date fFin;
    private String formaPago;
    private String tipoCobertura;
    private int montoAsegurado;
    private int montoMaxGranizo;
    private int numPoliza;
    private boolean granizo;
    private Coutas coutas;

    public Polizas() {
    }

    public Polizas(Date fInicio, Date fFin, String tipoCobertura, int montoAsegurado, int montoMaxGranizo, int numPoliza, boolean granizo, Coutas coutas) {
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.formaPago = null;
        this.tipoCobertura = tipoCobertura;
        this.montoAsegurado = montoAsegurado;
        this.montoMaxGranizo = montoMaxGranizo;
        this.numPoliza = numPoliza;
        this.granizo = granizo;
        this.coutas = coutas;
    }
    
    public Coutas ingresoCoutas(){
        Scanner leer = new Scanner(System.in);
        System.out.println("--- INGRESO DE COUTAS DE LA POLIZA ---");
        coutas = new Coutas();
        
        /**
         * int numCouta
         * int montoCouta
         * boolean pago
         * Date fVencimiento
         * String formaDePago
         */
        
        System.out.println("Ingrese la Cantidad de Coutas : ");
        coutas.setNumCouta(leer.nextInt());
        System.out.println("Ingrese el Monto de la Couta : ");
        coutas.setMontoCouta(leer.nextInt());
        System.out.println("Ingrese la Fecha de vencimiento de la Couta : ");
        /**
         * Para TRABAJAR CON DATE este quilombo... 
         */
        boolean fechaValida = false;
        do {
            String fechaInicioStr = leer.next();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fechaInicio = dateFormat.parse(fechaInicioStr);
                System.out.println("Fecha de inicio de la póliza: " + fechaInicio);
                fechaValida = true;
                coutas.setfVencimiento(fechaInicio);
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido. Ingrese nuevamente:");
            }
        } while (!fechaValida);
        System.out.println("Ingrese la forma de Pago : ");
        coutas.setfDePago();
        
        return coutas;
    }
    

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public String getFormaPago() {
        coutas = new Coutas();
        return coutas.getfDePago();
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public int getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(int montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public Coutas getCoutas() {
        return coutas;
    }

    public void setCoutas() {
        this.coutas = ingresoCoutas();
    }

    @Override
    public String toString() {
        return "\n fecha de Inicio=" + fInicio + "\n fecha de Fin=" + fFin + "\n forma Pago=" + formaPago + "\n Tipo de Cobertura=" + tipoCobertura + "\n monto Asegurado=" + montoAsegurado + "\n montoMaxGranizo=" + montoMaxGranizo + "\n numPoliza=" + numPoliza + "\n granizo=" + granizo + "\n Coutas" + coutas;
    }

}
