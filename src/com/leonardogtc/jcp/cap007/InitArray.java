package com.leonardogtc.jcp.cap007;

public class InitArray {
    static void main(String[] args) {
        // Declara e inicializa um array
        /*
        NOTA:
        Quando um array é criado, cada um de seus elementos recebe um valor padrão
        — zero para os elementos de tipo primitivo numéricos, false para elementos
        de tipo boolean e null para referências.

        int[] array = new int[10];
         */

        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; // Inicializador de Array

        System.out.printf("%s%8s%n", "Índice", "Valor");

        // Gera a saída de cada elemento do array
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
