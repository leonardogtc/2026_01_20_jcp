package com.leonardogtc.jcp.cap007.exercicios;

public class E07_21_Ex {
    static void main(String[] args) {
        // Exemplo 1: Desenhar um quadrado
        System.out.println("=== Programa Quadrado ===");
        int[] squareCommands = {2, 5, 3, 5, 3, 5, 3, 5, 1, 6, 9};
        int[] squareParams = {12, 12, 12, 12};

        // Exemplo 2: Desenhar um triângulo
        System.out.println("\n=== Programa Triângulo ===");
        int[] triangleCommands = {2, 5, 3, 5, 4, 5, 1, 6, 9};
        int[] triangleParams = {10, 10, 14};

        // Exemplo 3: Desenhar uma espiral
        System.out.println("\n=== Programa Espiral ===");
        int[] spiralCommands = {2, 5, 3, 5, 3, 5, 3, 5, 5, 3, 5, 3, 5, 3, 5, 1, 6, 9};
        int[] spiralParams = {5, 5, 5, 5, 4, 4, 4, 4};

        // Executar os programas
        E07_21 turtle1 = new E07_21();
        turtle1.currentRow = 5;  // Começar no meio
        turtle1.currentCol = 5;
        turtle1.executeProgram(squareCommands, squareParams);

        E07_21 turtle2 = new E07_21();
        turtle2.currentRow = 10;
        turtle2.currentCol = 10;
        turtle2.executeProgram(triangleCommands, triangleParams);

        E07_21 turtle3 = new E07_21();
        turtle3.currentRow = 5;
        turtle3.currentCol = 5;
        turtle3.executeProgram(spiralCommands, spiralParams);
    }
}
