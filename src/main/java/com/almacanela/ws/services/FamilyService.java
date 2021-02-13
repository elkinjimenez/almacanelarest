package com.almacanela.ws.services;

import java.util.ArrayList;

import com.almacanela.ws.models.Family;
import com.almacanela.ws.repositories.FamilyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {
    @Autowired
    FamilyRepository familyRep;

    public ArrayList<Family> getFamily() {
        return (ArrayList<Family>) familyRep.findAll();
    }
}
