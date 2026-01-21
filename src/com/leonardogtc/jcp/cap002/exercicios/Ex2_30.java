package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_30 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite um número inteiro de cinco dígitos: ");
        int numero = input.nextInt();

        if (numero < 10000 || numero > 99999) {
            System.out.println("Por favor, digite um número de cinco dígitos.");
        } else {
            int digito1 = numero / 10000;
            int digito2 = (numero % 10000) / 1000;
            int digito3 = (numero % 1000) / 100;
            int digito4 = (numero % 100) / 10;
            int digito5 = numero % 10;

            System.out.printf("%d   %d   %d   %d   %d%n", digito1, digito2, digito3, digito4, digito5);
        }

        input.close();
    }

}
