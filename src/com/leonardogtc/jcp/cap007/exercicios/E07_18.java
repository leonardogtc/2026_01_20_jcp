package com.leonardogtc.jcp.cap007.exercicios;

import java.util.Random;

/*
(Jogo de dados Craps) Escreva um aplicativo que executa 1.000.000 de partidas do jogo de dados craps (Figura 6.8) e
responda às seguintes perguntas:

a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?
b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?
c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir que o craps é um dos jogos mais
comuns de cassino. O que você supõe que isso significa?]
d) Qual é a duração média de um jogo de dados craps?
e) As chances de ganhar aumentam com a duração do jogo?
*/
public class E07_18 {
    private static final Random random = new Random();

    static void main(String[] args) {
        final int TOTAL_GAMES = 1_000_000;

        // Arrays para contar vitórias e derrotas por rolagem
        int[] winsByRoll = new int[21]; // Índices 1-20 + índice 0 para "depois da 20ª"
        int[] lossesByRoll = new int[21];

        // Estatísticas gerais
        int totalWins = 0;
        int totalLosses = 0;
        int totalRolls = 0;

        System.out.println("Simulando 1.000.000 de partidas de Craps...\n");

        // Simulação das partidas
        for (int game = 0; game < TOTAL_GAMES; game++) {
            int result = playCrapsGame();
            int rolls = Math.abs(result);

            if (rolls > 20) {
                rolls = 20; // Agrupar jogos com mais de 20 rolagens
            }

            if (result > 0) {
                // Vitória
                winsByRoll[rolls]++;
                totalWins++;
            } else {
                // Derrota
                lossesByRoll[rolls]++;
                totalLosses++;
            }

            totalRolls += Math.abs(result);
        }

        // a) Exibir vitórias por rolagem
        System.out.println("a) VITÓRIAS POR ROLAGEM:");
        System.out.println("============================");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Rolagem %,2d: %,7d vitórias\n", i, winsByRoll[i]);
        }
        System.out.printf("Após 20ª: %,9d vitórias\n\n", winsByRoll[0]);

        // b) Exibir derrotas por rolagem
        System.out.println("b) DERROTAS POR ROLAGEM:");
        System.out.println("============================");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Rolagem %2d: %,7d derrotas\n", i, lossesByRoll[i]);
        }
        System.out.printf("Após 20ª: %,9d derrotas\n\n", lossesByRoll[0]);

        // c) Calcular chances de ganhar
        double winProbability = (double) totalWins / TOTAL_GAMES * 100;
        System.out.println("c) CHANCES DE GANHAR:");
        System.out.println("======================");
        System.out.printf("Total de vitórias: %,d\n", totalWins);
        System.out.printf("Total de derrotas: %,d\n", totalLosses);
        System.out.printf("Chances de ganhar: %.4f%%\n", winProbability);
        System.out.println("\nObservação: Como o craps é um dos jogos mais comuns de cassino,");
        System.out.println("e as chances de ganhar são menores que 50%, isso significa que");
        System.out.println("a casa sempre tem vantagem no longo prazo.\n");

        // d) Calcular duração média do jogo
        double averageDuration = (double) totalRolls / TOTAL_GAMES;
        System.out.println("d) DURAÇÃO MÉDIA DO JOGO:");
        System.out.println("=========================");
        System.out.printf("Duração média: %.2f rolagens\n\n", averageDuration);

        // e) Verificar se as chances aumentam com a duração
        System.out.println("e) CHANCES DE GANHAR POR DURAÇÃO DO JOGO:");
        System.out.println("==========================================");

        System.out.println("Duração | Vitórias | Derrotas | % Vitórias");
        System.out.println("--------|----------|----------|------------");

        for (int i = 1; i <= 20; i++) {
            int totalGamesAtRoll = winsByRoll[i] + lossesByRoll[i];
            if (totalGamesAtRoll > 0) {
                double winRateAtRoll = (double) winsByRoll[i] / totalGamesAtRoll * 100;
                System.out.printf("%7d | %,8d | %,8d | %9.2f%%\n",
                        i, winsByRoll[i], lossesByRoll[i], winRateAtRoll);
            }
        }
    }

    /**
     * Simula uma única partida de craps
     *
     * @return Número positivo de rolagens se ganhar, negativo se perder
     */
    private static int playCrapsGame() {
        int rolls = 1;
        int firstRoll = rollDice();

        // Primeira rolagem
        if (firstRoll == 7 || firstRoll == 11) {
            return rolls; // Ganha na primeira rolagem
        }

        if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
            return -rolls; // Perde na primeira rolagem
        }

        // Estabelece o ponto
        int point = firstRoll;

        // Continua rolando até fazer o ponto ou rolar 7
        while (true) {
            rolls++;
            int currentRoll = rollDice();

            if (currentRoll == point) {
                return rolls; // Ganha fazendo o ponto
            }

            if (currentRoll == 7) {
                return -rolls; // Perde rolando 7
            }
        }
    }

    /**
     * Simula o lançamento de dois dados
     *
     * @return Soma dos valores dos dois dados (2-12)
     */
    private static int rollDice() {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }

}
