/*
Enunciado:
(Passeio do Cavalo: abordagens de força bruta) Na parte (c) da Questão 7.22, desenvolvemos uma solução para o problema do
Passeio do Cavalo. A abordagem utilizada, chamada “acessibilidade heurística”, gera muitas soluções e executa eficientemente.

À medida que os computadores continuam crescendo em potência, seremos capazes de resolver cada vez mais problemas com a
pura capacidade do computador e algoritmos relativamente simples. Vamos chamar essa abordagem de solução de problemas de
abordagem de “força bruta”.

a) Utilize geração de números aleatórios para permitir ao cavalo andar no tabuleiro de xadrez (em seus movimentos válidos
em forma de (L) de maneira aleatória. Seu aplicativo deve executar um passeio e exibir o tabuleiro final. Até onde o
cavalo chegou?

b) Muito provavelmente, o aplicativo na parte (a) produziu um passeio relativamente curto. Agora modifique seu aplicativo
para tentar 1.000 passeios. Utilize um array unidimensional para monitorar o número de passeios de cada comprimento. Quando
seu aplicativo terminar de tentar os 1.000 passeios, ele deve exibir organizadamente essas informações em formato tabular.
Qual foi o melhor resultado?

c) Muito provavelmente, o aplicativo na parte (b) forneceu alguns passeios “respeitáveis”, mas nenhum completo. Agora
deixe seu aplicativo executar até que produza um passeio completo. [Atenção: essa versão do aplicativo poderia ser
executada durante horas em um computador poderoso.] Mais uma vez, mantenha uma tabela do número de passeios de cada
comprimento e exiba essa tabela quando o primeiro passeio completo for localizado. Quantos percursos seu aplicativo
tenta antes de produzir um passeio completo? Quanto tempo ele levou?

d) Compare a versão de força bruta do Passeio do Cavalo com a versão de acessibilidade heurística. Qual exigiu um estudo
mais cuidadoso do problema? Qual algoritmo foi mais difícil de desenvolver? Qual exigiu mais capacidade do computador?
Poderíamos ter certeza (com antecedência) de obter um passeio completo com a abordagem de acessibilidade heurística?
Poderíamos ter certeza (com antecedência) de obter um passeio completo com a abordagem de força bruta? Argumente as
vantagens e desvantagens de resolver problemas de força bruta em geral.
 */

package com.leonardogtc.jcp.cap007.exercicios;

import java.util.Random;

public class E07_23_PasseioCavaloBruteForce {
    // Movimentos possíveis do cavalo (L)
    private static final int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };
    private static final int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };
    private static final Random random = new Random();

    static void main(String[] args) {
        int totalTentativas = 1000; // Parte (b)
        int[] frequenciaTamanho = new int[65]; // Índice 0 a 64
        int melhorPasseio = 0;

        System.out.println("Iniciando " + totalTentativas + " tentativas de passeios aleatórios...");

        for (int i = 0; i < totalTentativas; i++) {
            int tamanhoPasseio = executarPasseioAleatorio();
            frequenciaTamanho[tamanhoPasseio]++;

            if (tamanhoPasseio > melhorPasseio) {
                melhorPasseio = tamanhoPasseio;
            }
        }

        // Exibição da Tabela (Parte b)
        System.out.println("\n--- Frequência dos Comprimentos dos Passeios ---");
        System.out.printf("%-15s %-10s%n", "Comprimento", "Qtd Passeios");
        for (int k = 0; k < frequenciaTamanho.length; k++) {
            if (frequenciaTamanho[k] > 0) {
                System.out.printf("%-15d %-10d%n", k, frequenciaTamanho[k]);
            }
        }

        System.out.println("\nMelhor resultado obtido: " + melhorPasseio + " movimentos.");

    }

    // Parte (a): Lógica de um único passeio
    public static int executarPasseioAleatorio() {
        int[][] tabuleiro = new int[8][8];
        int currentRow = 0; // Pode começar aleatório ou em (0,0)
        int currentCol = 0;
        int movimentosRealizados = 1;

        tabuleiro[currentRow][currentCol] = 1; // Marca posição inicial

        boolean movimentoPossivel = true;

        while (movimentoPossivel && movimentosRealizados < 64) {
            movimentoPossivel = false;

            // Tenta mover aleatoriamente.
            // Abordagem ingênua: sorteia um movimento (0-7).
            // Se for inválido, tenta outro. Se todos falharem, para.

            // Cria uma lista embaralhada de tentativas para não viciar o loop
            int[] tentativas = {0, 1, 2, 3, 4, 5, 6, 7};
            shuffleArray(tentativas);

            for (int i : tentativas) {
                int testRow = currentRow + vertical[i];
                int testCol = currentCol + horizontal[i];

                if (ehValido(testRow, testCol, tabuleiro)) {
                    currentRow = testRow;
                    currentCol = testCol;
                    movimentosRealizados++;
                    tabuleiro[currentRow][currentCol] = movimentosRealizados;
                    movimentoPossivel = true;
                    break; // Sai do loop 'for' e faz o próximo movimento
                }
            }
        }

        // Se quiser ver o tabuleiro de um passeio específico, descomente abaixo:
        // if (movimentosRealizados > 40) imprimirTabuleiro(tabuleiro);

        return movimentosRealizados;
    }

    private static boolean ehValido(int row, int col, int[][] tabuleiro) {
        return (row >= 0 && row < 8) && (col >= 0 && col < 8) && (tabuleiro[row][col] == 0);
    }

    // Método auxiliar para embaralhar as tentativas de movimento
    private static void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static void imprimirTabuleiro(int[][] tabuleiro) {
        for (int[] row : tabuleiro) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
        System.out.println();
    }
}
