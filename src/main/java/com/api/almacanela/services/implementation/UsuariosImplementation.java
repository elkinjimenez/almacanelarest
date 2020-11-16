/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.almacanela.services.implementation;

import com.api.almacanela.dto.UsuariosDTO;
import com.api.almacanela.repositories.UsuariosDAO;
import com.api.almacanela.entities.Usuarios;
import com.api.almacanela.services.interfaces.IUsuariosService;
import com.api.almacanela.utils.MHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

/**
 *
 * @author jimenezelkg
 */
@Component
public class UsuariosImplementation implements IUsuariosService {

    @Autowired
    private UsuariosDAO usuariosRepository;

    @Override
    public Page<UsuariosDTO> findAll() {
        Page<Usuarios> usuarios = this.usuariosRepository.findAll();
        return usuarios.map(this::convertToUsuariosDTO);
    }

    @Override
    public UsuariosDTO findByUsuario(String usuario) {
        Optional<Usuarios> usuarios = this.usuariosRepository.findByUsuario(usuario);
        if (!usuarios.isPresent()) {
            return null;
        } else {
            return MHelpers.modelMapper().map(usuarios.get(), UsuariosDTO.class);
        }
    }

    @Override
    public UsuariosDTO findByIdUsuario(int idUsuario) {
        Optional<Usuarios> usuarios = this.usuariosRepository.findById(idUsuario);
        if (!usuarios.isPresent()) {
            return null;
        } else {
            return MHelpers.modelMapper().map(usuarios.get(), UsuariosDTO.class);
        }
    }

    @Override
    public void save(UsuariosDTO usuario) {
        Usuarios usuarios = MHelpers.modelMapper().map(usuario, Usuarios.class);
        this.usuariosRepository.save(usuarios);
    }

    @Override
    public void saveAll(List<UsuariosDTO> usuarios) {
        List<Usuarios> u = new ArrayList<>();
        for (UsuariosDTO user : usuarios) {
            Usuarios us = MHelpers.modelMapper().map(user, Usuarios.class);
            u.add(us);
        }
        this.usuariosRepository.saveAll(u);
    }

    @Override
    public void deleteById(int idUsuario) {
        this.usuariosRepository.deleteById(idUsuario);
    }

    private UsuariosDTO convertToUsuariosDTO(final Usuarios usuarios) {
        return MHelpers.modelMapper().map(usuarios, UsuariosDTO.class);
    }

}
