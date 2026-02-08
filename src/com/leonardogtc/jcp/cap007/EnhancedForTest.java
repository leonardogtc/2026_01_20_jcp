package com.leonardogtc.jcp.cap007;

public class EnhancedForTest {
    static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // Adiciona o valor de cada elemento a variável total
        for (int number : array) {
            total += number;
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
