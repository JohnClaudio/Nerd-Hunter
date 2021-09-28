package com.blogpessoal.blogpessoal.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_temas")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_tema ;

    @NotNull(message="O campo descricao não pode ser nulo")
    String descricao ;


    public long getId_tema() {
        return id_tema;
    }

    public void setId_tema(long id_tema) {
        this.id_tema = id_tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
