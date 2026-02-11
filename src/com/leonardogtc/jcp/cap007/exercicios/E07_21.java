/*
Enunciado:
(Gráficos de tartaruga) A linguagem Logo tornou famoso o conceito de gráficos de tartaruga. Imagine uma tartaruga mecânica
que caminha no lugar sob o controle de um aplicativo Java. A tartaruga segura uma caneta em uma de duas posições, para
cima ou para baixo. Enquanto a caneta estiver para baixo, a tartaruga desenha formas à medida que se move, e enquanto
estiver para cima, a tartaruga move-se quase livremente sem escrever nada. Neste problema, você simulará a operação da
tartaruga e criará um bloco de rascunho computadorizado.

Utilize um array de 20 por 20 floor que é inicializado como zeros. Leia comandos a partir de um array que contenha esses
comandos. Monitore a posição atual da tartaruga todas as vezes e se a caneta está atualmente para cima ou para baixo.
Suponha que a tartaruga sempre inicie na posição (0, 0) do chão com sua caneta para cima. O conjunto de comandos de
tartaruga que seu aplicativo deve processar é mostrado na Figura 7.29.

Comando ---------- Significado
1 ---------------- Caneta para cima
2 ---------------- Caneta para baixo
3 ---------------- Vira para a direita
4 ---------------- Vira para a esquerda
5 ---------------- Avance 10 espaços (substitua 10 por um número diferente de espaços)
6 ---------------- Exiba o array 20 por 20
9 ---------------- Fim dos dados (sentinela)

Suponha que a tartaruga esteja em algum lugar próximo ao centro do chão. O “programa” seguinte desenharia e exibiria um
quadrado de 12 por 12 deixando a caneta na posição levantada:
2
5,12
3
5,12
3
5,12
3
5,12
1
6
9

À medida que a tartaruga se move com a caneta por baixo, configure os elementos apropriados do array floor como 1s. Quando
o comando 6 (exibir o array) for dado, onde quer que haja um 1 no array, exiba um asterisco ou o caractere que você escolher.
Onde quer que haja um 0, exiba um espaço em branco.

Escreva um aplicativo para implementar as capacidades dos gráficos de tartaruga discutidas aqui. Escreva vários programas
de gráfico de tartaruga para desenhar formas interessantes. Adicione outros comandos para aumentar as capacidades de sua
linguagem de gráfico de tartaruga.
 */

package com.leonardogtc.jcp.cap007.exercicios;


import java.util.Scanner;

public class E07_21 {
    // Constantes para comandos
    private static final int PEN_UP = 1;
    private static final int PEN_DOWN = 2;
    private static final int TURN_RIGHT = 3;
    private static final int TURN_LEFT = 4;
    private static final int MOVE = 5;
    private static final int DISPLAY = 6;
    private static final int EXIT = 9;

    // Tamanho do grid
    private static final int SIZE = 20;

    // Direções: 0=norte, 1=leste, 2=sul, 3=oeste
    private static final int NORTH = 0;
    private static final int EAST = 1;
    private static final int SOUTH = 2;
    private static final int WEST = 3;

    private int[][] floor;
    private boolean penDown;
    int currentRow;
    int currentCol;
    private int direction;
    private Scanner scanner;

