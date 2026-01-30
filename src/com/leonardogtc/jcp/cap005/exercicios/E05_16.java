package com.leonardogtc.jcp.cap005.exercicios;

public class E05_16 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número entre 1 e 30: ");
            int numero = input.nextInt();

            if (numero >= 1 && numero <= 30) {
                for (int j = 1; j <= numero; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("Número inválido.");
                i--; // Repetir a iteração para garantir 5 números válidos
            }
        }
    }

}
