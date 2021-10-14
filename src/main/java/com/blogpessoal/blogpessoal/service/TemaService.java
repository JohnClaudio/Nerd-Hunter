package com.blogpessoal.blogpessoal.service;



import com.blogpessoal.blogpessoal.model.Tema;

import com.blogpessoal.blogpessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemaService {

    @Autowired
    private TemaRepository repository;

    public List<Tema> findAll(){
        return repository.findAll();
    }
    public Tema insert(Tema Tema)
    {
        return repository.save(Tema);
    }

    public List<Tema> searchbyTitle (String title)
    {
        return repository.findAllByDescricaoContainingIgnoreCase(title);
    }
    public Tema getById(long id){

        Optional<Tema> Tema = repository.findById(id);
        return Tema.get();


    }
}
