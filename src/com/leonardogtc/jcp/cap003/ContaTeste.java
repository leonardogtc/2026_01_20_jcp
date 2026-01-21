package com.leonardogtc.jcp.cap003;

import java.util.Scanner;

public class ContaTeste {
    static void main(String[] args) {

        // Cria um objeto conta e o atribui a minhaConta
        Conta conta1 = new Conta("Jane Green", 50.00);
        Conta conta2 = new Conta("John Blue", -7.53);

        // Exibe o saldo inicial
        exibirConta(conta1);
        exibirConta(conta2);

        Scanner input = new Scanner(System.in);
        System.out.print("Entre com valor de depósito para conta 1: ");
        double valorDeposito = input.nextDouble();
        System.out.println();
        System.out.printf("Depositando $%.2f", valorDeposito);
        conta1.deposito(valorDeposito);
        System.out.println();
        System.out.print("Entre com valor de depósito para conta 2: ");
        valorDeposito = input.nextDouble();
        System.out.printf("Depositando $%.2f", valorDeposito);
        conta2.deposito(valorDeposito);

        System.out.println();

        // Exibir o nome armazenado no objeto minhaConta
        exibirConta(conta1);
        exibirConta(conta2);

        // Realizar saque
        double valorSaque;
        System.out.print("Entre com valor de saque para conta 1: ");
        valorSaque = input.nextDouble();
        System.out.println();
        System.out.printf("Saque de $%.2f", valorSaque);
        conta1.saque(valorSaque);
        System.out.println();

        // Exibir o nome armazenado no objeto minhaConta
        exibirConta(conta1);
        exibirConta(conta2);

        input.close();

    }

    public static void exibirConta(Conta conta) {
        System.out.printf("Saldo %s: $%.2f%n", conta.getNome(), conta.getSaldo());
    }
}
