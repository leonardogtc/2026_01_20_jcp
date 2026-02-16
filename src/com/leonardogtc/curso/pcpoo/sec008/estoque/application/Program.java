package com.leonardogtc.curso.pcpoo.sec008.estoque.application;

import com.leonardogtc.curso.pcpoo.sec008.estoque.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre com os dados do produto");
        System.out.println("------------------------------");
        System.out.print("Digite o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Entre com o preço do produto: ");
        produto.preco = sc.nextDouble();

        System.out.print("Entre com o quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.printf("%s - %.2f - %d", produto.nome, produto.preco, produto.quantidade);

        System.out.println("\n");
        System.out.println(produto);

        sc.close();
    }
}
