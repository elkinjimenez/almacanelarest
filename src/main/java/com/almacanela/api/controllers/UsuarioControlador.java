package com.almacanela.api.controllers;

import com.almacanela.api.entities.Usuario;
import com.almacanela.api.services.UsuarioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio usuServicio;

    @RequestMapping(value = "/inicioSesion", method = RequestMethod.GET)
    public Usuario inicioSesion(@RequestParam("usuario") String usuario, @RequestParam("clave") String clave) {
        return usuServicio.inicioSesion(usuario, clave);
    }

}
