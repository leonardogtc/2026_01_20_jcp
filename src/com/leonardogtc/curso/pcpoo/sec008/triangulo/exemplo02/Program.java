package com.leonardogtc.curso.pcpoo.sec008.triangulo.exemplo02;

import com.leonardogtc.curso.pcpoo.sec008.triangulo.exemplo02.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

/*
Calcular a área do triângulo sem POO
 */
public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.printf("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
