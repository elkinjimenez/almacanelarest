package com.almacanela.ws.repositories;

import com.almacanela.ws.models.Family;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer> {
    
}
