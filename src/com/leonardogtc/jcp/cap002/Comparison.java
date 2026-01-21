package com.leonardogtc.jcp.cap002;

import java.util.Scanner;

public class Comparison {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Digite o primeiro número inteiro: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        input.close();
    }
}
