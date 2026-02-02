package com.leonardogtc.jcp.cap006;

public class MethodOverload {
    // Teste de médotos Square sobrecarregados.
    static void main(String[] args) {
        System.out.printf("O quadrado do inteiro 7 é: %d%n", square(7));
        System.out.printf("O quadrado do fractional 7.5 é: %.2f%n", square(7.5));
    }

    public static int square(int intValue){
        System.out.printf("%nFoi chamado o método square(int) para o valor %d%n", intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.printf("%nFoi chamado o método square(double) para o valor %.1f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
