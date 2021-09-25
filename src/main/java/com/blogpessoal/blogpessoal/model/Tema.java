package com.blogpessoal.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_temas")
public class Tema {

    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_tema ;

    @NotNull(message="O campo descricao não pode ser nulo")
    String descricao ;
}
