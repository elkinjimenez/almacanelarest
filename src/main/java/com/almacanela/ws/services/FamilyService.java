package com.almacanela.ws.services;

import java.util.ArrayList;

import com.almacanela.ws.models.FamilyModel;
import com.almacanela.ws.repositories.FamilyRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {
    @Autowired
    FamilyRepositories familyRep;

    public ArrayList<FamilyModel> getFamily() {
        return (ArrayList<FamilyModel>) familyRep.findAll();
    }
}
