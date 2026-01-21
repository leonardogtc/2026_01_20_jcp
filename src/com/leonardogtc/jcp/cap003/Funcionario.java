// Relativo ao exercício 3.13 - Java Como Programar 10ª Edição
package com.leonardogtc.jcp.cap003;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0.0) {
            salarioMensal = 0.0;
        }
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual(double salarioMensal) {
        return salarioMensal * 12;
    }

    public double AlteracaoSalarial(double percentualAlteracao) {
        if (percentualAlteracao < 0.0) {
            percentualAlteracao = 0.0;
        }
        return this.salarioMensal * percentualAlteracao;
    }


}
