package com.leonardogtc.jcp.cap003;

import java.util.Scanner;

public class ContaTeste {
    static void main(String[] args) {

        // Cria um objeto conta e o atribui a minhaConta
        Conta conta1 = new Conta("Jane Green", 50.00);
        Conta conta2 = new Conta("John Blue", -7.53);

        // Exibe o saldo inicial
        System.out.printf("Saldo %s: $%.2f%n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("Saldo %s: $%.2f%n", conta2.getNome(), conta2.getSaldo());

        Scanner input = new Scanner(System.in);
        System.out.print("Entre com valor de depósito para conta 1: ");
        double valorDeposito = input.nextDouble();
        System.out.printf("Depositando $%.2f", valorDeposito);
        conta1.deposito(valorDeposito);

        System.out.print("Entre com valor de depósito para conta 2: ");
        valorDeposito = input.nextDouble();
        System.out.printf("Depositando $%.2f", valorDeposito);
        conta2.deposito(valorDeposito);

        // Exibir o nome armazenado no objeto minhaConta
        System.out.printf("O nome do objeto conta1 é: %s e seu saldo é $%.2f%n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("O nome do objeto conta1 é: %s e seu saldo é $%.2f%n", conta2.getNome(), conta2.getSaldo());

        input.close();

    }
}
