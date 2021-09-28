package com.blogpessoal.blogpessoal.controller;

import com.blogpessoal.blogpessoal.model.Tema;
import com.blogpessoal.blogpessoal.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    private TemaService service;

    @GetMapping
    public List<Tema> findAll(){
        return service.findAll();
    }
}
