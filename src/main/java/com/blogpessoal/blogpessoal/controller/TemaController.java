package com.blogpessoal.blogpessoal.controller;

import com.blogpessoal.blogpessoal.model.Tema;
import com.blogpessoal.blogpessoal.model.Tema;
import com.blogpessoal.blogpessoal.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value="/id/{id}", method= RequestMethod.GET)
    public ResponseEntity<Tema>  getById(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok().body(service.getById(id));

    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity <List<Tema>> GetByTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(service.searchbyTitle(titulo));
    }

    @PostMapping()
    public ResponseEntity<Tema> insert (@RequestBody Tema Tema)
    {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(Tema));

    }

    @PutMapping()
    public ResponseEntity<Tema> update (@RequestBody Tema Tema)
    {
        return ResponseEntity.status(HttpStatus.OK).body(TemaService.insert(Tema));

    }
}
