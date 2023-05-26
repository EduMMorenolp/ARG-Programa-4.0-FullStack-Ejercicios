package Entidades;

import java.util.HashSet;

public class Votos {

    private Alumnos alumno;
    private HashSet<Alumnos> votados;

    public Votos() {
    }

    public Votos(Alumnos alumno, HashSet<Alumnos> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumnos> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumnos> votados) {
        this.votados = votados;
    }
}
