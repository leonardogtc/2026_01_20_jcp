package com.leonardogtc.jcp.cap004.exercicios;

import java.util.Scanner;

public class E4_19 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declara variáveis e as inicializa
        int item = 0;
        double valor = 0.0;
        double totalValor = 0.0;
        double comissao = 0.0;
        StringBuilder listagem = new StringBuilder("Item\tValor\n");

        // Entrada de dados
        System.out.print("Digite o valor do item pi -1 para encerra o programa: ");
        valor = input.nextDouble();


        if(valor != -1) {
            totalValor += valor;
            listagem.append(String.format("%d\t\t%.2f%n", item, valor));
            item++;
        }

        while(valor != -1) {
            System.out.print("Digite o valor do item pi -1 para encerra o programa: ");
            valor = input.nextDouble();

            if(valor != -1) {
                totalValor += valor;
                listagem.append(String.format("%d\t\t%.2f%n", item, valor));
                item++;
            }
        }

        // Mostra saída de dados
        if(totalValor != 0) {

            System.out.println(listagem);
            comissao = 200 + (totalValor * 0.09);

            System.out.printf("O total de itens é: %d%n", item);
            System.out.printf("O total de valor é: %.2f%n", totalValor);
            System.out.printf("O total de comissão é: %.2f%n", totalValor * 0.09);
            System.out.printf("A de ganhos do vendedor é: %.2f%n", comissao);
        } else {
            System.out.println("Nenhum item foi digitado!");
        }

        input.close();
    }
}
