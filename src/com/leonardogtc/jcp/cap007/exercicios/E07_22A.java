package com.leonardogtc.jcp.cap007.exercicios;

public class E07_22A {
    // Movimentos possíveis do cavalo (em formato L)
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    // Tabuleiro 8x8
    private static final int TAMANHO = 8;

    // Heurística de acessibilidade inicial
    private static final int[][] heuristica = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
    };

    public static void main(String[] args) {
        System.out.println("=== PARTE B: Passeio do Cavalo Básico ===");
        realizarPasseioBasico(3, 4); // Começa perto do centro

        System.out.println("\n=== PARTE C: Passeio com Heurística de Acessibilidade ===");
        realizarPasseioComHeuristica(0, 0); // Começa no canto

        System.out.println("\n=== PARTE C: Testando todos os pontos de início ===");
        testarTodosOsPontosDeInicio();

        System.out.println("\n=== PARTE D: Passeio com Heurística Aprimorada ===");
        realizarPasseioComHeuristicaAprimorada(0, 0);
    }

    // PARTE B: Passeio básico sem heurística
    public static void realizarPasseioBasico(int linhaInicial, int colunaInicial) {
        int[][] tabuleiro = new int[TAMANHO][TAMANHO];
        int linhaAtual = linhaInicial;
        int colunaAtual = colunaInicial;
        int movimentoNum = 1;

        // Marca a posição inicial
        tabuleiro[linhaAtual][colunaAtual] = movimentoNum;

        // Tenta fazer 63 movimentos adicionais (total de 64)
        while (movimentoNum < 64) {
            boolean movimentoFeito = false;

            // Tenta todos os movimentos possíveis em ordem
            for (int i = 0; i < 8; i++) {
                int novaLinha = linhaAtual + vertical[i];
                int novaColuna = colunaAtual + horizontal[i];

                // Verifica se o movimento é válido
                if (movimentoValido(novaLinha, novaColuna, tabuleiro)) {
                    linhaAtual = novaLinha;
                    colunaAtual = novaColuna;
                    tabuleiro[linhaAtual][colunaAtual] = ++movimentoNum;
                    movimentoFeito = true;
                    break;
                }
            }

            // Se não conseguiu fazer nenhum movimento, para
            if (!movimentoFeito) {
                break;
            }
        }

        exibirTabuleiro(tabuleiro);
        System.out.println("Movimentos realizados: " + movimentoNum);
    }

    // PARTE C: Passeio com heurística de acessibilidade
    public static void realizarPasseioComHeuristica(int linhaInicial, int colunaInicial) {
        int[][] tabuleiro = new int[TAMANHO][TAMANHO];
        int[][] acessibilidade = copiarHeuristica();
        int linhaAtual = linhaInicial;
        int colunaAtual = colunaInicial;
        int movimentoNum = 1;

        tabuleiro[linhaAtual][colunaAtual] = movimentoNum;
        atualizarAcessibilidade(linhaAtual, colunaAtual, acessibilidade);

        while (movimentoNum < 64) {
            int melhorMovimento = -1;
            int menorAcessibilidade = Integer.MAX_VALUE;

            // Encontra o movimento com menor acessibilidade
            for (int i = 0; i < 8; i++) {
                int novaLinha = linhaAtual + vertical[i];
                int novaColuna = colunaAtual + horizontal[i];

                if (movimentoValido(novaLinha, novaColuna, tabuleiro)) {
                    if (acessibilidade[novaLinha][novaColuna] < menorAcessibilidade) {
                        menorAcessibilidade = acessibilidade[novaLinha][novaColuna];
                        melhorMovimento = i;
                    }
                    // Em caso de empate, mantém o primeiro encontrado
                }
            }

            if (melhorMovimento == -1) {
                break;
            }

            // Executa o melhor movimento
            linhaAtual += vertical[melhorMovimento];
            colunaAtual += horizontal[melhorMovimento];
            tabuleiro[linhaAtual][colunaAtual] = ++movimentoNum;
            atualizarAcessibilidade(linhaAtual, colunaAtual, acessibilidade);
        }

        exibirTabuleiro(tabuleiro);
        System.out.println("Movimentos realizados: " + movimentoNum);
    }

    // PARTE C: Testar todos os pontos de início
    public static void testarTodosOsPontosDeInicio() {
        int passeiosCompletos = 0;

        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                int movimentos = realizarPasseioCompleto(linha, coluna);
                if (movimentos == 64) {
                    passeiosCompletos++;
                }
            }
        }

        System.out.println("Passeios completos: " + passeiosCompletos + " de 64");
    }

    // PARTE D: Passeio com heurística aprimorada (visão do próximo movimento)
    public static void realizarPasseioComHeuristicaAprimorada(int linhaInicial, int colunaInicial) {
        int[][] tabuleiro = new int[TAMANHO][TAMANHO];
        int[][] acessibilidade = copiarHeuristica();
        int linhaAtual = linhaInicial;
        int colunaAtual = colunaInicial;
        int movimentoNum = 1;

        tabuleiro[linhaAtual][colunaAtual] = movimentoNum;
        atualizarAcessibilidade(linhaAtual, colunaAtual, acessibilidade);

        while (movimentoNum < 64) {
            int melhorMovimento = -1;
            int menorAcessibilidade = Integer.MAX_VALUE;
            int menorAcessibilidadeDoProximo = Integer.MAX_VALUE;

            // Encontra o movimento com menor acessibilidade
            for (int i = 0; i < 8; i++) {
                int novaLinha = linhaAtual + vertical[i];
                int novaColuna = colunaAtual + horizontal[i];

                if (movimentoValido(novaLinha, novaColuna, tabuleiro)) {
                    int acessAtual = acessibilidade[novaLinha][novaColuna];

                    // Verifica a acessibilidade do próximo movimento a partir desta posição
                    int acessProximo = Integer.MAX_VALUE;
                    for (int j = 0; j < 8; j++) {
                        int proxLinha = novaLinha + vertical[j];
                        int proxColuna = novaColuna + horizontal[j];

                        if (movimentoValido(proxLinha, proxColuna, tabuleiro)) {
                            acessProximo = Math.min(acessProximo, acessibilidade[proxLinha][proxColuna]);
                        }
                    }

                    // Critério de seleção: primeiro por acessibilidade atual,
                    // em caso de empate, pelo próximo movimento
                    if (acessAtual < menorAcessibilidade ||
                            (acessAtual == menorAcessibilidade && acessProximo < menorAcessibilidadeDoProximo)) {
                        menorAcessibilidade = acessAtual;
                        menorAcessibilidadeDoProximo = acessProximo;
                        melhorMovimento = i;
                    }
                }
            }

            if (melhorMovimento == -1) {
                break;
            }

            // Executa o melhor movimento
            linhaAtual += vertical[melhorMovimento];
            colunaAtual += horizontal[melhorMovimento];
            tabuleiro[linhaAtual][colunaAtual] = ++movimentoNum;
            atualizarAcessibilidade(linhaAtual, colunaAtual, acessibilidade);
        }

        exibirTabuleiro(tabuleiro);
        System.out.println("Movimentos realizados: " + movimentoNum);
    }

    // Métodos auxiliares
    private static boolean movimentoValido(int linha, int coluna, int[][] tabuleiro) {
        return linha >= 0 && linha < TAMANHO &&
                coluna >= 0 && coluna < TAMANHO &&
                tabuleiro[linha][coluna] == 0;
    }

    private static void exibirTabuleiro(int[][] tabuleiro) {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.printf("%3d", tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] copiarHeuristica() {
        int[][] copia = new int[TAMANHO][TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            System.arraycopy(heuristica[i], 0, copia[i], 0, TAMANHO);
        }
        return copia;
    }

    private static void atualizarAcessibilidade(int linha, int coluna, int[][] acessibilidade) {
        // Reduz a acessibilidade de todas as casas que podem alcançar esta
        for (int i = 0; i < 8; i++) {
            int linhaOrigem = linha - vertical[i];
            int colunaOrigem = coluna - horizontal[i];

            if (linhaOrigem >= 0 && linhaOrigem < TAMANHO &&
                    colunaOrigem >= 0 && colunaOrigem < TAMANHO) {
                acessibilidade[linhaOrigem][colunaOrigem] =
                        Math.max(0, acessibilidade[linhaOrigem][colunaOrigem] - 1);
            }
        }
    }

    private static int realizarPasseioCompleto(int linhaInicial, int colunaInicial) {
        int[][] tabuleiro = new int[TAMANHO][TAMANHO];
        int[][] acessibilidade = copiarHeuristica();
        int linhaAtual = linhaInicial;
        int colunaAtual = colunaInicial;
        int movimentoNum = 1;

        tabuleiro[linhaAtual][colunaAtual] = movimentoNum;
        atualizarAcessibilidade(linhaAtual, colunaAtual, acessibilidade);

        while (movimentoNum < 64) {
            int melhorMovimento = -1;
            int menorAcessibilidade = Integer.MAX_VALUE;

            for (int i = 0; i < 8; i++) {
                int novaLinha = linhaAtual + vertical[i];
                int novaColuna = colunaAtual + horizontal[i];

                if (movimentoValido(novaLinha, novaColuna, tabuleiro)) {
                    if (acessibilidade[novaLinha][novaColuna] < menorAcessibilidade) {
                        menorAcessibilidade = acessibilidade[novaLinha][novaColuna];
                        melhorMovimento = i;
                    }
                }
            }

            if (melhorMovimento == -1) {
                break;
            }

            linhaAtual += vertical[melhorMovimento];
            colunaAtual += horizontal[melhorMovimento];
            tabuleiro[linhaAtual][colunaAtual] = ++movimentoNum;
            atualizarAcessibilidade(linhaAtual, colunaAtual, acessibilidade);
        }

        return movimentoNum;
    }
}
