package com.leonardogtc.jcp.cap007;

public class BarChart {
    static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 5, 6, 3, 2, 4, 5, 3};
        System.out.println("Grade distribution:");

        for(int counter = 0; counter < array.length; counter++) {
            // Gera a saída do rótulo da barra
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            // Gera a saída da barra
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
