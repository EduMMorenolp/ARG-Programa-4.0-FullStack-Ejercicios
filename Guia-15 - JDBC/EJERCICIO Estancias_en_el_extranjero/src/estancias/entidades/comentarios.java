/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.entidades;

/**
 *
 * @author no_de
 */
public class comentarios {

    private int id_casa;
    private String comentario;

    public comentarios() {
    }

    public comentarios(int id_casa, String comentario) {
        this.id_casa = id_casa;
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    @Override
    public String toString() {
        return "\n Comentarios : " + "\n id_casa : " + id_casa + "\n Comentario : " + comentario;
    }
}
