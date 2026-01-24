package com.leonardogtc.jcp.cap005;

public class WhileCounter {
    static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.printf("%d ", contador);
            ++contador;
        }
        System.out.println();
    }
}
