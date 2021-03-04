package com.almacanela.api.services;

import java.util.List;

import com.almacanela.api.entities.Molde.Molde;
import com.almacanela.api.repositories.MoldeRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoldeServicio {

    @Autowired
    MoldeRepositorio moldeRepositorio;

    public List<Molde> listaMoldes() {
        List<Molde> listado = moldeRepositorio.findAll();
        return listado;
    }
}
