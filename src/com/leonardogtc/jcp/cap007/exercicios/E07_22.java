/*
Enunciado do problema:
(Passeio do cavalo) Um problema interessante para os fãs de xadrez é o problema do Passeio do Cavalo, originalmente
proposto pelo matemático Euler. A peça do cavalo pode mover-se em um tabuleiro vazio e tocar cada um dos 64 quadrados
somente uma única vez? Aqui, estudamos esse intrigante problema em profundidade.

O cavalo só faz movimentos em forma de L (dois espaços em uma direção e um outro em uma direção perpendicular). Portanto,
como mostrado na Figura 7.30, partindo de um quadrado próximo do centro de um tabuleiro de xadrez vazio, o cavalo (rotulado K)
pode fazer oito movimentos diferentes (numerados de 0 a 7).

a) Desenhe um tabuleiro de xadrez oito por oito em uma folha de papel e tente o Passeio do Cavalo manualmente. Coloque
um 1 no quadrado inicial, um 2 no segundo quadrado, um 3 no terceiro e assim por diante. Antes de iniciar o passeio, estime
até onde você chegará, lembrando que um passeio completo consiste em 64 movimentos. Até onde você foi? Isso foi próximo
de sua estimativa?

b) Agora vamos desenvolver um aplicativo que moverá o cavalo pelo tabuleiro. O tabuleiro é representado por um array
bidimensional oito por oito board. Cada quadrado é inicializado como zero. Descrevemos cada um dos oito possíveis movimentos
em termos de seus componentes vertical e horizontal. Por exemplo, um movimento do tipo 0, como mostrado na Figura 7.30,
consiste em mover dois quadrados horizontalmente para a direita e um quadrado verticalmente para cima. Um movimento do
tipo 2 consiste em mover um quadrado horizontalmente para a esquerda e dois quadrados verticalmente para cima. Movimentos
horizontais para a esquerda e movimentos verticais para cima são indicados com números negativos. Os oitos movimentos podem
ser descritos por dois arrays unidimensionais, horizontal e vertical, como segue:

  0 1 2 3 4 5 6 7
0 - - - - - - - -
1 - - - 2 - 1 - -
2 - - 3 - - - 0 -
3 - - - - K - - -
4 - - 4 - - - 7 -
5 - - - 5 - 6 - -
6 - - - - - - - -
7 - - - - - - - -

Faça com que as variáveis currentRow e currentColumn indiquem, respectivamente, a linha e a coluna da posição atual do
cavalo. Para fazer um movimento do tipo moveNumber, em que moveNumber está entre 0 e 7, seu aplicativo deve utilizar as
instruções

currentRow += vertical[moveNumber];
currentColumn += horizontal[moveNumber];

Escreva um aplicativo para mover o cavalo pelo tabuleiro. Mantenha um contador que varia de 1 a 64. Registre a última
contagem em cada quadrado para o qual o cavalo se move. Teste cada movimento potencial para ver se o cavalo já visitou
esse quadrado. Teste cada movimento potencial para assegurar que o cavalo não saia fora do tabuleiro. Execute o aplicativo.
Quantos movimentos o cavalo fez?

c) Depois de tentar escrever e executar um aplicativo para o Passeio do Cavalo, você provavelmente desenvolveu algumas
ideias valiosas. Usaremos essas informações para desenvolver uma heurística (isto é, uma regra de senso comum) para mover
o cavalo. A heurística não garante sucesso, mas ela, cuidadosamente desenvolvida, aprimora significativamente a chance
de sucesso. Você pode ter observado que os quadrados externos são mais incômodos que os quadrados próximos do centro do
tabuleiro. De fato, os quadrados mais problemáticos ou inacessíveis são os quatro cantos.

A intuição pode sugerir que você deva tentar mover o cavalo para os quadrados mais problemáticos primeiro e deixar abertos
aqueles que são fáceis de alcançar, de modo que, quando o tabuleiro ﬁcar congestionado próximo do ﬁm do passeio, haja maior
chance de sucesso.

Poderíamos desenvolver uma “acessibilidade heurística” classiﬁcando cada um dos quadrados de acordo com seu grau de
acessibilidade e sempre movendo os cavalos (utilizando os movimentos em forma de L) para o quadrado mais inacessível.
Rotulamos um array bidimensional accessibility com números indicando a partir de quantos quadrados cada quadrado particular
é acessível. Em um tabuleiro vazio, cada um dos 16 quadrados mais próximos do centro é avaliado como 8, o quadrado de cada
canto é avaliado como 2 e os outros quadrados têm números de acessibilidade de 3, 4 ou 6 como segue:

2 3 4 4 4 4 3 2
3 4 6 6 6 6 4 3
4 6 8 8 8 8 6 4
4 6 8 8 8 8 6 4
4 6 8 8 8 8 6 4
4 6 8 8 8 8 6 4
3 4 6 6 6 6 4 3
2 3 4 4 4 4 3 2

Escreva uma versão do Passeio do Cavalo utilizando a heurística de acessibilidade. O cavalo sempre deve se mover para o
quadrado com o número de acessibilidade mais baixo. Em caso de um impasse, o cavalo pode mover-se para qualquer quadrado
já visitado. Portanto, o passeio pode iniciar em qualquer um dos quatro cantos. [Observação: à medida que o cavalo se
move pelo tabuleiro de xadrez, seu aplicativo deve reduzir os números de acessibilidade, uma vez que mais quadrados
tornam-se ocupados. Dessa maneira, em qualquer dado tempo durante o passeio, o número de acessibilidade de cada quadrado
disponível permanecerá precisamente igual ao número de quadrados a partir dos quais esse quadrado pode ser alcançado.]
Execute essa versão do aplicativo. Você obteve um passeio completo? Modiﬁque o aplicativo para executar 64 passeios,
iniciando a partir de cada quadrado do tabuleiro de xadrez. Quantos passeios completos você obteve?

d) Escreva uma versão do aplicativo Passeio do Cavalo que, diante de um impasse entre dois ou mais quadrados, decide qual
escolher vislumbrando os quadrados alcançáveis a partir daqueles geradores do impasse. Seu aplicativo deve mover para o
quadrado empatado para o qual o próximo movimento chegaria a um quadrado com o número de acessibilidade mais baixo.
 */

