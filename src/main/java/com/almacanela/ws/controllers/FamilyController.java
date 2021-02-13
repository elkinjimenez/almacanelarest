package com.almacanela.ws.controllers;

import java.util.ArrayList;

import com.almacanela.ws.models.FamilyModel;
import com.almacanela.ws.services.FamilyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    FamilyService familySer;

    @RequestMapping(value = "/queryFamilies", method = RequestMethod.GET)
    public ArrayList<FamilyModel> obtenerFamilias() {
        return familySer.getFamily();
    }
}
