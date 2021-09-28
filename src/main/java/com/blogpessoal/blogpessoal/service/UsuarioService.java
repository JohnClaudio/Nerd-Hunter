package com.blogpessoal.blogpessoal.service;

import com.blogpessoal.blogpessoal.model.Usuario;
import com.blogpessoal.blogpessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository service;

    public List<Usuario> findAll(){
        return service.findAll();
    }
}
