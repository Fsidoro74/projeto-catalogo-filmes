package org.example;
import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ator ator1 = new Ator("João", "01/01/1980");
        Diretor diretor = new Diretor("Maria", "02/02/1970");
        Filme filme = new Filme("Filme Exemplo", "2024", 1000000, "Descrição", diretor, Arrays.asList(ator1));

        System.out.println("Filme: " + filme.getNome());
        System.out.println("Diretor: " + filme.getDiretor().getNome());
        System.out.println("Atores: " + filme.getAtores().get(0).getNome());
    }
}

//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Filme> filmes = new ArrayList<>();
//        String arquivo = "filmes.dat";
//
//        // Tenta carregar os filmes do arquivo
//        try {
//            filmes = SerializadorFilme.carregarFilmes(arquivo);
//            System.out.println("Filmes carregados do arquivo.");
//        } catch (Exception e) {
//            System.out.println("Nenhum arquivo encontrado, começando com lista vazia.");
//        }
//
//        while (true) {
//            System.out.println("\n1 - Adicionar filme");
//            System.out.println("2 - Listar filmes");
//            System.out.println("0 - Sair");
//            System.out.print("Escolha uma opção: ");
//            int opcao = Integer.parseInt(scanner.nextLine());
//
//            if (opcao == 1) {
//                System.out.print("Nome do filme: ");
//                String nome = scanner.nextLine();
//                System.out.print("Data de lançamento: ");
//                String data = scanner.nextLine();
//                System.out.print("Orçamento: ");
//                double orcamento = Double.parseDouble(scanner.nextLine());
//                System.out.print("Descrição: ");
//                String descricao = scanner.nextLine();
//
//                // Exemplo simples para adicionar diretor e atores
//                System.out.print("Nome do diretor: ");
//                String nomeDiretor = scanner.nextLine();
//                System.out.print("Data de nascimento do diretor: ");
//                String dataDiretor = scanner.nextLine();
//                Diretor diretor = new Diretor(nomeDiretor, dataDiretor);
//
//                List<Ator> atores = new ArrayList<>();
//                System.out.print("Quantos atores? ");
//                int qtdAtores = Integer.parseInt(scanner.nextLine());
//                for (int i = 0; i < qtdAtores; i++) {
//                    System.out.print("Nome do ator " + (i+1) + ": ");
//                    String nomeAtor = scanner.nextLine();
//                    System.out.print("Data de nascimento do ator " + (i+1) + ": ");
//                    String dataAtor = scanner.nextLine();
//                    atores.add(new Ator(nomeAtor, dataAtor));
//                }
//
//                Filme filme = new Filme(nome, data, orcamento, descricao, diretor, atores);
//                filmes.add(filme);
//                System.out.println("Filme adicionado!");
//            } else if (opcao == 2) {
//                for (Filme f : filmes) {
//                    System.out.println("\nFilme: " + f.getNome() + " (" + f.getDataLancamento() + ")");
//                    System.out.println("Orçamento: " + f.getOrcamento());
//                    System.out.println("Descrição: " + f.getDescricao());
//                    System.out.println("Diretor: " + f.getDiretor().getNome());
//                    System.out.println("Atores:");
//                    for (Ator a : f.getAtores()) {
//                        System.out.println(" - " + a.getNome());
//                    }
//                }
//            } else if (opcao == 0) {
//                // Salva os filmes antes de sair
//                try {
//                    SerializadorFilme.salvarFilmes(filmes, arquivo);
//                    System.out.println("Filmes salvos no arquivo.");
//                } catch (IOException e) {
//                    System.out.println("Erro ao salvar filmes: " + e.getMessage());
//                }
//                System.out.println("Saindo...");
//                break;
//            } else {
//                System.out.println("Opção inválida!");
//            }
//        }
//    }
//}