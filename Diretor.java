package org.example;

public class Diretor extends Pessoa {
    public Diretor(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public String getTipo() {
        return "Diretor";
    }
}
