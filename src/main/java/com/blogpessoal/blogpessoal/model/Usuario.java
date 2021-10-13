package com.blogpessoal.blogpessoal.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_usuario;

    @NotBlank(message="O nome do usuario não pode ser nulo nem vazio")
    String nome;

    @NotBlank(message="O nome do usuario não pode ser nulo nem vazio")
    @Size(min = 5, max=70, message= "O campo nome não pode ultrapassar 70 caracteres e min 5")
    String usuario;

    @NotBlank(message="A senha não pode ser nulo nem vazia")
    String senha ;

    public Usuario(long id_usuario, String nome, String usuario, String senha) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
