package com.leonardogtc.jcp.cap007.exercicios;

import java.util.Scanner;

/*

Enunciado:

(Sistema de reservas de passagens aéreas) Uma pequena companhia aérea acabou de comprar um computador para seu novo
sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para
atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).

Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for First Class e Please type 2 for Economy. [Por
favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]. Se o usuário digitar 1, seu aplicativo deve
atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, seu aplicativo deve atribuir um assento
na classe econômica (poltronas 6 a 10). Seu aplicativo deve exibir um cartão de embarque indicando o número da poltrona
da pessoa e se ela está na primeira classe ou na classe econômica.

Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. Inicialize
todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. À medida que cada assento
é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível.

Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. Quando a classe econômica estiver lotada, seu
aplicativo deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição
apropriada de assento. Se não, exiba a mensagem "Next flight leaves in 3 hours" [O próximo voo parte em 3 horas].

 */
public class E07_19 {

    private static final int TOTAL_ASSENTOS = 10;
    private static final int PRIMEIRA_CLASSE_INICIO = 1;
    private static final int PRIMEIRA_CLASSE_FIM = 5;
    private static final int ECONOMICA_INICIO = 6;
    private static final int ECONOMICA_FIM = 10;

    private boolean[] assentos;
    private Scanner scanner;

    public E07_19() {
        assentos = new boolean[TOTAL_ASSENTOS];
        scanner = new Scanner(System.in);
    }

    public void executar() {
        System.out.println("=== SISTEMA DE RESERVAS DE PASSAGENS AÉREAS ===");

        while (true) {
            exibirMenu();
            int opcao = obterOpcao();

            if (opcao == 1) {
                processarPrimeiraClasse();
            } else if (opcao == 2) {
                processarClasseEconomica();
            } else {
                System.out.println("Opção inválida! Tente novamente.\n");
                continue;
            }

            if (todosAssentosOcupados()) {
                System.out.println("\nTodos os assentos estão ocupados.");
                System.out.println("O próximo voo parte em 3 horas.");
                break;
            }

            System.out.println();
        }

        scanner.close();

    }

    private boolean todosAssentosOcupados() {
        for (boolean ocupado : assentos) {
            if (!ocupado) {
                return false;
            }
        }
        return true;
    }

    private void processarClasseEconomica() {
        if (haAssentosDisponiveis(ECONOMICA_INICIO, ECONOMICA_FIM)) {
            int assento = encontrarAssentoDisponivel(ECONOMICA_INICIO, ECONOMICA_FIM);
            reservarAssento(assento, "Classe Econômica");
        } else {
            System.out.println("\nDesculpe, a Classe Econômica está lotada.");
            oferecerAlternativa(PRIMEIRA_CLASSE_INICIO, PRIMEIRA_CLASSE_FIM, "Primeira Classe");
        }
    }

    private void processarPrimeiraClasse() {
        if (haAssentosDisponiveis(PRIMEIRA_CLASSE_INICIO, PRIMEIRA_CLASSE_FIM)) {
            int assento = encontrarAssentoDisponivel(PRIMEIRA_CLASSE_INICIO, PRIMEIRA_CLASSE_FIM);
            reservarAssento(assento, "Primeira Classe");
        } else {
            System.out.println("\nDesculpe, a Primeira Classe está lotada.");
            oferecerAlternativa(ECONOMICA_INICIO, ECONOMICA_FIM, "Classe Econômica");
        }
    }

    private boolean haAssentosDisponiveis(int inicio, int fim) {
        for (int i = inicio - 1; i < fim; i++) {
            if (!assentos[i]) {
                return true;
            }
        }
        return false;
    }

    private void oferecerAlternativa(int inicioAlternativa, int fimAlternativa, String classeAlternativa) {
        if (haAssentosDisponiveis(inicioAlternativa, fimAlternativa)) {
            System.out.println("Gostaria de um assento na " + classeAlternativa + "?");
            System.out.print("Digite 'S' para Sim ou 'N' para Não: ");

            String resposta = scanner.next().toUpperCase();

            if (resposta.equals("S")) {
                int assento = encontrarAssentoDisponivel(inicioAlternativa, fimAlternativa);
                reservarAssento(assento, classeAlternativa);
            } else {
                System.out.println("\nO próximo voo parte em 3 horas.");
            }
        } else {
            System.out.println("\nA " + classeAlternativa + " também está lotada.");
            System.out.println("O próximo voo parte em 3 horas.");
        }
    }

    private int encontrarAssentoDisponivel(int inicio, int fim) {
        for (int i = inicio - 1; i < fim; i++) {
            if (!assentos[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    private void reservarAssento(int numeroAssento, String classe) {
        assentos[numeroAssento - 1] = true;
        exibirCartaoEmbarque(numeroAssento, classe);
    }

    private void exibirCartaoEmbarque(int numeroAssento, String classe) {
        System.out.println("\n=== CARTÃO DE EMBARQUE ===");
        System.out.println("Número do assento: " + numeroAssento);
        System.out.println("Classe: " + classe);
        System.out.println("==========================\n");
    }


    private int obterOpcao() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite 1 ou 2.");
            scanner.next();
            System.out.print("Escolha: ");
        }
        return scanner.nextInt();
    }

    private void exibirMenu() {
        System.out.println("Por favor digite 1 para Primeira Classe");
        System.out.println("Por favor digite 2 para Classe Econômica");
        System.out.print("Escolha: ");
    }

    // Método auxiliar para exibir o status dos assentos (opcional)
    private void exibirStatusAssentos() {
        System.out.println("\nStatus dos assentos:");
        for (int i = 0; i < assentos.length; i++) {
            String status = assentos[i] ? "Ocupado" : "Livre";
            String classe = (i < 5) ? "Primeira Classe" : "Classe Econômica";
            System.out.printf("Assento %d (%s): %s%n", i + 1, classe, status);
        }
        System.out.println();
    }

    static void main(String[] args) {
        E07_19 sistemaReservas = new E07_19();
        sistemaReservas.executar();
    }
}
