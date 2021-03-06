package br.com.orangeBank.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.sql.Date;


@Entity
@Table(name="usuario")
public class Usuario {

    @Column
    @NotNull
    private String nome;

    @Column(unique = true)
    @Email(message = "insira um e-mail válido")
    @NotNull
    private String email;

    @Column
    @NotNull
    private Date dataDeNascimento;

    @Column(unique = true)
    @NotNull
    private String cpf;

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer	id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", cpf='" + cpf + '\'' +
                ", id=" + id +
                '}';
    }
}
