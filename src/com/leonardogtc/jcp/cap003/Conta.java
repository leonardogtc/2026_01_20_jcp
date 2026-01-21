package com.leonardogtc.jcp.cap003;

public class Conta {
    // Variável de instância
    private String nome;

    // Construtor da classe
    public Conta(String nome) {
        this.nome = nome;
    }

    // Método para definir o nome no objeto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para recuperar o nome do objeto
    public String getNome() {
        return nome;
    }
}
