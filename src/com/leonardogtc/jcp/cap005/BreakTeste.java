package com.leonardogtc.jcp.cap005;

public class BreakTeste {
    static void main(String[] args) {
        int count;

        for(count = 1; count <= 10; count++) {
            if(count == 5) {
                break;

            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nQuebrou o loop for na contagem = %d%n ", count);
    }
}
