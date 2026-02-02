package com.leonardogtc.jcp.cap007;

public class InitArray {
    static void main(String[] args) {
        // Declara e inicializa um array
        /*
        NOTA:
        Quando um array é criado, cada um de seus elementos recebe um valor padrão
        — zero para os elementos de tipo primitivo numéricos, false para elementos
        de tipo boolean e null para referências.
         */
        int[] array = new int[10];  // Cria um objeto Array

        System.out.printf("%s%8s%n", "Índice", "Valor");

        // Gera a saída de cada elemento do array
        for(int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
