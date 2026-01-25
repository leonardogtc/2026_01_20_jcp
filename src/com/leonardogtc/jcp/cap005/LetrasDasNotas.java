package com.leonardogtc.jcp.cap005;

import java.util.Scanner;

public class LetrasDasNotas {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int total = 0; // Soma das notas
        int contadorNotas = 0; // Número de notas inseridas
        int notas_A = 0;
        int notas_B = 0;
        int notas_C = 0;
        int notas_D = 0;
        int notas_E = 0;

        System.out.printf("%s%n%s%n - %s%n - %s%n",
                "Digite uma nota inteira entre 0-100.",
                "Tecle o indicador de final de arquivo para terminar a entrada de dados:",
                "No UNIX/Linux/Mac OS X tecle <Ctrl> d e pressione Enter",
                "No Windows tecle <Ctrl> z então pressione Enter");

        // Faz um loop até que o usuário insira o indicador de final de arquivo
        while(input.hasNext()) {
            // Lê a nota digitada
            int nota = input.nextInt();

            // Adiciona a nota ao total
            total += nota;

            // Incrementa o número de notas
            contadorNotas++;

            // Implementa o contador de letras de notas adequado.
            switch (nota/10) {
                case 10:
                case 9:
                    ++notas_A;
                    break;
                case 8:
                case 7:
                    ++notas_B;
                    break;
                case 6:
                    ++notas_C;
                    break;
                case 5:
                    ++notas_D;
                    break;
                default:
                    ++notas_E;
                    break;
            }
        }

        if(contadorNotas != 0) {
            double media = (double) total / contadorNotas;

            // Gerar saidas
            System.out.printf("O total das notas digitadas = %d%n", total);
            System.out.printf("A média da classe = %.2f%n", media);
            System.out.printf("A quantidade de notas A = %d%n", notas_A);
            System.out.printf("A quantidade de notas B = %d%n", notas_B);
            System.out.printf("A quantidade de notas C = %d%n", notas_C);
            System.out.printf("A quantidade de notas D = %d%n", notas_D);
            System.out.printf("A quantidade de notas E = %d%n", notas_E);
        } else {
            System.out.println("Nenhuma nota foi digitada!");
        }

        input.close();
    }
}
