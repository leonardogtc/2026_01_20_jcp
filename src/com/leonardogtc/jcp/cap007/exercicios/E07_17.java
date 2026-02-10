package com.leonardogtc.jcp.cap007.exercicios;

import java.util.Random;

/*
Enunciado Java:
(Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um objeto de
classe Random, uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores deve
então ser calculada. Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 12,
com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações
de dois dados. Seu aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para contar o número
de vezes que cada possível soma aparece. Exiba os resultados em formato tabular.
*/
public class E07_17 {
    static void main(String[] args) {

        // Objeto Random para gerar números aleatórios
        Random random = new Random();

        // Array para contar as ocorrências de cada soma (índices 0-12, usaremos 2-12)
        // O array tem 13 posições para facilitar o acesso direto pelos índices
        int[] contagemSomas = new int[13];

        // Número total de lançamentos
        final int TOTAL_LANCAMENTOS = 36_000_000;

        System.out.printf("Simulando %,d lançamentos de dois dados...%n", TOTAL_LANCAMENTOS);

        // Simula os lançamentos dos dados
        for (int i = 0; i < TOTAL_LANCAMENTOS; i++) {
            // Lança o primeiro dado (valores de 1 a 6)
            int dado1 = random.nextInt(6) + 1;

            // Lança o segundo dado (valores de 1 a 6)
            int dado2 = random.nextInt(6) + 1;

            // Calcula soma dos dois dados
            int soma = dado1 + dado2;

            // Incrementa a contagem para essa soma
            contagemSomas[soma]++;

        }

        // Exibe os resultados em formato tabular
        System.out.println("Soma\tFrequência\tPercentual\tHistograma");
        System.out.println("----\t----------\t----------\t----------");

        for (int soma = 2; soma <= 12; soma++) {
            // calcula o percentual
            double percentual = (double) contagemSomas[soma] / TOTAL_LANCAMENTOS * 100;

            // Cria um histograma simples
            int barras = (int) (percentual * 2); // escala para visualização

            System.out.printf("%d\t%,14d\t%9.2f%%\t", soma, contagemSomas[soma], percentual);
            for (int i = 0; i < barras; i++) {
                System.out.print("█");
            }
            System.out.println();

        }

        // Análise adicional
        System.out.println("\n=== ANÁLISE ESTATÍSTICA ===");
        System.out.printf("Soma mais frequente (7): %,d ocorrências (%.2f)%n",
                contagemSomas[7], (double) contagemSomas[7] / TOTAL_LANCAMENTOS * 100);
        System.out.printf("Soma menos frequente (2): %,d ocorrências (%.2f%%)\n",
                contagemSomas[2], (double) contagemSomas[2] / TOTAL_LANCAMENTOS * 100);
        System.out.printf("Soma menos frequente (12): %,d ocorrências (%.2f%%)\n",
                contagemSomas[12], (double) contagemSomas[12] / TOTAL_LANCAMENTOS * 100);


        // Verifica a distribuição teórica esperada
        System.out.println("\n=== DISTRIBUIÇÃO TEÓRICA ESPERADA ===");
        System.out.println("Soma\tProbabilidade Teórica");
        System.out.println("----\t---------------------");

        // Probabilidades teóricas para soma de dois dados
        double[] probabilidadesTeoricas = {
                0, 0,                  // índices 0 e 1 não usados
                1.0 / 36 * 100,          // soma 2: 1/36
                2.0 / 36 * 100,          // soma 3: 2/36
                3.0 / 36 * 100,          // soma 4: 3/36
                4.0 / 36 * 100,          // soma 5: 4/36
                5.0 / 36 * 100,          // soma 6: 5/36
                6.0 / 36 * 100,          // soma 7: 6/36
                5.0 / 36 * 100,          // soma 8: 5/36
                4.0 / 36 * 100,          // soma 9: 4/36
                3.0 / 36 * 100,          // soma 10: 3/36
                2.0 / 36 * 100,          // soma 11: 2/36
                1.0 / 36 * 100           // soma 12: 1/36
        };

        for (int soma = 2; soma <= 12; soma++) {
            double percentualAtual = (double) contagemSomas[soma] / TOTAL_LANCAMENTOS * 100;
            System.out.printf("%d\t%9.2f%% (teórico) - %.2f%% (simulado) - Diferença: %.2f%%\n",
                    soma, probabilidadesTeoricas[soma], percentualAtual,
                    Math.abs(probabilidadesTeoricas[soma] - percentualAtual));
        }

    }
}
