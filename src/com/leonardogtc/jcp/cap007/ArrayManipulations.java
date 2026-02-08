package com.leonardogtc.jcp.cap007;

import java.util.Arrays;

public class ArrayManipulations {
    static void main(String[] args) {
        // Classificar double array em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for (double value : doubleArray)
            System.out.printf("%.1f ", value);

        // Preenche um array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArra(filledIntArray, "FillerIntArray");

        // copia array intArray em array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArra(intArray, "intArray");
        displayArra(intArrayCopy, "intArrayCopy");

        // verifica a igualdade de intArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",
                (b ? "==" : "!="));

        // pesquisa o valor 5 em intArray
        int i = Arrays.binarySearch(intArray, 5);

        if (i >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", i);
        } else {
            System.out.println("5 not found in intArray");
        }

        // pesquisa o valor 8763 em intArray
        i = Arrays.binarySearch(intArray, 8763);
        if (i >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", i);
        } else {
            System.out.println("8763 not found in intArray");
        }


    }

    // Gera saída de valores em cada array
    public static void displayArra(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array)
            System.out.printf("%d ", value);
    }
}
