package com.leonardogtc.jcp.cap004;

import java.util.Scanner;

public class MediaDaClasse1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fase de inicialização
        double total = 0;
        int contador = 0;

        System.out.print("Entre com a nota ou digite -1 para finalizar: ");
        double nota = input.nextDouble();

        // Fase de processamento
        while(nota != -1) {
            total += nota;
            contador += 1;
            System.out.print("Entre com a nota ou digite -1 para finalizar: ");
            nota = input.nextDouble();
        }

        // Fase de término
        if (total > 0) {
            // Calcular a média
            double media = (double) total / (contador);

            // Mostra o total e a média das notas
            System.out.printf("O total das notas é: %.1f%n", total);
            System.out.printf("A média das notas é: %.1f%n", media);
        } else {
            System.out.println("Nenhuma nota foi digitada");
        }

        input.close();
    }
}
