package org.example;
import java.io.Serializable;
import java.util.List;

public class Filme implements Serializable{
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    // Construtor completo
    public Filme(String nome, String dataLancamento, double orcamento, String descricao, Diretor diretor, List<Ator> atores) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    // Getters
    public String getNome() { return nome; }
    public String getDataLancamento() { return dataLancamento; }
    public double getOrcamento() { return orcamento; }
    public String getDescricao() { return descricao; }
    public Diretor getDiretor() { return diretor; }
    public List<Ator> getAtores() { return atores; }

    // (Opcional) Adicione setters se precisar modificar depois de criar
}