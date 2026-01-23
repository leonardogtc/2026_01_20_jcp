package com.leonardogtc.jcp.cap004;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Jane Green", 93.3);
        Estudante estudante2 = new Estudante("John Blue", 72.75);

        System.out.printf("A letra da nota de %s é %s%n", estudante1.getNome(), estudante1.getLetraNota());
        System.out.printf("A letra da nota de %s é %s%n", estudante2.getNome(), estudante2.getLetraNota());
    }
}
