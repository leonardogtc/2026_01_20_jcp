package com.leonardogtc.jcp.cap005;

public class Sum {
    static void main(String[] args) {
        int total = 0;

        for(int numero = 2; numero <= 20; numero +=2) {
            total += numero;
        }

        System.out.println("A soma dos números pares de 2 a 20 é: " + total);
    }
}
