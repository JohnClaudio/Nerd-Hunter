package com.blogpessoal.blogpessoal.repository;

import com.blogpessoal.blogpessoal.model.Tema;
import com.blogpessoal.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public List<Usuario> findAllByUsuarioContainingIgnoreCase(String titulo);

}
