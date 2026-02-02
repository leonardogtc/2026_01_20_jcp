package com.leonardogtc.jcp.cap006;

public class Scope {
    // Campo acessível para todos os métodos da classe
    private static int x = 1;

    static void main(String[] args) {
        int x = 5;  // Variável local "x" sombreia o campo "x"
        System.out.printf("O \"x\" local em main vale: %d%n", x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();


    }


    private static void useLocalVariable() {
        int x = 25; // Inicializa toda vez que useLocalVariable é chamada
        System.out.printf("O \"x\" local ao entrar no método useLocalVariable vale: %d%n", x);
        ++x;    // Modifica o valor de x
        System.out.printf("O \"x\" local depois de usar o método useLocalVariable vale: %d%n", x);
    }

    private static void useField() {
        System.out.printf("O \"x\" global ao entrar no método useField vale: %d%n", x);
        x *= 10;
        System.out.printf("O \"x\" global depois de usar o método useField vale: %d%n", x);

    }

}
