package com.leonardogtc.jcp.cap006;

import javax.swing.*;

public class DrawSmiley extends JPanel {
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        // desenha o rosto
        g.setColor(java.awt.Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // desenha os olhos
        g.setColor(java.awt.Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // desenha a boca
        g.fillOval(50, 110, 120, 60);

        // "retoca" a boca para criar um sorriso
        g.setColor(java.awt.Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }

}
