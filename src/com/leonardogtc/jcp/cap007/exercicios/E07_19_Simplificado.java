package com.leonardogtc.jcp.cap007.exercicios;

import java.util.Scanner;

public class E07_19_Simplificado {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] assentos = new boolean[10]; // Todos iniciam como false
        int primeiraClasse = 0; // Índices 0-4
        int classeEconomica = 5; // Índices 5-9

        while (primeiraClasse < 5 || classeEconomica < 10) {
            System.out.println("\n--- Sistema de Reservas ---");
            System.out.println("1 - First Class (Primeira Classe)");
            System.out.println("2 - Economy (Classe Econômica)");
            System.out.print("Escolha uma opção: ");
            int escolha = input.nextInt();

            if (escolha == 1) {
                if (primeiraClasse < 5) {
                    atribuirAssento(assentos, primeiraClasse++, "Primeira Classe");
                } else {
                    System.out.println("Primeira Classe lotada. Aceita Classe Econômica? (1-Sim / 2-Não)");
                    int trocar = input.nextInt();
                    if (trocar == 1 && classeEconomica < 10) {
                        atribuirAssento(assentos, classeEconomica++, "Classe Econômica");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else if (escolha == 2) {
                if (classeEconomica < 10) {
                    atribuirAssento(assentos, classeEconomica++, "Classe Econômica");
                } else {
                    System.out.println("Classe Econômica lotada. Aceita Primeira Classe? (1-Sim / 2-Não)");
                    int trocar = input.nextInt();
                    if (trocar == 1 && primeiraClasse < 5) {
                        atribuirAssento(assentos, primeiraClasse++, "Primeira Classe");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            }

            if (primeiraClasse == 5 && classeEconomica == 10) {
                System.out.println("\nVoo lotado! Sistema encerrado.");
                break;
            }
        }

        input.close();
    }

    // Método auxiliar para imprimir o cartão de embarque e marcar o assento
    public static void atribuirAssento(boolean[] mapa, int indice, String classe) {
        mapa[indice] = true;
        System.out.println("\n==============================");
        System.out.println("      CARTÃO DE EMBARQUE      ");
        System.out.println("Assento: " + (indice + 1));
        System.out.println("Classe: " + classe);
        System.out.println("==============================");
    }
}
