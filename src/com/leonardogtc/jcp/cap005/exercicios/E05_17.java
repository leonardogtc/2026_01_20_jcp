package com.leonardogtc.jcp.cap005.exercicios;

public class E05_17 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double totalVendas = 0.0;

        System.out.println("Digite o número do produto (1-5) e a quantidade vendida.");
        System.out.println("Digite -1 no número do produto para sair.");

        while (true) {
            System.out.print("Número do produto: ");
            int produto = input.nextInt();

            if (produto == -1) {
                break;
            }

            System.out.print("Quantidade vendida: ");
            int quantidade = input.nextInt();

            switch (produto) {
                case 1:
                    totalVendas += quantidade * 2.98;
                    break;
                case 2:
                    totalVendas += quantidade * 4.50;
                    break;
                case 3:
                    totalVendas += quantidade * 9.98;
                    break;
                case 4:
                    totalVendas += quantidade * 4.49;
                    break;
                case 5:
                    totalVendas += quantidade * 6.87;
                    break;
                default:
                    System.out.println("Produto inválido.");
                    break;
            }
        }

        System.out.printf("%nO valor total de todos os produtos vendidos é: R$ %.2f%n", totalVendas);
    }

}
