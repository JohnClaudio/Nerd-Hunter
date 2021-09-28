package com.blogpessoal.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogpessoal.blogpessoal.model.Postagem;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
