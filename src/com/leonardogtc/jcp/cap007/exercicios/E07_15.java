package com.leonardogtc.jcp.cap007.exercicios;

public class E07_15 {
    public static void main(String[] args) {
        int tamanhoArray;

        // Verifica se um argumento foi passado via linha de comando
        if (args.length > 0) {
            try {
                tamanhoArray = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Argumento inválido. Utilizando tamanho padrão 10.");
                tamanhoArray = 10;
            }
        } else {
            tamanhoArray = 10;
        }

        int[] array = new int[tamanhoArray];

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

}
