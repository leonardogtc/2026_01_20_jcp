package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_15 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.printf("Soma: %d%n", (num1 + num2));
        System.out.printf("Produto: %d%n", (num1 * num2));
        System.out.printf("Diferença: %d%n", (num1 - num2));
        System.out.printf("Quociente: %d%n", (num1 / num2));

        input.close();
    }

}
