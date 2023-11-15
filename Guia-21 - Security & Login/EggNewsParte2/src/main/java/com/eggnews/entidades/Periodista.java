package com.eggnews.entidades;
import javax.persistence.*;

import com.eggnews.enumeraciones.Rol;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = false) 
/*
 * "message": "Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.",
 * 
 * El mensaje de error indica que Lombok está generando el método equals y hashCode automáticamente para tu clase Periodista, pero no está llamando al método equivalente de la superclase (Usuario). Para solucionar este problema, puedes agregar la anotación @EqualsAndHashCode(callSuper = false) en tu clase Periodista para indicar explícitamente que no debe llamar al método equals y hashCode de la superclase
 * 
 */
public class Periodista extends Usuario {

    // Parece que Hibernate no admite directamente la colección ArrayList como tipo de propiedad para la relación @OneToMany 
    @OneToMany(mappedBy = "creador")
    private List<Noticia> misNoticias;

    private Integer sueldoMensual;

    // Constructor por defecto (necesario para JPA)
    public Periodista() {
        this.misNoticias = new ArrayList<>(); 
    }

    // Constructor con parámetros
    public Periodista(String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo,
            ArrayList<Noticia> misNoticias, Integer sueldoMensual) {
        super(nombreUsuario, password, fechaAlta, rol, activo);
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
    }
}