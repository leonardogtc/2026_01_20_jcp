package com.leonardogtc.jcp.cap007.exemplos;

public class NotasEscola {
    public static void main(String[] args) {
        // 4 alunos, cada um com 3 notas
        double[][] notas = {
                {8.5, 7.0, 9.2},
                {6.8, 8.0, 7.5},
                {9.5, 9.0, 8.8},
                {5.5, 6.0, 7.2}
        };

        // Calculando média de cada aluno
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.printf("Aluno %d: Média = %.2f%n", i + 1, media);
        }
    }
}
