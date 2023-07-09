/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import estancias.entidades.*;
import estancias.persistencia.familiasDAO;
import java.util.ArrayList;

/**
 *
 * @author no_de
 */
public class familiasServicio {

    public void listarFamilias(String opc) throws Exception {

        familiasDAO fdao = new familiasDAO();
        ArrayList<familias> familias = new ArrayList();
        if (opc.equals("a")) {
            familias = fdao.listarfamilia(opc);
        }
        if (opc.equals("d")) {
            familias = fdao.listarfamilia(opc);
        }
        for (familias aux : familias) {
            System.out.println(aux.toString());
        }
    }
}
