package org.example;

public class Ator extends Pessoa {
    private String tipo = "Ator";

    public Ator() {

        super();
    }

    public Ator(String nome, String dataNascimento) {

        super(nome, dataNascimento);
    }

    @Override
    public String getTipo() {

        return tipo;
    }
}


