package com.leonardogtc.jcp.cap007;

import java.security.SecureRandom;

public class RollDie {
    static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        // Lançar os dados 6.000.000 de vezes
        for(int roll = 1; roll <= 6_000_000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        System.out.printf("%s%12s%n", "Face", "Frequência");


        for(int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%,12d%n", face, frequency[face]);
        }
    }
}
