package com.almacanela.ws.services;

import java.util.ArrayList;

import com.almacanela.ws.models.User;
import com.almacanela.ws.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getUser() {
        return (ArrayList<User>) userRepository.findAll();
    }

    public User login(String usuario, String clave) {
        User usuarioLogueado = userRepository.findByUsuarioAndClave(usuario, clave);
        return usuarioLogueado;
    }
}
