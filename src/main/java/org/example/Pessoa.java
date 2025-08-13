package org.example;
import java.io.Serializable;

public abstract class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nome;
    private String dataNascimento;

    public Pessoa() {
        // Construtor padrão vazio
    }

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() { return nome; }
    public String getDataNascimento() { return dataNascimento; }

    public abstract String getTipo();
}