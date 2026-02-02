package com.leonardogtc.jcp.cap007;

// Calculando os valores a serem colocados nos elementos de um array.
public class InitArray2 {
    static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n", "Índice", "Valor");

        // Gera a saída de cada elemento do array
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
