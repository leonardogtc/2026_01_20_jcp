// Relativo ao exercício 3.12 - Java Como Programar 10ª Edição

package com.leonardogtc.jcp.cap003;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(String numero, String descricao, int quantidade, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public double getMontanteFatura() {
        if (quantidade <= 0) {
            quantidade = 0;
        }
        if (precoItem <= 0.0) {
            precoItem = 0.0;
        }
        return quantidade * precoItem;
    }


}
