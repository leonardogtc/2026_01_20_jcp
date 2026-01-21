package com.leonardogtc.jcp.cap003;

public class Conta {
    // Variável de instância
    private String nome;
    private double saldo;

    // Construtor da classe
    public Conta(String nome, double saldo) {
        this.nome = nome;

        /*
        Validar que o saldo é maior que zero (0.0); caso não seja, a variável
        de instância saldo mantêm seu valor inicial como 0.0.
         */
        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    // Depósito
    public void deposito(double valorDeposito) {
        if(valorDeposito > 0.0) {
            saldo += valorDeposito;
        }
    }

    // withdraw - retirada ou saque
    public double saque(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    // método retorna o saldo da conta
    public double getSaldo() {
        return saldo;
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
