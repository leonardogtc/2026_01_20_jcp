package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_35 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Custo total por dia de direção: ");
        double custoTotalPorDia = input.nextDouble();

        System.out.print("Total de milhas dirigidas por dia: ");
        double milhasPorDia = input.nextDouble();

        System.out.print("Custo por galão de gasolina: ");
        double custoPorGalao = input.nextDouble();

        System.out.print("Média de milhas por galão: ");
        double milhasPorGalao = input.nextDouble();

        System.out.print("Taxas de estacionamento por dia: ");
        double taxasEstacionamento = input.nextDouble();

        System.out.print("Pedágios por dia: ");
        double pedagios = input.nextDouble();

        double custoGasolinaPorDia = (milhasPorDia / milhasPorGalao) * custoPorGalao;
        double custoTotalDiario = custoGasolinaPorDia + taxasEstacionamento + pedagios;

        System.out.printf("Seu custo diário de direção é: %.2f%n", custoTotalDiario);

        input.close();
    }

}
