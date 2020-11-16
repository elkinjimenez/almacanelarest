/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.almacanela.controllers;

import com.api.almacanela.services.interfaces.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jimenezelkg
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/usuarios")
public class ApiController {

    @Autowired
    private IUsuariosService usuarioService;

    @GetMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok(this.usuarioService.findAll());
    }

}
