package com.leonardogtc.jcp.cap004;

public class Analise {
    public static void main(String[] args) {
        // cria Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);

        // fase de inicialização
        int aprovado = 0;
        int reprovado = 0;
        int contadorAlunos = 1;

        while(contadorAlunos <= 10) {
            System.out.print("Digite o resultado (1 = Aprovado, 2 = Reprovado): ");
            int resultado = input.nextInt();

            if(resultado == 1) {
                aprovado += 1;
            } else {
                reprovado += 1;
            }

            contadorAlunos += 1;

        }

        // Fase de término
        System.out.printf("O número de alunos aprovados é: %d%n" +
                "O número de alunos reprovados é: %d%n", aprovado, reprovado);

        // Bonus do instrutor
        if(aprovado >= 8) {
            System.out.println("O instrutor ganha BONUS!");
        }

        input.close();
    }
}
