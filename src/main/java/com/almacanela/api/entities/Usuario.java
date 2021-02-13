package com.almacanela.api.entities;

import javax.persistence.*;

import com.almacanela.api.models.RespuestaServicio;

import lombok.*;

@Entity
@Table(name = "usuario")
public class Usuario extends RespuestaServicio {

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
