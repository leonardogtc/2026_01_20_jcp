package com.leonardogtc.jcp.cap005.exercicios;

public class E05_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%s%n", "n", "n!");

        for (long i = 1; i <= 20; i++) {
            long fatorial = 1;
            for (long j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("%-10d%,d%n", i, fatorial);
        }
    }

}
