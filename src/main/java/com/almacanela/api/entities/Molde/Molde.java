package com.almacanela.api.entities.Molde;

import javax.persistence.*;

public class Molde {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_molde", nullable = false, unique = true)
    private Integer idMolde;
    @Basic(optional = false)
    @Column(name = "item")
    private String item;
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private String codigo;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Lob
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @Column(name = "consumo", nullable = false)
    private float consumo;
}
