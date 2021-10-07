package com.blogpessoal.blogpessoal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tb_temas")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_tema ;

    @NotNull(message="O campo descricao não pode ser nulo")
    String descricao ;

    @OneToMany(mappedBy = "id_tema")
    @JsonIgnoreProperties("id_tema")
    List<Postagem> postagens;


}
