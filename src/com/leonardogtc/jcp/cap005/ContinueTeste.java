package com.leonardogtc.jcp.cap005;

public class ContinueTeste {
    static void main(String[] args) {
        int count;

        for(count = 1; count <= 10; count++) {
            if(count == 5) {
                continue;

            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nUsou o continue para pular a contagem = 5%n ");
    }
}
