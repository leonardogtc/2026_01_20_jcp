package com.leonardogtc.jcp.cap003;
import java.time.LocalDate;
public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public FrequenciaCardiaca(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int calculaIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.anoNascimento;
    }

    public int frequenciaCardiacaMaxima(int idade) {
        return 220 - idade;
    }

    public double frequenciaCardiacaAlvo(int idade) {
        return frequenciaCardiacaMaxima(idade) * 0.65;
    }
}
