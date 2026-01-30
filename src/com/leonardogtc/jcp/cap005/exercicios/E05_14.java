package com.leonardogtc.jcp.cap005.exercicios;

public class E05_14 {
    public static void main(String[] args) {
        double principal = 1000.0;

        for (int taxa = 5; taxa <= 10; taxa++) {
            double juros = taxa / 100.0;
            System.out.printf("%nTaxa de juros: %d%%%n", taxa);
            System.out.printf("%s%20s%n", "Ano", "Valor em conta");

            for (int ano = 1; ano <= 10; ano++) {
                double valor = principal * Math.pow(1.0 + juros, ano);
                System.out.printf("%3d%,20.2f%n", ano, valor);
            }
        }
    }

}
