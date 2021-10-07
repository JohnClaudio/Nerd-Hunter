package com.blogpessoal.blogpessoal.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
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
}
