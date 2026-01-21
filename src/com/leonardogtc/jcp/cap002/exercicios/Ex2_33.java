package com.leonardogtc.jcp.cap002.exercicios;

public class Ex2_33 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        System.out.println("\nValores de IMC:");
        System.out.println("Abaixo do peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 e 24.9");
        System.out.println("Sobrepeso: entre 25 e 29.9");
        System.out.println("Obeso: 30 ou mais");

        input.close();
    }

}
