package com.almacanela.ws.repositories;

import com.almacanela.ws.models.FamilyModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepositories extends CrudRepository<FamilyModel, Integer> {
    
}
