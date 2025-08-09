package org.example;

import com.google.gson.Gson;

public class TesteAtor {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Criar um ator
        Ator ator = new Ator("João", "01/01/1980");

        // Serializar objeto para JSON
        String json = gson.toJson(ator);
        System.out.println("Objeto serializado para JSON:");
        System.out.println(json);

        // Desserializar JSON para objeto
        Ator ator2 = gson.fromJson(json, Ator.class);
        System.out.println("Objeto desserializado do JSON:");
        System.out.println(ator2.getNome() + " - " + ator2.getDataNascimento());
    }
}
