package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_25 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d é um número par%n", num);
        } else {
            System.out.printf("%d é um número ímpar%n", num);
        }

        input.close();
    }

}
