package com.leonardogtc.jcp.cap004.exercicios;

import java.util.Scanner;

public class E4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número da conta: ");
        int conta = input.nextInt();

        System.out.print("Digite o saldo no início do mês: ");
        int saldoInicioMes = input.nextInt();

        System.out.print("Digite o total de itens cobrados no mês: ");
        int totalCobrado = input.nextInt();

        System.out.print("Digite o total de créditos aplicados no mês: ");
        int totalCreditos = input.nextInt();

        System.out.print("Digite o limite de crédito autorizado: ");
        int limiteCredito = input.nextInt();

        // Cálculo do novo saldo
        int novoSaldo = saldoInicioMes + totalCobrado - totalCreditos;

        // Exibição dos resultados
        System.out.printf("%nConta: %d%n", conta);
        System.out.printf("Novo saldo: %d%n", novoSaldo);

        // Verificação do limite
        if (novoSaldo > limiteCredito) {
            System.out.println("Limite de crédito excedido");
        }

        input.close();
    }
}
