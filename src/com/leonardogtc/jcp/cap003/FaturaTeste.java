// Relativo ao exercício 3.12 - Java Como Programar 10ª Edição
package com.leonardogtc.jcp.cap003;

public class FaturaTeste {
    static void main(String[] args) {
        Fatura material = new Fatura("0001/2026","Livro Java Como Programar",10,436.87);
        System.out.println("Número: " + material.getNumero());
        System.out.println("Descrição: " + material.getDescricao());
        System.out.println("Quantidade: " + material.getQuantidade());
        System.out.printf("Preço por item: R$ %.2f%n", material.getPrecoItem());
        System.out.printf("Montante da fatura: R$ %.2f%n", material.getMontanteFatura());
    }
}
