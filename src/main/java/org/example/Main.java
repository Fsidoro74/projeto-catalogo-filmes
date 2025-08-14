package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ator ator1 = new Ator("João", "01/01/1980");
        Diretor diretor = new Diretor("Maria");
        Filme filme = new Filme("Filme Exemplo", "2024", 1000000, "Descrição", diretor, Arrays.asList(ator1));

        System.out.println("Filme: " + filme.getNome());
        System.out.println("Diretor: " + filme.getDiretor().getNome());
        System.out.println("Atores: " + filme.getAtores().get(0).getNome());

        System.out.println("\nChamando o menu interativo...");
        MainMenu.main(new String[]{});
    }
}

