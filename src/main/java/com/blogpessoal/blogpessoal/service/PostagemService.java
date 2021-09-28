package com.blogpessoal.blogpessoal.service;

import com.blogpessoal.blogpessoal.model.Postagem;
import com.blogpessoal.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PostagemService {

    @Autowired
    private PostagemRepository repository;

    public List<Postagem> findAll(){
        return repository.findAll();
    }

    public Postagem insert(Postagem postagem)
    {
        return repository.save(postagem);
    }

    public List<Postagem> searchbyTitle (String title)
    {
        return repository.findAllByTituloContainingIgnoreCase(title);
    }
    public Postagem getById(long id){

            Optional<Postagem> postagem = repository.findById(id);
            return postagem.get();


    }

}
