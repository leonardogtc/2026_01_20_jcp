package com.leonardogtc.jcp.cap003;

import java.util.Scanner;

public class DateTeste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite o mês: ");
        int mes = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();

        Date data = new Date(dia, mes, ano);
        data.displayDate();

        input.close();
    }
}
