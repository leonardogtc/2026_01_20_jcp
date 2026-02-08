package com.leonardogtc.jcp.cap007.exemplos;

public class TabuleiroXadrez {
    public static void main(String[] args) {
        // Criando um tabuleiro 8x8
        char[][] tabuleiro = new char[8][8];

        // Inicializando peças
        // Peças brancas
        tabuleiro[0] = new char[]{'T', 'C', 'B', 'D', 'R', 'B', 'C', 'T'};
        tabuleiro[1] = new char[]{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'};

        // Espaços vazios
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '.';
            }
        }

        // Peças pretas
        tabuleiro[6] = new char[]{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'};
        tabuleiro[7] = new char[]{'t', 'c', 'b', 'd', 'r', 'b', 'c', 't'};

        // Imprimindo o tabuleiro
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
