package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_24 {
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

        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
        if (num5 < smallest) {
            smallest = num5;
        }

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }

        System.out.printf("Menor: %d%n", smallest);
        System.out.printf("Maior: %d%n", largest);

        input.close();
    }

}
