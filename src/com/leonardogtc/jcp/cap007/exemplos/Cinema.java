package com.leonardogtc.jcp.cap007.exemplos;

public class Cinema {
    public static void main(String[] args) {
        // Sala de cinema 5x6
        boolean[][] assentos = new boolean[5][6];

        // Alguns assentos ocupados
        assentos[0][2] = true; // Fileira 1, assento 3
        assentos[2][4] = true; // Fileira 3, assento 5
        assentos[4][0] = true; // Fileira 5, assento 1

        // Mostrando disponibilidade
        System.out.println("Mapa de Assentos (O = ocupado, L = livre):");
        for (int fileira = 0; fileira < assentos.length; fileira++) {
            System.out.print("Fileira " + (fileira + 1) + ": ");
            for (int assento = 0; assento < assentos[fileira].length; assento++) {
                System.out.print(assentos[fileira][assento] ? "O " : "L ");
            }
            System.out.println();
        }
    }
}
