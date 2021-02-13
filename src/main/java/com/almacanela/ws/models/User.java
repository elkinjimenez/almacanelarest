package com.almacanela.ws.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Getter
    @Setter
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "usuario", unique = true, nullable = false)
    private String usuario;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "clave", nullable = false)
    private String clave;
    @Column(name = "descripcion")
    @Getter
    @Setter
    private String descripcion;

}