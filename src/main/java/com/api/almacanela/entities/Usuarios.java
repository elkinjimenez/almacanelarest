/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.almacanela.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author jimenezelkg
 */
@Data
@Entity
@Table(name = "suario")
public class Usuarios implements Serializable {

    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "estado")
    private String estado;

    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "id_persona")
    private int idPersona;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "clave")
    private String clave;

    @Column(name = "descripcion")
    private String descripcion;

}
