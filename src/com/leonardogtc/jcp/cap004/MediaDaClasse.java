package com.leonardogtc.jcp.cap004;

public class MediaDaClasse {
    static void main(String[] args) {
        // Cria o Scanner para obter entrada a partir da janela de comando
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Fase da inicialização
        double total = 0;
        int contador = 1;

        while (contador <= 10) {
            System.out.print("Entre com a nota: ");
            double nota = input.nextDouble();
            if(nota < 0.0) {
                nota = 0;
            } else if (nota > 10) {
                nota = 10;
            }
            total += nota;
            contador += 1;
        }

        // Fase de término
        double media = (double) total / 10;

        // Mostrado o total e a média das notas
        System.out.printf("O total das 10 notas é: %.2f%n", total);
        System.out.printf("A média das 10 notas é: %.2f%n", media);
    }
}
