package org.example;

public abstract class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa() {
        // Construtor padrão vazio
    }

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {  // setter para Gson desserializar
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) { // setter
        this.dataNascimento = dataNascimento;
    }

    public abstract String getTipo();
}