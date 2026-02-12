package com.leonardogtc.jcp.cap008;

public class TIme1Test {
    static void main(String[] args) {
        // Cria e inicializa um objeto Time1
        Time1 time1 = new Time1();

        // gera saída de representações de string da data/hora
        displayTime("After time object is created", time1);
        System.out.println();

        // altera a data/hora e gera saída da data/hora atualizada
        time1.setTime(13,27,6);
        displayTime("After time object is created", time1);
        System.out.println();

        // tenta definir data/hora com valores inválidos
        try {
            time1.setTime(25,67,72);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        // exibe a data/hora após uma tentativa de definir valores inválidos
        displayTime("After calling setTime with invalid values", time1);
    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
