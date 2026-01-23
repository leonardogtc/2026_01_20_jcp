package com.leonardogtc.jcp.cap004;

import javax.swing.*;

public class DrawPanelTeste {
    static void main(String[] args) {
        // Cria um painel que contém o nosso desenho
        DrawPanel panel = new DrawPanel();

        // Cria um frame que contém o painel
        JFrame application = new JFrame();

        // Configura o frame
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
