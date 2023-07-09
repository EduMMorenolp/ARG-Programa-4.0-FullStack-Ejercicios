/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.persistencia;

import estancias.entidades.*;
import java.util.ArrayList;

/**
 *
 * @author no_de
 */
public class familiasDAO extends DAO {

    /*
    -- a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.

        select * from familias where num_hijos >= 3 and edad_maxima < 10;
    
    -- c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.

    select * from familias where email like '%hotmail%';
     */
    public ArrayList<familias> listarfamilia(String opc) throws Exception {
        String sql = "select * from familias";
//        if ("a".equals(opc)) {
//            sql = "select * from familias where num_hijos >= 3 and edad_maxima < 10 ";
//        } else if ("c".equals(opc)) {
//            sql = "select * from familias where email like '%hotmail%' ";
//        }
        ArrayList<familias> listafamilias = new ArrayList();
        familias f;
        try {
            consultarBase(sql);
            while (resultado.next()) {
                f = new familias();              
                f.setNombre(resultado.getString(2));
                f.setEdad_minima(resultado.getInt(3));
                f.setEdad_maxima(resultado.getInt(4));
                f.setNum_hijos(resultado.getInt(5));
                f.setEmail(resultado.getString(6));
                f.setId_casa_familia(resultado.getInt(7));
                listafamilias.add(f);
            }
        } catch (Exception c) {
            System.out.println("ERROR en listaFamilias ");
            System.out.println(c);
        } finally {
            desconectarBase();
        }
        return listafamilias;
    }
}
