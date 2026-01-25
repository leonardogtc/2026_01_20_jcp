package com.leonardogtc.jcp.cap005;

public class Interest {
    static void main(String[] args) {
        double montante;
        double depositoInicial = 1000.00;
        double taxaJuros = 0.05;

        // Cabeçalho
        System.out.println("Ano\tMontante do Depósito");

        for(int ano = 1; ano <= 10; ano++) {
            montante = depositoInicial * Math.pow(1.0 + taxaJuros, ano);

            // Exibe o ano e a quantidade
            System.out.printf("%3d\t%,20.2f%n", ano, montante);
        }
    }
}
