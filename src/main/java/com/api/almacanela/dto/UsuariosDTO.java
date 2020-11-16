/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.almacanela.dto;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author jimenezelkg
 */
@Data
public class UsuariosDTO implements Serializable {

    private int idUsuario;

    private String estado;

    private String usuario;

    private String descripcion;

}
