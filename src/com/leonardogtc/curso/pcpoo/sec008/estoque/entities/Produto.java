package com.leonardogtc.curso.pcpoo.sec008.estoque.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotalNoEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + " - R$ " + String.format("%.2f", preco)
                + " - " + quantidade
                + " - " + String.format("%.2f", ValorTotalNoEstoque());
    }

}
