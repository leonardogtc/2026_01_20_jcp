package com.leonardogtc.jcp.cap002;

import java.util.Scanner;

public class Addition {
    static void main(String[] args) {
        // Criar um Scanner para entrada a partir da janela de comandos
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Digite o primeiro número inteiro: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("A soma dos números %d e %d é %d%n", number1, number2, sum);

        input.close();

    }
}
