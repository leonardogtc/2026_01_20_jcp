package com.leonardogtc.jcp.cap006;

import java.util.Scanner;

public class MaximumFinder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar a entrada de três valores de ponto flutuante
        System.out.print("Digite três valores de ponto flutuante separados por espaço: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Determina o valor máximo
        double max = maximum(num1, num2, num3);

        // Exibe o valor máximo
        System.out.println("O valor máximo é: " + max);

        input.close();
    }

    // Retorna o valor máximo entre três números
    public static double maximum(double num1, double num2, double num3) {
        double max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}
