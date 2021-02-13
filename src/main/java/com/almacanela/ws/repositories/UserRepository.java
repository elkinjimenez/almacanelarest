package com.almacanela.ws.repositories;

import com.almacanela.ws.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public abstract User findByUsuarioAndClave(String usuario, String clave);
}
