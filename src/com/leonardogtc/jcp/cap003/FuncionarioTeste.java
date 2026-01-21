// Relativo ao exercício 3.12 - Java Como Programar 10ª Edição
package com.leonardogtc.jcp.cap003;

public class FuncionarioTeste {
    static void main(String[] args) {
        Funcionario func1 = new Funcionario("João","de Barro",2500.00);
        Funcionario func2 = new Funcionario("Maria","Josefina",3500.00);

        // Dados do primeiro funcionário
        System.out.println("Nome Completo: " + func1.getNome() + " " + func1.getSobrenome());
        System.out.printf("Salário Mensal: R$ %.2f%n", func1.getSalarioMensal());
        System.out.printf("Salario Anual: R$ %.2f%n", func1.getSalarioAnual(func1.getSalarioMensal()));
        System.out.println("------------------------------------");
        System.out.printf("Salario Mensal reajustado de 10%%: R$ %.2f%n", (func1.AlteracaoSalarial(1.1)));
        System.out.printf("Salario Anual reajustado de 10%%: R$ %.2f%n", (func1.AlteracaoSalarial(1.1) * 12));
        System.out.println("------------------------------------");
        System.out.println("Nome Completo: " + func2.getNome() + " " + func2.getSobrenome());
        System.out.printf("Salário Mensal: R$ %.2f%n", func2.getSalarioMensal());
        System.out.printf("Salário Anual: R$ %.2f%n", func2.getSalarioAnual(func2.getSalarioMensal()));

        System.out.println("------------------------------------");
        System.out.printf("Salario Mensal reajustado de 10%%: R$ %.2f%n", (func2.AlteracaoSalarial(1.1)));
        System.out.printf("Salario Anual reajustado de 10%%: R$ %.2f%n", (func2.AlteracaoSalarial(1.1) * 12));

    }
}
