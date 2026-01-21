package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_16 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d é maior%n", num1);
        } else if (num2 > num1) {
            System.out.printf("%d é maior%n", num2);
        } else {
            System.out.println("Os números são iguais");
        }

        input.close();
    }

}
