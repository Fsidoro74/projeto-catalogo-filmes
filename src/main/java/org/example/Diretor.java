package org.example;
import java.io.Serializable;

public class Diretor extends Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;
    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Diretor";
    }
}