    // Construtor
    public E07_21() {
        floor = new int[SIZE][SIZE];
        penDown = false; // Caneta começa para cima
        currentRow = 0;  // Posição inicial (0, 0)
        currentCol = 0;
        direction = EAST; // Começa virado para leste
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== GRÁFICOS DE TARTARUGA ===");
        System.out.println("Comandos disponíveis:");
        System.out.println("1 - Caneta para cima");
        System.out.println("2 - Caneta para baixo");
        System.out.println("3 - Vira para a direita");
        System.out.println("4 - Vira para a esquerda");
        System.out.println("5,n - Move n espaços (ex: 5,10)");
        System.out.println("6 - Exibir desenho");
        System.out.println("9 - Sair");
        System.out.println("=============================\n");

        boolean running = true;

        while (running) {
            System.out.print("Digite o comando: ");
            String input = scanner.nextLine().trim();

            try {
                if (input.contains(",")) {
                    // Comando com parâmetro (ex: 5,10)
                    String[] parts = input.split(",");
                    int command = Integer.parseInt(parts[0].trim());
                    int spaces = Integer.parseInt(parts[1].trim());

                    if (command == MOVE) {
                        move(spaces);
                    } else {
                        System.out.println("Comando inválido!");
                    }
                } else {
                    int command = Integer.parseInt(input);

                    switch (command) {
                        case PEN_UP:
                            penUp();
                            break;
                        case PEN_DOWN:
                            penDown();
                            break;
                        case TURN_RIGHT:
                            turnRight();
                            break;
                        case TURN_LEFT:
                            turnLeft();
                            break;
                        case DISPLAY:
                            displayFloor();
                            break;
                        case EXIT:
                            running = false;
                            System.out.println("Programa encerrado.");
                            break;
                        default:
                            System.out.println("Comando inválido!");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
            }
        }

        scanner.close();
    }

    private void penUp() {
        penDown = false;
        System.out.println("Caneta levantada");
    }

    private void penDown() {
        penDown = true;
        System.out.println("Caneta abaixada");
    }

    private void turnRight() {
        direction = (direction + 1) % 4;
        System.out.println("Virou para a direita. Direção: " + getDirectionName());
    }

    private void turnLeft() {
        direction = (direction + 3) % 4; // Equivalente a -1 mod 4
        System.out.println("Virou para a esquerda. Direção: " + getDirectionName());
    }

    private String getDirectionName() {
        switch (direction) {
            case NORTH:
                return "Norte";
            case EAST:
                return "Leste";
            case SOUTH:
                return "Sul";
            case WEST:
                return "Oeste";
            default:
                return "Desconhecida";
        }
    }

    private void move(int spaces) {
        System.out.println("Movendo " + spaces + " espaços para " + getDirectionName());

        for (int i = 0; i < spaces; i++) {
            // Marcar posição atual se a caneta está para baixo
            if (penDown) {
                if (currentRow >= 0 && currentRow < SIZE &&
                        currentCol >= 0 && currentCol < SIZE) {
                    floor[currentRow][currentCol] = 1;
                }
            }

            // Mover para próxima posição
            switch (direction) {
                case NORTH:
                    currentRow--;
                    break;
                case EAST:
                    currentCol++;
                    break;
                case SOUTH:
                    currentRow++;
                    break;
                case WEST:
                    currentCol--;
                    break;
            }

            // Verificar limites
            if (currentRow < 0) currentRow = 0;
            if (currentRow >= SIZE) currentRow = SIZE - 1;
            if (currentCol < 0) currentCol = 0;
            if (currentCol >= SIZE) currentCol = SIZE - 1;

            // Marcar nova posição se a caneta está para baixo
            if (penDown) {
                if (currentRow < SIZE && currentCol >= 0 && currentCol < SIZE) {
                    floor[currentRow][currentCol] = 1;
                }
            }
        }

        System.out.println("Posição atual: (" + currentRow + ", " + currentCol + ")");
    }

    private void displayFloor() {
        System.out.println("\n=== DESENHO ATUAL ===");

        // Imprimir borda superior
        System.out.print("  ");
        for (int col = 0; col < SIZE; col++) {
            System.out.print(col % 10); // Mostra unidades para referência
        }
        System.out.println();

        // Imprimir grid
        for (int row = 0; row < SIZE; row++) {
            System.out.printf("%2d", row); // Número da linha
            for (int col = 0; col < SIZE; col++) {
                if (row == currentRow && col == currentCol) {
                    // Posição atual da tartaruga
                    System.out.print(getTurtleSymbol());
                } else if (floor[row][col] == 1) {
                    System.out.print("*"); // Desenho
                } else {
                    System.out.print(" "); // Espaço vazio
                }
            }
            System.out.println();
        }

        System.out.println("Legenda: " + getTurtleSymbol() + " = Tartaruga, * = Desenho");
        System.out.println("Posição: (" + currentRow + ", " + currentCol + ")");
        System.out.println("Direção: " + getDirectionName());
        System.out.println("Caneta: " + (penDown ? "BAIXA" : "ALTA"));
        System.out.println("=====================\n");
    }

    private char getTurtleSymbol() {
        switch (direction) {
            case NORTH:
                return '↑';
            case EAST:
                return '→';
            case SOUTH:
                return '↓';
            case WEST:
                return '←';
            default:
                return '○';
        }
    }

    // Método para executar programas pré-definidos
    public void executeProgram(int[] commands, int[] parameters) {
        System.out.println("\n=== EXECUTANDO PROGRAMA ===");

        int paramIndex = 0;
        for (int i = 0; i < commands.length; i++) {
            int command = commands[i];

            switch (command) {
                case PEN_UP:
                    penUp();
                    break;
                case PEN_DOWN:
                    penDown();
                    break;
                case TURN_RIGHT:
                    turnRight();
                    break;
                case TURN_LEFT:
                    turnLeft();
                    break;
                case MOVE:
                    if (paramIndex < parameters.length) {
                        move(parameters[paramIndex++]);
                    }
                    break;
                case DISPLAY:
                    displayFloor();
                    break;
                case EXIT:
                    System.out.println("Fim do programa");
                    return;
            }

            // Pequena pausa para visualização
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void main(String[] args) {
        E07_21 turtle = new E07_21();

        if (args.length > 0 && args[0].equals("auto")) {
            // Exemplo 1: Quadrado 12x12
            System.out.println("\n=== EXEMPLO 1: Quadrado 12x12 ===");
            int[] squareCommands = {2, 5, 3, 5, 3, 5, 3, 5, 1, 6, 9};
            int[] squareParams = {12, 12, 12, 12};
            turtle.executeProgram(squareCommands, squareParams);

            // Reset para próximo exemplo
            turtle = new E07_21();

            // Exemplo 2: Triângulo
            System.out.println("\n=== EXEMPLO 2: Triângulo ===");
            int[] triangleCommands = {2, 5, 3, 5, 4, 5, 1, 6, 9};
            int[] triangleParams = {10, 10, 14};
            // Começar no meio
            turtle.currentRow = 10;
            turtle.currentCol = 10;
            turtle.executeProgram(triangleCommands, triangleParams);

            // Reset para próximo exemplo
            turtle = new E07_21();

            // Exemplo 3: Letra "T"
            System.out.println("\n=== EXEMPLO 3: Letra 'T' ===");
            int[] tCommands = {2, 5, 1, 3, 5, 2, 4, 5, 4, 5, 1, 6, 9};
            int[] tParams = {5, 3, 2, 4};
            turtle.currentRow = 5;
            turtle.currentCol = 5;
            turtle.executeProgram(tCommands, tParams);

        } else {
            // Modo interativo
            turtle.run();
        }
    }

}
