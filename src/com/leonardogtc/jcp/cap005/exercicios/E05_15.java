package com.leonardogtc.jcp.cap005.exercicios;

public class E05_15 {
    public static void main(String[] args) {
        // Pattern A
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern B
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern C
        for (int i = 10; i >= 1; i--) {
            for (int space = 10; space > i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern D
        for (int i = 1; i <= 10; i++) {
            for (int space = 10; space > i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
