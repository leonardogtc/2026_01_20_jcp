package com.leonardogtc.jcp.cap005.exercicios;

public class E05_11 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem lidos: ");
        int n = input.nextInt();

        if (n > 0) {
            System.out.print("Digite o primeiro valor: ");
            int menor = input.nextInt();

            for (int i = 1; i < n; i++) {
                System.out.print("Digite o próximo valor: ");
                int valor = input.nextInt();

                if (valor < menor) {
                    menor = valor;
                }
            }

            System.out.printf("O menor valor lido foi: %d%n", menor);
        } else {
            System.out.println("Nenhum valor foi inserido.");
        }
    }

}
