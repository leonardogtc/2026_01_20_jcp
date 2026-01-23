package com.leonardogtc.jcp.cap004;

public class Incremento {
    static void main(String[] args) {
        // Pós-incremento
        int c = 5;
        System.out.printf("c antes do pos-incremento: %d%n", c);
        System.out.printf("c pos-incrementado: %d%n", c++);
        System.out.printf("c depois do pos-incremento: %d%n", c);

        System.out.println("----------------------------------------");

        // Pré-incremento
        int d = 5;
        System.out.printf("d antes do pré-incremento: %d%n", d);
        System.out.printf("d pré-incrementado: %d%n", ++d);
        System.out.printf("d após do pré-incremento: %d%n", d);
    }
}
