/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.servicios.tiendaServicio;

/**
 *
 * @author no_de
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Tienda Nos han pedido que hagamos una aplicación Java para una tienda
         * con sus productos. El objetivo es realizar consultas para saber el
         * stock de ciertos productos o que productos hay, etc. Utilizando el
         * lenguaje JAVA, una base de datos MySQL y JDBC para realizar la
         * ejecución de operaciones sobre la base de datos (BD). Para este
         * ejercicio vamos a usar el script de la base de datos llamada
         * “tienda.sql” que lo trabajamos en la guía de MySql, igualmente lo van
         * a encontrar dentro del archivo persistencia.zip. Deberá obtener un
         * diagrama de entidad relación igual al que se muestra a continuación:
         * Paquetes del Proyecto Java Crear un nuevo proyecto en Netbeans del
         * tipo “Java Application” con el nombre Tienda y agregar dentro 3
         * paquetes, a uno se lo llamará entidades, al otro se le llamará
         * servicios y al otro persistencia: 13 Para crear los paquetes de esta
         * manera, se deben crear desde el paquete principal, sería nos paramos
         * en el paquete tienda -> Click derecho -> New Java Package y creamos
         * los paquetes. También es importante agregar en “Libraries” la
         * librería “MySQL JDBC Driver” para permitir conectar la aplicación de
         * Java con la base de datos MySQL. Esto se explica en el Instructivo
         * que ya leíste al final de esta guía.
         */
        /*
         Paquete persistencia
        En este paquete estará la clase DAO encarga de conectarse con la base de datos y de 
        comunicarse con la base de datos para obtener sus datos. Además, estará las clases de 
        EntidadDaoExt para cada entidad / tabla de nuestro proyecto.
        Es importante tener la conexión creada a la base de datos, como lo explica el Instructivo en la 
        pestaña de Services en Netbeans.
        Paquete entidades:
        Dentro de este paquete se deben crear todas las clases necesarias que vamos a usar de la 
        base de datos. Por ejemplo, una de las clases a crear dentro de este paquete es la clase 
        “Producto.java” con los siguientes atributos:
        • private int codigo;
        • private String nombre;
        • private double precio;
        • private int codigoFabricante;
        Agregar a cada clase el/los constructores necesarios y los métodos públicos getters y setters 
        para poder acceder a los atributos privados de la clase. La llave foránea se pondrá como dato 
        nada más, no como objeto.
        Paquete servicios:
        En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En 
        general se crea un servicio para administrar cada una de las entidades y algunos servicios 
        para manejar operaciones muy específicas como las estadísticas.
        Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar. 
        Las consultas a realizar sobre la BD son las siguientes:
            a) Lista el nombre de todos los productos que hay en la tabla producto. 
            b) Lista los nombres y los precios de todos los productos de la tabla producto. 
            c) Listar aquellos productos que su precio esté entre 120 y 202. 
            d) Buscar y listar todos los Portátiles de la tabla producto. 
            e) Listar el nombre y el precio del producto más barato. 
            f) Ingresar un producto a la base de datos.
            g) Ingresar un fabricante a la base de datos
            h) Editar un producto con datos a elección.
         */
        
        tiendaServicio ts = new tiendaServicio();
        try{
        
            ts.Menu();
            
        } catch ( Exception e){
            System.out.println(e);
        }
    }

}
