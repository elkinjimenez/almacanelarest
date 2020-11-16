/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.almacanela.services.interfaces;

import com.api.almacanela.dto.UsuariosDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 *
 * @author jimenezelkg
 */

@Service
public interface IUsuariosService {
    
    Page<UsuariosDTO> findAll();
    
    UsuariosDTO findByUsuario(String usuario);
    
    UsuariosDTO findByIdUsuario(int idUsuario);
    
    void save(UsuariosDTO usuario);
    
    void saveAll(List<UsuariosDTO> usuarios);
    
    void deleteById(int idUsuario);
    
}
