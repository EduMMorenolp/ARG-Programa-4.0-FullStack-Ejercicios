package Entidades;

public class Alumnos {
    
    /**
     * Agregar votos que hizo el alumno
     */
    
    private int dni;
    private int cantidadVotos;
    private String nombreCompleto;
    private Votos votos;

    //<-------------------------------------------------------->
    
    public Votos getVotos() {
        return votos;
    }

    public void setVotos(Votos votos) {
        this.votos = votos;
    }
    
    //<-------------------------------------------------------->

    public Alumnos() {
    }

    public Alumnos(int dni, int cantidadVotos, String nombreCompleto) {
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "dni=" + dni + ", cantidadVotos=" + cantidadVotos + ", nombreCompleto=" + nombreCompleto + ", votos=" + votos + '}';
    }
}
