package com.blogpessoal.blogpessoal.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity

@Table(name = "tb_postagens")
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "o campo titulo não pode ser nullo")
    @Size(min = 5 , max=100)
    private String titulo;

    @NotNull
    @Size(min = 5, max = 600, message =" o campo deste atributo não pode ser menor que 10 e maior que 600 caracteres")
    private String texto;

    @NotNull
    @ManyToOne
    @JoinColumn(name ="id_tema")
    private Tema id_tema;

    @NotNull
    @ManyToOne
    @JoinColumn(name ="id_usuario")
    private Usuario id_usuario;



    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new java.sql.Date((System.currentTimeMillis()));


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
