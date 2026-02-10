package com.leonardogtc.jcp.cap007.exercicios;

import java.util.Scanner;

/*
Enunciado:
(Vendas totais) Utilize um array bidimensional para resolver o seguinte problema: uma empresa tem quatro equipes de
vendas (1 a 4) que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, cada vendedor passa uma nota de cada tipo
de produto diferente vendido. Cada nota contém o seguinte:

a) O número do vendedor
b) O número do produto
c) O valor total em reais desse produto vendido nesse dia

Portanto, cada vendedor passa entre 0 e 5 notas de vendas por dia. Suponha que as informações a partir de todas as notas
durante o último mês estejam disponíveis. Escreva um aplicativo que leia todas essas informações sobre as vendas do
último mês e resuma as vendas totais por vendedor e por produto. Todos os totais devem ser armazenados no array
bidimensional sales. Depois de processar todas as informações do último mês, exiba os resultados em formato tabular, com
cada coluna representando um vendedor particular e cada linha representando um produto particular. Some cada linha para
obter o total das vendas de cada produto no último mês. Some cada coluna para obter o total de vendas por vendedor no
último mês. Sua saída tabular deve incluir esses totais cruzados à direita das linhas totalizadas e na parte inferior
das colunas totalizadas.
 */
public class E07_20 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array bidimensional: 6 linhas (5 produtos + 1 para totais)
        // e 6 colunas (4 vendedores + 1 para totais + 1 para números dos produtos)
        double[][] sales = new double[6][6];

        // Inicializar array com zeros
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sales[i][j] = 0;
            }
        }

        // Ler dados de vendas
        System.out.println("=== SISTEMA DE CONTROLE DE VENDAS ===");
        System.out.println("Digite as informações das notas de vendas do último mês.");
        System.out.println("Para encerrar a entrada, digite -1 para o número do vendedor.\n");

        int vendedor, produto;
        double valor;

        while (true) {
            System.out.print("Número do vendedor (1-4, ou -1 para sair): ");
            vendedor = input.nextInt();

            if (vendedor == -1) {
                break;
            }

            // Validar número do vendedor
            if (vendedor < 1 || vendedor > 4) {
                System.out.println("Vendedor inválido! Digite um número entre 1 e 4.");
                continue;
            }

            System.out.print("Número do produto (1-5): ");
            produto = input.nextInt();

            // Validar número do produto
            if (produto < 1 || produto > 5) {
                System.out.println("Produto inválido! Digite um número entre 1 e 5.");
                continue;
            }

            System.out.print("Valor total da venda em reais: R$ ");
            valor = input.nextDouble();

            // Validar valor
            if (valor < 0) {
                System.out.println("Valor inválido! O valor deve ser positivo.");
                continue;
            }

            // Adicionar venda ao array (subtraindo 1 dos índices, pois arrays começam em 0)
            sales[produto - 1][vendedor - 1] += valor;

        }

        // Calcular totais por produto (soma das colunas)
        for (int produtoIndex = 0; produtoIndex < 5; produtoIndex++) {
            double totalProduto = 0.0;
            for (int vendedorIndex = 0; vendedorIndex < 4; vendedorIndex++) {
                totalProduto += sales[produtoIndex][vendedorIndex];
            }
            sales[produtoIndex][4] = totalProduto;  // Coluna 4 = total do produto
        }

        // Calcular totais por vendedor (soma das linhas)
        for (int vendedorIndex = 0; vendedorIndex < 4; vendedorIndex++) {
            double totalVendedor = 0.0;
            for (int produtoIndex = 0; produtoIndex < 5; produtoIndex++) {
                totalVendedor += sales[produtoIndex][vendedorIndex];
            }
            sales[5][vendedorIndex] = totalVendedor;  // Linha 5 = total do vendedor
        }

        // Calcular total geral
        double totalGeral = 0.0;
        for (int valorIndex = 0; valorIndex < 4; valorIndex++) {
            totalGeral += sales[5][valorIndex];
        }

        sales[5][4] = totalGeral; // Célula [5][4] = total geral

        // Exibir resultados em formato tabular
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("==========================================================================");

        System.out.printf("%-15s %-12s %-12s %-12s %-12s %-12s%n",
                "Produto/Vendedor", "Vendedor 1", "Vendedor 2",
                "Vendedor 3", "Vendedor 4", "Total Produto");
        System.out.println("==========================================================================");

        // Exibir dados dos produtos
        for (int produtoIndex = 0; produtoIndex < 5; produtoIndex++) {
            System.out.printf("Produto %-9d", produtoIndex + 1);
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.printf("R$ %9.2f ", sales[produtoIndex][coluna]);
            }
            System.out.println();
        }

        System.out.println("==========================================================================");

        // Exibir totais por vendedor
        System.out.printf("%-15s", "Total Vendedor");
        for (int vendedorIndex = 0; vendedorIndex < 5; vendedorIndex++) {
            System.out.printf("R$ %9.2f ", sales[5][vendedorIndex]);
        }

        System.out.println("\n==========================================================================");
        System.out.println("Legenda: Todos os valores em Reais (R$)");

        // Exibir algumas estatísticas adicionais
        System.out.println("\n=== ESTATÍSTICAS ADICIONAIS ===");

        // Produto mais vendido
        int produtoMaisVendido = 0;
        double maiorVendaProduto = sales[0][4];
        for (int produtoIndex = 1; produtoIndex < 5; produtoIndex++) {
            if (sales[produtoIndex][4] > maiorVendaProduto) {
                maiorVendaProduto = sales[produtoIndex][4];
                produtoMaisVendido = produtoIndex;
            }
        }
        System.out.printf("Produto mais vendido: Produto %d (R$ %.2f)%n",
                produtoMaisVendido + 1, maiorVendaProduto);

        // Vendedor com maior venda
        int vendedorTop = 0;
        double maiorVendaVendedor = sales[5][0];
        for (int vendedorIndex = 1; vendedorIndex < 4; vendedorIndex++) {
            if (sales[5][vendedorIndex] > maiorVendaVendedor) {
                maiorVendaVendedor = sales[5][vendedorIndex];
                vendedorTop = vendedorIndex;
            }
        }
        System.out.printf("Vendedor destaque: Vendedor %d (R$ %.2f)%n",
                vendedorTop + 1, maiorVendaVendedor);

        input.close();
    }
}
