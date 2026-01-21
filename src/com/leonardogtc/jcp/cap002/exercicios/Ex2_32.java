package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_32 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = input.nextInt();

        System.out.print("Digite o quarto número inteiro: ");
        int num4 = input.nextInt();

        System.out.print("Digite o quinto número inteiro: ");
        int num5 = input.nextInt();

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        if (num1 > 0) {
            positivos++;
        } else if (num1 < 0) {
            negativos++;
        } else {
            zeros++;
        }

        if (num2 > 0) {
            positivos++;
        } else if (num2 < 0) {
            negativos++;
        } else {
            zeros++;
        }

        if (num3 > 0) {
            positivos++;
        } else if (num3 < 0) {
            negativos++;
        } else {
            zeros++;
        }

        if (num4 > 0) {
            positivos++;
        } else if (num4 < 0) {
            negativos++;
        } else {
            zeros++;
        }

        if (num5 > 0) {
            positivos++;
        } else if (num5 < 0) {
            negativos++;
        } else {
            zeros++;
        }

        System.out.printf("Números positivos: %d%n", positivos);
        System.out.printf("Números negativos: %d%n", negativos);
        System.out.printf("Zeros: %d%n", zeros);

        input.close();
    }

}
