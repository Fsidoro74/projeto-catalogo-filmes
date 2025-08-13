package org.example;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();
        String arquivo = "filmes.dat";

        System.out.println("#####Bem-vindo ao menu interativo!#####");
        // Tenta carregar os filmes do arquivo
        try {
            filmes = SerializadorFilme.carregarFilmes(arquivo);

        } catch (Exception e) {
            System.out.println("Nenhum arquivo encontrado, começando com lista vazia.");
        }

        while (true) {
            System.out.println("\n1 - Adicionar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                System.out.print("Nome do filme: ");
                String nome = scanner.nextLine();

                System.out.print("Data de lançamento (dd/MM/yyyy): ");
                String data;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false); // Não aceita datas inválidas

                while (true) {
                    data = scanner.nextLine();
                    try {
                        sdf.parse(data);
                        break; // Sai do loop se a data for válida
                    } catch (ParseException e) {
                        System.out.print("Data inválida! Digite novamente (dd/MM/yyyy): ");
                    }
                }

                System.out.print("Orçamento: ");
                double orcamento;
                while (true) {
                    String orcamentoStr = scanner.nextLine().replace("R$", "").replace(".", "").replace(",", ".");
                    try {
                        orcamento = Double.parseDouble(orcamentoStr);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("Orçamento inválido! Digite novamente (R$00,00): ");
                    }
                }

                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();

                // Exemplo simples para adicionar diretor e atores
                System.out.print("Nome do diretor: ");
                String nomeDiretor = scanner.nextLine();
                Diretor diretor = new Diretor(nomeDiretor);

                List<Ator> atores = new ArrayList<>();
                System.out.print("Quantos atores? ");
                int qtdAtores = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < qtdAtores; i++) {
                    System.out.print("Nome do ator " + (i+1) + ": ");
                    String nomeAtor = scanner.nextLine();
                    System.out.print("Data de nascimento do ator " + (i+1) + ": ");
                    String dataAtor = scanner.nextLine();
                    atores.add(new Ator(nomeAtor, dataAtor));
                }

                Filme filme = new Filme(nome, data, orcamento, descricao, diretor, atores);
                filmes.add(filme);
                System.out.println("Filme adicionado!");
            } else if (opcao == 2) {
                for (Filme f : filmes) {
                    System.out.println("\nFilme: " + f.getNome() + " (" + f.getDataLancamento() + ")");
                    System.out.println("Orçamento: " + f.getOrcamento());
                    System.out.println("Descrição: " + f.getDescricao());
                    System.out.println("Diretor: " + f.getDiretor().getNome());
                    System.out.println("Atores:");
                    for (Ator a : f.getAtores()) {
                        System.out.println(" - " + a.getNome());
                    }
                }
            } else if (opcao == 0) {
                // Salva os filmes antes de sair
                try {
                    SerializadorFilme.salvarFilmes(filmes, arquivo);
                    System.out.println("Filmes salvos no arquivo.");
                } catch (IOException e) {
                    System.out.println("Erro ao salvar filmes: " + e.getMessage());
                }
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

    }
}