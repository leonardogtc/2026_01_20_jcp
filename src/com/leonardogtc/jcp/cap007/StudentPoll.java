package com.leonardogtc.jcp.cap007;

public class StudentPoll {
    static void main(String[] args) {
        // Array de respostas dos alunos (escala de 1 a 5)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6]; // Array de frequências (índices 0 a 5)

        // Para cada resposta, seleciona o elemento de respostas e utiliza esse valor
        // como índice de frequência para determinar o elemento a ser incrementado
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e); // Exibe o erro
                System.out.printf("  responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%12s%n", "Nota", "Frequência");

        // Gera a saída do valor de cada elemento do array
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%4d%12d%n", rating, frequency[rating]);
        }
    }
}
