package com.blogpessoal.blogpessoal.controller;

import com.blogpessoal.blogpessoal.model.Usuario;
import com.blogpessoal.blogpessoal.repository.UsuarioRepository;
import com.blogpessoal.blogpessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> findAll(){
        return service.findAll();

    }
}
