/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.Enum;

/**
 *
 * @author no_de
 */
public enum entidadesEnum {
    
    LIBRO,
    EDITORIAL,
    AUTOR,
    CLIENTE,
    PRESTAMO;

    public static entidadesEnum getCLIENTE() {
        return CLIENTE;
    }

    public static entidadesEnum getPRESTAMO() {
        return PRESTAMO;
    }

    public static entidadesEnum getLIBRO() {
        return LIBRO;
    }

    public static entidadesEnum getEDITORIAL() {
        return EDITORIAL;
    }

    public static entidadesEnum getAUTOR() {
        return AUTOR;
    }
  
}
