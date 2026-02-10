package com.leonardogtc.jcp.cap007.exercicios;

public class E07_13 {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
            }
        }

        System.out.println("Array sales inicializado com zeros:");
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("sales[%d][%d] = %d  ", row, col, sales[row][col]);
            }
            System.out.println();
        }
    }


}
