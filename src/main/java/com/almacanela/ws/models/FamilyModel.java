package com.almacanela.ws.models;

import javax.persistence.*;

@Entity
@Table(name = "familia")
public class FamilyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_familia", unique = true, nullable = false)
    private Integer idFamilia;
    @Basic(optional = false)
    @Column(name = "codigo", unique = true, nullable = false)
    private int codigo;
    @Basic(optional = false)
    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
