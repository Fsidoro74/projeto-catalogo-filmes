package org.example;
import java.io.*;
import java.util.List;
import com.google.gson.Gson;

public class SerializadorPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        Gson gson = new Gson();

        // Converter objeto para JSON
        String json = gson.toJson(pessoa);
        System.out.println("Objeto em JSON: " + json);

        // Converter JSON para objeto
        Pessoa novaPessoa = gson.fromJson(json, Pessoa.class);
        System.out.println("Nome: " + novaPessoa.nome + ", Idade: " + novaPessoa.idade);
    }

    static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
}
