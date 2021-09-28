package com.blogpessoal.blogpessoal.controller;

import com.blogpessoal.blogpessoal.model.Postagem;
import com.blogpessoal.blogpessoal.repository.PostagemRepository;
import com.blogpessoal.blogpessoal.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

    @Autowired
    private PostagemService postagemService;

    @GetMapping()
    public ResponseEntity<List<Postagem>> getAll()
    {
        List<Postagem> list = postagemService.findAll();
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value="/id/{id}", method= RequestMethod.GET)
    public ResponseEntity<Postagem>  getById(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok().body(postagemService.getById(id));

    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity <List<Postagem>> GetByTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(postagemService.searchbyTitle(titulo));
    }

    @PostMapping()
    public ResponseEntity<Postagem> insert (@RequestBody Postagem postagem)
    {

        return ResponseEntity.status(HttpStatus.CREATED).body(postagemService.insert(postagem));

    }

    @PutMapping()
    public ResponseEntity<Postagem> update (@RequestBody Postagem postagem)
    {
        return ResponseEntity.status(HttpStatus.OK).body(postagemService.insert(postagem));

    }




}
