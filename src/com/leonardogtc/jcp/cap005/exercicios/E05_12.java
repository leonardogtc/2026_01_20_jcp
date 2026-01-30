package com.leonardogtc.jcp.cap005.exercicios;

public class E05_12 {
    public static void main(String[] args) {
        int produto = 1;
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 15; i += 2) {
            produto *= i;
            resultado.append(i).append(" ");
        }

        System.out.printf("Os inteiros ímpares de 1 a 15 são: %s%n", resultado.toString());
        System.out.printf("O produto dos inteiros ímpares de 1 a 15 é: %,d%n", produto);
    }
}
