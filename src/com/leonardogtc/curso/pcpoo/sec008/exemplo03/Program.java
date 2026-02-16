package com.leonardogtc.curso.pcpoo.sec008.exemplo03;

import com.leonardogtc.curso.pcpoo.sec008.exemplo03.entities.Triangulo;

public class Program {
    public static void main(String[] args) {
        Triangulo x = new Triangulo(3, 4, 5);
        Triangulo y = new Triangulo(7.5,4.5,4.02);

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.printf("Área do triângulo X = %.4f%n", areaX);
        System.out.printf("Área do triângulo Y = %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Área do triângulo X é maior!");
        } else {
            System.out.println("Área do triângulo Y é maior!");
        }
    }
}
