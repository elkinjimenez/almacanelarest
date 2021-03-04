package com.almacanela.api.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_persona", nullable = false, unique = true)
    private Integer idPersona;
    // @Lob
    // @Getter
    // @Setter
    // @Column(name = "imagen")
    // private byte[] imagen;
    @Getter
    @Setter
    @Column(name = "identificacion", unique = true, nullable = false)
    private String identificacion;
    @Getter
    @Setter
    @Column(name = "nombres", nullable = false)
    private String nombres;
    @Getter
    @Setter
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Getter
    @Setter
    @Column(name = "direccion")
    private String direccion;
    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;
    @Getter
    @Setter
    @Column(name = "email", nullable = false)
    private String email;
    @Getter
    @Setter
    @Column(name = "ciudad")
    private String ciudad;
    @Getter
    @Setter
    @Column(name = "mes")
    private Integer mes;
    @Getter
    @Setter
    @Column(name = "dia")
    private Integer dia;
    @Getter
    @Setter
    @Column(name = "descripcion")
    private String descripcion;
}
