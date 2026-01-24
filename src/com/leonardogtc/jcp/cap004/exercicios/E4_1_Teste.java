package com.leonardogtc.jcp.cap004.exercicios;

import javax.swing.*;

public class E4_1_Teste {
    static void main(String[] args) {
        E4_1_DrawPane panel = new E4_1_DrawPane();

        // Cria um novo quadro para armazenar o painel
        JFrame frame = new JFrame();

        // Configura o frame para ser encerrado quando ele é fechado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
