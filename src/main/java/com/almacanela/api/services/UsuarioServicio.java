package com.almacanela.api.services;

import com.almacanela.api.entities.Usuario;
import com.almacanela.api.repositories.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuRepositorio;

    public Usuario inicioSesion(String usuario, String clave) {
        Usuario usuarioLogueado = usuRepositorio.findByUsuarioAndClave(usuario, clave);
        if (usuarioLogueado != null) {
            usuarioLogueado.setClave(null);
            usuarioLogueado.setEstadoRespuesta(true);
        } else {
            Usuario vacio = new Usuario();
            vacio.setEstadoRespuesta(false);
            usuarioLogueado = vacio;
        }
        return usuarioLogueado;
    }

}
