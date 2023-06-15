/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extrasejercicio3;

import clientes.Clientes;
import java.util.ArrayList;
import java.util.Scanner;
import servicioaseguradora.servicioAseguradora;
import vehiculos.Vehiculos;

/**
 *
 * @author no_de
 */
public class Guia11ExtrasEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Ha llegado el momento de poner de prueba tus conocimientos. Para te
         * vamos a contar que te ha contratado “La Tercera Seguros”, una empresa
         * aseguradora que brinda a sus clientes coberturas integrales para
         * vehículos. Luego de un pequeño relevamiento, te vamos a pasar en
         * limpio los requerimientos del sistema que quiere realizar la empresa.
         * 12 a. Gestión Integral de clientes. En este módulo vamos a registrar
         * la información personal de cada cliente que posea pólizas en nuestra
         * empresa. Nombre y apellido, documento, mail, domicilio, teléfono. b.
         * Gestión de vehículos. Se registra la información de cada vehículo
         * asegurado. Marca, modelo, año, número de motor, chasis, color, tipo
         * (camioneta, sedán, etc.). c. Gestión de Pólizas: Se registrará una
         * póliza, donde se guardará los datos tanto de un vehículo, como los
         * datos de un solo cliente. Los datos incluidos en ella son: número de
         * póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma
         * de pago, monto total asegurado, incluye granizo, monto máximo
         * granizo, tipo de cobertura (total, contra terceros, etc.). Nota:
         * prestar atención al principio de este enunciado y pensar en las
         * relaciones entre clases. Recuerden que pueden ser de uno a uno, de
         * uno a muchos, de muchos a uno o de muchos a muchos. d. Gestión de
         * cuotas: Se registrarán y podrán consultar las cuotas generadas en
         * cada póliza. Esas cuotas van a contener la siguiente información:
         * número de cuota, monto total de la cuota, si está o no pagada, fecha
         * de vencimiento, forma de pago (efectivo, transferencia, etc.).
         * Debemos realizar el diagrama de clases completo, teniendo en cuenta
         * todos los requerimientos arriba descriptos. Modelando clases con
         * atributos y sus correspondientes relaciones.
         */
        
        servicioAseguradora seguro = new servicioAseguradora();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Clientes> listaClientes = new ArrayList<>();
        ArrayList<Vehiculos> listaVehiculos = new ArrayList<>();
        String resp;
        int var;

        
        
        
        System.out.println("--- BIENVENIDO A LA TERCERA SEGUROS ---");
        do {
            System.out.println("Ingrese una OPCION \n"
                    + "OPCION 1 - ingreso de Cliente \n"
                    + "OPCION 2 - ingreso de Nuevo Vehiculo y Su Poliza \n"
                    + "OPCION 3 - Mostrar Cliente y Sus Vehiculos \n"
                    + "OPCION 4 - SALIR");
            var = leer.nextInt();
            switch (var) {
                case 1:
                    System.out.println("-- INGRESE LOS DATOS DEL CLIENTE -- ");
                    listaClientes.add(seguro.ingresoClientes());
                    break;
                case 2:
                    for (Clientes listaCliente : listaClientes) {
                        System.out.println("-- INGRESE LOS DATOS DEL VEHICULO DEL CLIENTE -- ");
                        System.out.println(listaCliente.toString());
                        System.out.println("Desea seleccionar este cliente ? S/N : ");
                        resp = leer.next().toUpperCase();
                        if (resp.equals("S")) {
                            System.out.println("Agregarle un vehiculo a" + listaCliente.getNombre());
                            Vehiculos auto = seguro.ingresoVehiculo();
                            System.out.println("-- INGRESANDO POLIZA DE SEGUROS --");
                            auto.setPoliza(seguro.ingresoPoliza());
                            listaVehiculos.add(auto);
                            listaCliente.setAutos(listaVehiculos);
                        }
                    }
                    break;
                case 3:
                    System.out.println("-- MOSTRANDO CLIENTES --");
                    for (Clientes listaCliente : listaClientes) {
                        System.out.println(listaCliente.toString());
                    }
                    break;
                case 4:
                    System.out.println("Adios...");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (var != 4);
    }
}
