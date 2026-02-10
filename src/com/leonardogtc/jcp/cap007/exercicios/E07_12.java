package com.leonardogtc.jcp.cap007.exercicios;

/*
Enunciado:
(Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que
insere cinco números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver
uma duplicata de um número já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize
o menor array possível para resolver esse problema. Exiba o conjunto completo de valores únicos inseridos depois que o
usuário inserir cada valor novo.
 */

import java.util.Scanner;

public class E07_12 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valoresUnicos = new int[5]; // Menor array possível (pior caso: 5 números diferentes)
        int contador = 0;   // Controla quantos números únicos foram armazenados

        System.out.println("=== ELIMINAÇÃO DE DUPLICATAS ===");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d número: ", i + 1);
            int numero = input.nextInt();

            // Validação do intervalo
            if (numero >= 10 && numero <= 100) {
                boolean duplicata = false;

                // Verifica se o número foi inserido no array
                for (int j = 0; j < contador; j++) {
                    if (valoresUnicos[j] == numero) {
                        duplicata = true;
                        break;
                    }
                }

                if (!duplicata) {
                    valoresUnicos[contador] = numero;
                    System.out.printf("Novo número único: %d%n", numero);
                    contador++;
                } else {
                    System.out.printf("Número duplicado: %d%n", numero);
                }

                // Exibe o conjunto completo de valores únicos até o momento
                System.out.print("Valores únicos lidos: ");
                for (int k = 0; k < contador; k++) {
                    System.out.printf("%d ", valoresUnicos[k]);
                }

                System.out.println();

            } else {
                System.out.println("Número fora do intervalo permitido.");
            }
        }

        input.close();

    }
}
