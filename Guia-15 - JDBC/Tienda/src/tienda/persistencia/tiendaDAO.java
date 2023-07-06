/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.fabricante;
import tienda.entidades.producto;

/**
 *
 * @author no_de
 */
public final class tiendaDAO extends DAO{
    
     /*
    -- PETICIONES A LA BASE DE DATOS;

    -- a) Lista el nombre de todos los productos que hay en la tabla producto.
    select nombre from producto;
    -- b) Lista los nombres y los precios de todos los productos de la tabla producto. 
    select nombre, precio from producto;
    -- c) Listar aquellos productos que su precio esté entre 120 y 202. 
    select * from producto where precio between 120 and 200;
    -- d) Buscar y listar todos los Portátiles de la tabla producto. 
    select * from producto where nombre like "%Portatil%";
    -- e) Listar el nombre y el precio del producto más barato. 
    select nombre, precio from producto order by precio limit 1;
    -- f) Ingresar un producto a la base de datos.
    INSERT INTO producto VALUES (nombre, precio, codigo_fabricante);
    -- g) Ingresar un fabricante a la base de datos
    INSERT INTO fabricante VALUES (nombre);
    -- h) Editar un producto con datos a elección.
    update producto set precio = 755 where codigo = 5;  
    */
    
     public ArrayList<producto> listaProductos() throws Exception {
         try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            producto p;
            ArrayList<producto> productos = new ArrayList();
            while (resultado.next()) {
                p = new producto();
                p.setCodigo(resultado.getInt("codigo"));
                p.setNombre(resultado.getString("nombre"));
                p.setPrecio(resultado.getInt("precio"));
                p.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productos.add(p);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
     
    public void ingresarProducto(producto p) throws Exception {
        try {
             if (p == null) {
                throw new Exception("Error al ingresar el producto");
            }
            String sql = "INSERT INTO producto VALUES ('" + p.getNombre() + "','" + p.getCodigo() + "','" + p.getCodigoFabricante() + "')"   ;
            insertarModificarEliminar(sql); 
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    } 
    
    public void ingresarFabricante(fabricante f) throws Exception {
        try {
             if (f == null) {
                throw new Exception("Error al ingresar el fabricante");
            }
            String sql = "INSERT INTO producto VALUES ('" + f.getNombre() + "','" + f.getCodigo()+ "')"   ;
            insertarModificarEliminar(sql); 
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void editarProducto(producto p)throws Exception {
        try {
            if (p == null) {
                throw new Exception("Error al editar el producto");
            }
            String sql = "UPDATE producto set nombre = '" + p.getNombre()+ "' precio = '" + p.getPrecio()+ "' codigo_fabricante = '" + p.getCodigoFabricante()
                    + "' where codigo = '" + p.getCodigo() + "'"; 
            insertarModificarEliminar(sql);
            
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
