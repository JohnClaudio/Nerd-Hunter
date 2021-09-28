package com.blogpessoal.blogpessoal.service;



import com.blogpessoal.blogpessoal.model.Tema;
import com.blogpessoal.blogpessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService {

    @Autowired
    private TemaRepository repository;

    public List<Tema> findAll(){
        return repository.findAll();
    }
}
