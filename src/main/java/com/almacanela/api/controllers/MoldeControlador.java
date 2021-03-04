package com.almacanela.api.controllers;

import java.util.List;

import com.almacanela.api.entities.Molde.Molde;
import com.almacanela.api.services.MoldeServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "molde")
public class MoldeControlador {

    @Autowired
    MoldeServicio moldeServicio;

    @RequestMapping(value = "/listado", method = RequestMethod.GET)
    public List<Molde> listado() {
        List<Molde> listado = moldeServicio.listaMoldes();
        return listado;
    }
}
