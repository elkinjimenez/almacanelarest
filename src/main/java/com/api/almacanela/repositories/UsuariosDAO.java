/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.almacanela.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.almacanela.entities.Usuarios;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jimenezelkg
 */
@Repository
public interface UsuariosDAO extends CrudRepository<Usuarios, Integer> {

    @Transactional(readOnly = true)
    Optional<Usuarios> findByUsuario(String usuario);
    
    @Override
    Page<Usuarios> findAll();
    
}
