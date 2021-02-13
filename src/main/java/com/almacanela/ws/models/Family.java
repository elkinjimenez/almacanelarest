package com.almacanela.ws.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "familia")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "id_familia", unique = true, nullable = false)
    private Integer idFamilia;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "codigo", unique = true, nullable = false)
    private int codigo;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;
    @Getter
    @Setter
    @Column(name = "descripcion")
    private String descripcion;

}
