package com.leonardogtc.jcp.cap004.exercicios;

public class E4_17 {
    static void main(String[] args) {
        // Instancia a classe Scanner em um objeto input
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Declara e inicializa as variáveis
        int kmRodados = 0;
        int litrosCombustivel = 0;
        int numeroViagem = 1;
        int totalQuilometrosRodados = 0;
        int totalLitrosCombustivel = 0;

        // Entra com a primeira viagem
        System.out.print("Digite o valor em Quilometros ou -1 para sair do programa: ");
        kmRodados = input.nextInt();

        if(kmRodados != -1) {
            System.out.print("Digite o valor em litros: ");
            litrosCombustivel = input.nextInt();

            totalQuilometrosRodados += kmRodados;
            totalLitrosCombustivel += litrosCombustivel;
        }

        while(kmRodados != -1) {

            System.out.print("Digite o valor em Quilometros ou -1 para sair do programa: ");
            kmRodados = input.nextInt();

            if(kmRodados != -1) {
                System.out.print("Digite o valor em litros: ");
                litrosCombustivel = input.nextInt();

                totalQuilometrosRodados += kmRodados;
                totalLitrosCombustivel += litrosCombustivel;

                numeroViagem++;
            }
        }

        if(litrosCombustivel == 0) {
            System.out.println("A viagem não foi realizada!");
        } else {
            System.out.printf("O total de quilometros rodados é: %d%n", totalQuilometrosRodados);
            System.out.printf("O total de litros de combustível é: %d%n", totalLitrosCombustivel);
            System.out.printf("A média de quilometros por litro é: %.2f litros/km%n", (double) totalQuilometrosRodados / totalLitrosCombustivel);
        }

        input.close();
    }
}
