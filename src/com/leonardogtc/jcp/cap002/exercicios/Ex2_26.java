package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_26 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.printf("%d é um múltiplo de %d%n", num1, num2);
        } else {
            System.out.printf("%d não é um múltiplo de %d%n", num1, num2);
        }

        input.close();
    }

}
