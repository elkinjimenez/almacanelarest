package com.almacanela.api.entities.Molde;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "molde")
public class Molde {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "id_molde", nullable = false, unique = true)
    private Integer idMolde;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "item")
    private String item;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "codigo", nullable = false)
    private String codigo;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "estado")
    private String estado;
    // @Lob
    // @Getter
    // @Setter
    // @Column(name = "imagen")
    // private String imagen;
    @Basic(optional = false)
    @Getter
    @Setter
    @Column(name = "consumo", nullable = false)
    private float consumo;
}
