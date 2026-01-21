package com.leonardogtc.jcp.cap003;

public class ContaTeste {
    static void main(String[] args) {

        // Cria um objeto conta e o atribui a minhaConta
        Conta conta1 = new Conta("Jane Green");
        Conta conta2 = new Conta("John Blue");

        // Exibir o nome armazenado no objeto minhaConta
        System.out.printf("O nome do objeto conta1 é: %s%n", conta1.getNome());
        System.out.printf("O nome do objeto conta2 é: %s%n", conta2.getNome());

    }
}
