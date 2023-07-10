/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import estancias.entidades.*;
import estancias.persistencia.casasDAO;
import java.util.ArrayList;

/**
 *
 * @author no_de
 */
public class casasServicio {
    
    public void listarCasas(String opc) throws Exception {

        casasDAO fdao = new casasDAO();
        ArrayList<casas> casas;
      
        casas = fdao.listarCasas(opc);
        
        for (casas aux : casas) {
            System.out.println(aux.toString());
        }
    }
    
}
