package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_17 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        double average = (double) sum / 3;
        int product = num1 * num2 * num3;

        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.printf("Soma: %d%n", sum);
        System.out.printf("Média: %.2f%n", average);
        System.out.printf("Produto: %d%n", product);
        System.out.printf("Menor: %d%n", smallest);
        System.out.printf("Maior: %d%n", largest);

        input.close();
    }

}
