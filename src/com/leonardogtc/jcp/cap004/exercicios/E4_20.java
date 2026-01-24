package com.leonardogtc.jcp.cap004.exercicios;

import java.util.Scanner;

public class E4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis
        double salarioBruto = 0.0;
        int horasTrabalhadas = 0;
        int numFuncionarios = 3;
        int horasExtras = 0;
        double horasExtrasValor = 0.0;
        double valorHoraFuncionario = 0.0;
        double salarioLiquido = 0.0;
        String nomeFuncionario = "";

        StringBuilder listagem = new StringBuilder("Funcionário\t\tSalário Bruto\t\tH.T\t\tH.E\t\tSalário Líquido\n");
        listagem.append("===================================================================\n");

        int i = 0;
        while(i < numFuncionarios) {

            System.out.println("\n=== FUNCIONÁRIO " + (i+1) + " ===");
            String x = input.nextLine();
            System.out.print("Digite o nome do funcionário: ");
            nomeFuncionario = input.nextLine();

            System.out.print("Digite o salário Bruto: R$ ");
            salarioBruto = input.nextDouble();

            System.out.print("Digite as horas trabalhadas: ");
            horasTrabalhadas = input.nextInt();

            // Reinicializa variáveis para cada funcionário
            horasExtras = 0;
            horasExtrasValor = 0.0;
            salarioLiquido = salarioBruto; // Começa com o salário base

            // Determina o valor da hora do funcionário referente ao seu salário
            valorHoraFuncionario = salarioBruto / 40;

            if(horasTrabalhadas > 40) {
                horasExtras = horasTrabalhadas - 40;
                horasExtrasValor = horasExtras * (valorHoraFuncionario * 1.5);
                salarioLiquido = salarioBruto + horasExtrasValor;
            } else {
                salarioLiquido = salarioBruto;
            }

            listagem.append(String.format("%-15s\tR$ %9.2f\t\t%d\t\t%d\t\tR$ %9.2f%n", nomeFuncionario, salarioBruto, horasTrabalhadas, horasExtras, salarioLiquido));

            i++;
        }

        // Mostra resultados
        System.out.println("\n=== RELATÓRIO DE FOLHA DE PAGAMENTO ===\n");
        System.out.println(listagem.toString());


        input.close();
    }

}
