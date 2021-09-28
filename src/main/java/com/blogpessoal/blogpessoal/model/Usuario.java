package com.blogpessoal.blogpessoal.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_usuario;

    @NotNull(message="O nome do usuario não pode ser nulo")
    String nome ;

    @NotNull(message="O nome do usuario não pode ser nulo")
    @Size(min = 5, max=70, message= "O campo nome não pode ultrapassar 70 caracteres e min 5")
    String usuario ;

    @NotNull(message="O nome do usuario não pode ser nulo")
    String senha ;

    public long getUsuario_id() {
        return id_usuario;
    }

    public void setUsuario_id(long usuario_id) {
        this.id_usuario = usuario_id;
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
