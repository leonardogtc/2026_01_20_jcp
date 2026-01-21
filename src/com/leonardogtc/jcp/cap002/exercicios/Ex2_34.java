package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_34 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite a população mundial atual: ");
        long populacaoAtual = input.nextLong();

        System.out.print("Digite a taxa de crescimento populacional anual (em decimal, ex: 0.01 para 1%): ");
        double taxaCrescimento = input.nextDouble();

        System.out.printf("População mundial atual: %,d%n", populacaoAtual);
        System.out.printf("Taxa de crescimento anual: %.2f%%%n", taxaCrescimento * 100);

        System.out.println("\nProjeção de crescimento populacional para os próximos cinco anos:");

        for (int i = 1; i <= 15; i++) {
            populacaoAtual = (long) (populacaoAtual * (1 + taxaCrescimento));
            System.out.printf("Ano %d: %,d%n", i, populacaoAtual);
        }

        input.close();
    }

}
