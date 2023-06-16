/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio4;

/**
 *
 * @author no_de
 */
public class Exception extends Guia13Ejercicio4 {

    /**
     * Creates a new instance of <code>Exception</code> without detail message.
     */
    public Exception() {
    }

    /**
     * Constructs an instance of <code>Exception</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Exception(String msg) {
        System.out.println(msg);
        //super(msg);
    }
}
