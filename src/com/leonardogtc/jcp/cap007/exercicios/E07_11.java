package com.leonardogtc.jcp.cap007.exercicios;

/*
Enunciado:
Escreva instruções que realizam as seguintes operações de um array unidimensional:
a) Configure os 10 elementos do array de inteiros counts como zeros.
b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna.
 */
public class E07_11 {
    static void main(String[] args) {
        int[] counts = new int[10];
        int[] bonus = new int[15];
        int[] bestScores = {50, 89, 78, 65, 100};

        // a) Configure os 10 elementos do array de inteiros counts como zeros.
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
            System.out.printf("%d ", counts[i]);
        }
        System.out.println();

        // b) Adicione um a cada um dos 15 elementos do array de inteiros
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] = i + 1;
            System.out.printf("%d ", bonus[i]);
        }

        System.out.println();

        // c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna.
        for (int i = 0; i < bestScores.length; i++) {
            System.out.printf("%d ", bestScores[i]);
        }

    }
}
