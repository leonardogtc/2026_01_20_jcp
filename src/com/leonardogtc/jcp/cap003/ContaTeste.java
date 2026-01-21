package com.leonardogtc.jcp.cap003;

import java.util.Scanner;

public class ContaTeste {
    static void main(String[] args) {
        // Cria um objeto Scanner para obter entrada a partir da janela de comandos
        Scanner input = new Scanner(System.in);

        // Cria um objeto conta e o atribui a minhaConta
        Conta minhaConta = new Conta();

        // Exibe o valor inicial do nome (null)
        System.out.println("Nome: " + minhaConta.getNome());

        // Solicita o lê o nome
        System.out.print("Digite o nome da conta: ");
        String Nome = input.nextLine();
        minhaConta.setNome(Nome);
        System.out.println();

        // Exibir o nome armazenado no objeto minhaConta
        System.out.printf("O nome do objeto minhaConta é: %s%n", minhaConta.getNome());

        // Fecha o objeto Input
        input.close();
    }
}
