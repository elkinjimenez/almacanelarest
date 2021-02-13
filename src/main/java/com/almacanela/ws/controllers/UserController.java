package com.almacanela.ws.controllers;

import com.almacanela.ws.models.User;
import com.almacanela.ws.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User obtenerFamilias(@RequestParam("usuario") String usuario, @RequestParam("clave") String clave) {
        User usuarioLogueado = userService.login(usuario, clave);
        usuarioLogueado.setClave(null);
        return userService.login(usuario, clave);
    }

}
