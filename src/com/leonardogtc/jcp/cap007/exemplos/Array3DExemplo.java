package com.leonardogtc.jcp.cap007.exemplos;

public class Array3DExemplo {
    public static void main(String[] args) {
        // Representando temperaturas por 3 dias, 24 horas, em 2 cidades
        double[][][] temperaturas = new double[3][24][2];

        // Preenchendo com valores aleatórios
        for (int dia = 0; dia < 3; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                // Cidade 0: São Paulo (entre 15 e 30 graus)
                temperaturas[dia][hora][0] = 15 + Math.random() * 15;
                // Cidade 1: Curitiba (entre 10 e 25 graus)
                temperaturas[dia][hora][1] = 10 + Math.random() * 15;
            }
        }

        // Calculando média por cidade
        for (int cidade = 0; cidade < 2; cidade++) {
            double soma = 0;
            int total = 0;

            for (int dia = 0; dia < 3; dia++) {
                for (int hora = 0; hora < 24; hora++) {
                    soma += temperaturas[dia][hora][cidade];
                    total++;
                }
            }

            String nomeCidade = (cidade == 0) ? "São Paulo" : "Curitiba";
            System.out.printf("Temperatura média em %s: %.2f°C%n",
                    nomeCidade, soma / total);
        }
    }
}
