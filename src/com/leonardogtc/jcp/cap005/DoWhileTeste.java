package com.leonardogtc.jcp.cap005;

public class DoWhileTeste {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.printf("%d ", contador);
            ++contador;
        } while(contador<= 10);

        System.out.println();
    }
}
