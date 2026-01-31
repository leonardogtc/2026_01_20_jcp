package com.leonardogtc.jcp.cap006;

import java.security.SecureRandom;

public class RollDie {
    static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;
        int freq6 = 0;
        
        for (int roll = 1; roll <= 6000000; roll++) {
            int face = 1 + random.nextInt(6);

            switch (face) {
                case 1:
                    ++freq1;
                    break;
                case 2:
                    ++freq2;
                    break;
                case 3:
                    ++freq3;
                    break;
                case 4:
                    ++freq4;
                    break;
                case 5:
                    ++freq5;
                    break;
                case 6:
                    ++freq6;
                    break;
            }
        }

        System.out.println("Face\tFrequência");
        System.out.printf("1\t%,14d%n2\t%,14d%n3\t%,14d%n4\t%,14d%n5\t%,14d%n6\t%,14d%n",
                freq1, freq2, freq3, freq4, freq5, freq6);
    }
}
