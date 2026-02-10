package com.leonardogtc.jcp.cap007.exercicios;

/*
Enunciado:
(Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu
pessoal de vendas por comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa
semana. Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total
de R$ 650. Escreva um aplicativo (utilizando um array de contadores) que determina quanto o pessoal de vendas ganhou em
cada um dos seguintes intervalos (suponha que o salário de cada vendedor foi truncado para uma quantia inteira):

a) R$ 200–299
b) R$ 300–399
c) R$ 400–499
d) R$ 500–599
e) R$ 600–699
f) R$ 700–799
g) R$ 800–899
h) R$ 900–999
i) R$ 1.000 e acima
Resuma os resultados em formato tabular.
 */

import java.util.Scanner;

public class E07_10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array de contadores para cada intervalo de salário
        int[] contadores = new int[9];

        // Array com as descrições dos intervalos
        String[] intervalos = {
                "R$ 200-299",
                "R$ 300-399",
                "R$ 400-499",
                "R$ 500-599",
                "R$ 600-699",
                "R$ 700-799",
                "R$ 800-899",
                "R$ 900-999",
                "R$ 1.000 e acima"
        };

        System.out.println("=== SISTEMA DE COMISSÕES DE VENDAS ===");
        System.out.println("Digite as vendas brutas de cada vendedor.");
        System.out.println("Para encerrar, digite um valor negativo.\n");

        int vendedorNum = 1;

        while(true) {
            System.out.printf("Vendedor %d - Vendas brutas R$ ", vendedorNum);
            double vendas = input.nextDouble();

            if (vendas < 0) {
                break;
            }

            // Calcula salário: R$ 200 + 9% das vendas
            double salario = 200 + (vendas * 0.09);

            // Determina o índice do intervalo
            int indice;
            if (salario >= 1000) {
                indice = 8;
            } else if(salario >= 200) {
                indice = (int)((salario / 100) - 2);
            } else {
                indice = 0;
            }

            // Incrementa o contador
            if(indice >=0 && indice < contadores.length) {
                contadores[indice]++;
            }

            vendedorNum++;

        }

        // Exibe resultados tabulares
        System.out.println("\n=== RESUMO ESTATÍSTICO ===");
        System.out.println("-----------------------------------");
        System.out.printf("%-20s %s%n", "Faixa Salarial", "Quantidade");
        System.out.println("-----------------------------------");

        for(int i = 0; i < intervalos.length; i++) {
            System.out.printf("%-20s %d%n", intervalos[i], contadores[i]);
        }

        // Calcula o total de vendedores
        int totalVendedores = 0;
        for(int contador : contadores) {
            totalVendedores += contador;
        }

        System.out.println("-----------------------------------");
        System.out.printf("%-20s %d%n", "Total de Vendedores", totalVendedores);
        System.out.println("-----------------------------------");


        input.close();
    }
}
