package com.almacanela.api.repositories;

import com.almacanela.api.entities.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
    public abstract Usuario findByUsuarioAndClave(String usuario, String clave);
}
