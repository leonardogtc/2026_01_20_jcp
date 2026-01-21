package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_28 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();

        System.out.printf("Diâmetro: %.2f%n", (2 * raio));
        System.out.printf("Circunferência: %.2f%n", (2 * Math.PI * raio));
        System.out.printf("Área: %.2f%n", (Math.PI * raio * raio));

        input.close();
    }

}
