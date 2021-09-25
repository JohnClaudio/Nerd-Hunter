package com.blogpessoal.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @NotNull()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int usuario_id;

    @NotNull(message="O nome do usuario não pode ser nulo")
    String nome ;

    @NotNull(message="O nome do usuario não pode ser nulo")
    @Size(min = 5, max=70, message= "O campo nome não pode ultrapassar 70 caracteres e min 5")
    String usuario ;

    @NotNull(message="O nome do usuario não pode ser nulo")
    String senha ;
}
