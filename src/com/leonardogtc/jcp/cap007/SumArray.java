package com.leonardogtc.jcp.cap007;

public class SumArray {
    static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // Adiciona o valor de cada elemento ao total
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
