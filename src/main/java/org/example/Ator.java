package org.example;
import java.io.Serializable;

public class Ator extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    private String tipo = "Ator";


    public Ator(String nome, String dataNascimento) {

        super(nome, dataNascimento);
    }

    @Override
    public String getTipo() {

        return tipo;
    }
}


