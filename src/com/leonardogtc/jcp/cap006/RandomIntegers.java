package com.leonardogtc.jcp.cap006;

import java.security.SecureRandom;

public class RandomIntegers {
    static void main(String[] args) {
        // O objeto produzirá números aleatórios seguros (números aleatórios não determinísticos)
        SecureRandom random = new SecureRandom();

        for (int i = 1; i <= 20; i++) {
            // Face do dado lançado
            int face = 1 + random.nextInt(6);
            System.out.printf("%d ", face);
            if (i % 5 == 0) {
                System.out.println();
            }

        }
    }
}
