package com.leonardogtc.jcp.cap004;

public class Estudante {
    private String nome;
    private double media;

    public Estudante(String nome, double media) {
        this.nome = nome;
        this.media = media;

        if (media > 0.0 && media < 100.0)
            this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media > 0.0 && media < 100.0)
            this.media = media;
    }

    // Letra da note
    public String getLetraNota() {
        String letraNota = "";

        if (media >= 90.0) {
            letraNota = "A";
        } else if (media >= 80.0) {
            letraNota = "B";
        } else if (media >= 70.0) {
            letraNota = "C";
        } else if (media >= 60.0) {
            letraNota = "D";
        } else {
            letraNota = "F";
        }
        return letraNota;
    }
}
