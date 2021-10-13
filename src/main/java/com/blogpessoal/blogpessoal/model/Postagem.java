package com.blogpessoal.blogpessoal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "tb_postagens")
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "o campo titulo não pode ser nullo")
    @Size(min = 5 , max=100)
    private String titulo;

    @NotNull(message="o campo texto nao pode ser nulo")
    @Size(min = 5, max = 600, message =" o campo deste atributo não pode ser menor que 10 e maior que 600 caracteres")
    private String texto;


    @NotNull(message="O CAMPO TEMA NAO PODE SER NULO")
    @ManyToOne
    @JoinColumn(name ="id_tema")
    private Tema id_tema;

    @JsonIgnoreProperties("usuario")
    @NotNull(message="O CAMPO USUARIO NAO PODE SER NULO")
    @ManyToOne
    @JoinColumn(name ="id_usuario")
    private Usuario id_usuario;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new java.sql.Date((System.currentTimeMillis()));



}
