package com.leonardogtc.jcp.cap007.exercicios;

/*
Enunciado:
(Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de inteiros que
são passados para método product utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias
chamadas, cada uma com um número diferente de argumentos.
*/

public class E07_14 {
    static void main(String[] args) {

        // Testando o método com diferentes números de argumentos
        System.out.println("=== Teste do método produto() ===");

        // Caso 1: Sem argumentos
        System.out.println("Produto de nenhum número: " + produto());

        // Caso 2: Um argumento
        System.out.println("Produto de um número: " + produto(5));

        // Caso 3: Dois argumentos
        System.out.println("Produto de dois números: " + produto(2, 3));

        // Caso 4: Vários argumentos
        System.out.println("Produto de 1, 2, 3, 4, 5: " + produto(1, 2, 3, 4, 5));

        // Caso 5: Com zero (produto zero)
        System.out.println("Produto de 2, 0, 5: " + produto(2, 0, 5));

        // Caso 6: Números negativos
        System.out.println("Produto de -2, 3, -4: " + produto(-2, 3, -4));

        // Caso 7: Muitos argumentos
        System.out.println("Produto de 1 a 6: " + produto(1, 2, 3, 4, 5, 6));

        System.out.println("\n=== Teste do método produtoAlternativo() ===");

        // Testando o método alternativo
        System.out.println("ProdutoAlternativo de nenhum número: " + produtoAlternativo());
        System.out.println("ProdutoAlternativo de 2, 3, 4: " + produtoAlternativo(2, 3, 4));

        System.out.println("\n=== Testes com array ===");

        // Também é possível passar um array para métodos varargs
        int[] arrayNumeros = {2, 3, 5, 7};
        System.out.println("Produto do array {2, 3, 5, 7}: " + produto(arrayNumeros));
    }

    // Método que calcula o produto usando varargs
    public static long produto(int... numeros) {

        // se nenhum número for passado, retorna 1
        if (numeros.length == 0) {
            return 1;
        }

        long resultado = 1;

        for (int numero : numeros) {
            resultado *= numero;
        }

        return resultado;
    }

    // Método alternativo ue retorna 1 quando nenhum argumento é passado
    // (outra convenção comum para produtos vazios
    public static long produtoAlternativo(int... numeros) {
        long produto = 1;   // Elemento neutro da multiplicação
        for (int num : numeros) {
            produto *= num;
        }
        return produto;
    }
}
