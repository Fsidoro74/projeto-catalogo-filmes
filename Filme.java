package org.example;

import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme() {}

    public Filme(String nome, String dataLancamento, double orcamento, String descricao, Diretor diretor, List<Ator> atores) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }
    // Construtor, getters e setters omitidos por brevidade
}