package com.leonardogtc.jcp.cap007.exercicios;

public class E07_22 {

    // Matriz de acessibilidade inicial (item c)
    private static final int[][] ACCESSIBILITY = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
    };

    private int[][] board;
    private int[][] currentAccess;
    private int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private int currentRow;
    private int currentColumn;

    public void iniciarPasseio(int startRow, int startCol) {
        board = new int[8][8];
        currentAccess = copiarAcessibilidade();
        currentRow = startRow;
        currentColumn = startCol;

        int moveNumber = 1;
        board[currentRow][currentColumn] = moveNumber;

        while (moveNumber < 64) {
            int targetMove = buscarMelhorMovimento();

            if (targetMove == -1) break; // Impasse

            // Antes de mover, atualizamos a acessibilidade dos vizinhos
            atualizarAcessibilidade(currentRow, currentColumn);

            currentRow += vertical[targetMove];
            currentColumn += horizontal[targetMove];
            moveNumber++;
            board[currentRow][currentColumn] = moveNumber;
        }

        imprimirTabuleiro();
        System.out.printf("Fim do passeio. Movimentos realizados: %d%n", moveNumber);
    }

    private int buscarMelhorMovimento() {
        int minAccess = 9;
        int bestMove = -1;

        for (int i = 0; i < 8; i++) {
            int nextR = currentRow + vertical[i];
            int nextC = currentColumn + horizontal[i];

            if (isMovimentoValido(nextR, nextC)) {
                int access = currentAccess[nextR][nextC];

                if (access < minAccess) {
                    minAccess = access;
                    bestMove = i;
                }
                // Item (d): Desempate olhando adiante
                else if (access == minAccess && bestMove != -1) {
                    if (olharAdiante(nextR, nextC) < olharAdiante(currentRow + vertical[bestMove], currentColumn + horizontal[bestMove])) {
                        bestMove = i;
                    }
                }
            }
        }
        return bestMove;
    }

    private boolean isMovimentoValido(int r, int c) {
        return (r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == 0);
    }

    private void atualizarAcessibilidade(int r, int c) {
        for (int i = 0; i < 8; i++) {
            int nextR = r + vertical[i];
            int nextC = c + horizontal[i];
            if (nextR >= 0 && nextR < 8 && nextC >= 0 && nextC < 8) {
                currentAccess[nextR][nextC]--;
            }
        }
    }

    private int olharAdiante(int r, int c) {
        int minNextAccess = 9;
        for (int i = 0; i < 8; i++) {
            int nextR = r + vertical[i];
            int nextC = c + horizontal[i];
            if (isMovimentoValido(nextR, nextC)) {
                if (currentAccess[nextR][nextC] < minNextAccess)
                    minNextAccess = currentAccess[nextR][nextC];
            }
        }
        return minNextAccess;
    }

    private int[][] copiarAcessibilidade() {
        int[][] copia = new int[8][8];
        for (int i = 0; i < 8; i++) System.arraycopy(ACCESSIBILITY[i], 0, copia[i], 0, 8);
        return copia;
    }

    private void imprimirTabuleiro() {
        for (int[] linha : board) {
            for (int casa : linha) System.out.printf("%2d ", casa);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new E07_22().iniciarPasseio(0, 0); // Começa pelo canto (0,0)
    }
}
