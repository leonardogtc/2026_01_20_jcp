package com.leonardogtc.jcp.cap007.exercicios;

/*
Enunciado Java:
(Usando a instrução for aprimorada)
Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double passados pelos argumentos de
linha de comando.
Dica: utilize o método 'static parseDouble' da classe Double para converter uma String em um valor double.
 */
public class E07_16 {
    static void main(String[] args) {
        // Verificar se foram passados argumentos
        if (args.length == 0) {
            System.out.println("Nenhum argumento foi passado.");
            return;
        }

        double soma = 0.0;

        // Usar o for aprimorado para percorrer todos os argumentos
        for (String arg : args) {
            try {
                // Converter cada argumento String para double usando Double.parseDouble()
                double valor = Double.parseDouble(arg);
                soma += valor;
                System.out.printf("Argumentos: %s -> valor: %.2f%n", arg, valor);
            } catch (NumberFormatException e) {
                System.err.printf("Erro: '%s' não é um número válido. Será ignorado.%n", arg);
            }
        }

        // Exibir o resultado final
        System.out.printf("%nSoma dos valores: %.2f%n", soma);


    }
}
