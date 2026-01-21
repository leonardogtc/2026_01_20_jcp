package com.leonardogtc.jcp.cap002.exercicios;

import java.util.Scanner;

public class E2_8abc {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite um número inteiro: ");
        int num2 = input.nextInt();

        int a = num1 * num2;

        System.out.printf("O produto de %d por %d é %d%n", num1, num2, a);
        input.close();
    }
}
