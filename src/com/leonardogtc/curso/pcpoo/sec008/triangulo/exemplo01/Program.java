package com.leonardogtc.curso.pcpoo.sec008.triangulo.exemplo01;

import java.util.Locale;
import java.util.Scanner;

/*
Calcular a área do triângulo sem POO
 */
public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.printf("Digite as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.printf("Digite as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo X = %.4f%n", areaX);
        System.out.printf("Área do triângulo Y = %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Área do triângulo X é maior!");
        } else {
            System.out.println("Área do triângulo Y é maior!");
        }

        sc.close();
    }

}
