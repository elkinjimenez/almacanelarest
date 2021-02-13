package com.almacanela.ws.controllers;

import java.util.ArrayList;

import com.almacanela.ws.models.Family;
import com.almacanela.ws.services.FamilyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    FamilyService familySer;

    @RequestMapping(value = "/queryFamilies", method = RequestMethod.GET)
    public ArrayList<Family> obtenerFamilias() {
        return familySer.getFamily();
    }
}
