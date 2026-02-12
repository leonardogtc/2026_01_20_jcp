package com.leonardogtc.jcp.cap008.exemplosExtras;

public class ExemploThrow {

    public static void verificarIdade(int idade) {
        if (idade < 18) {
            // Lança uma exceção se a idade for menor que 18
            throw new IllegalArgumentException("A idade deve ser 18 ou mais.");
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }

    public static void main(String[] args) {
        try {
            verificarIdade(15); // Isso vai lançar uma exceção
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            verificarIdade(20); // Isso não vai lançar uma exceção
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
