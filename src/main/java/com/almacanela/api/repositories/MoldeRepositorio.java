package com.almacanela.api.repositories;

import java.util.List;

import com.almacanela.api.entities.Molde.Molde;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoldeRepositorio extends CrudRepository<Molde, Integer> {
    public abstract List<Molde> findAll();
}
