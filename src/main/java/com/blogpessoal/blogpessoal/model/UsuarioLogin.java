package com.blogpessoal.blogpessoal.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioLogin {

    private long id;
    private String nome;
    private String usuario;
    private String senha;
    private String token;

}