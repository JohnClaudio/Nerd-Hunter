package com.blogpessoal.blogpessoal.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;



@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    @NotBlank(message="O nome do usuario não pode ser nulo nem vazio")
    private String nome;

    @ApiModelProperty(example = "email@email.com.br")
    @NotNull(message = "O atributo Usuário é Obrigatório!")
    @Email(message = "O atributo Usuário deve ser um email válido!")
    private String usuario;

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
