package com.leonardogtc.jcp.cap006;

import javax.swing.*;
import java.awt.*;

public class E06_01 extends JPanel {
    // Desejar um alvo com filloval()
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.GREEN);
        g.fillOval(30, 30, 160, 160);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 120, 120);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(70, 70, 80, 80);

        g.setColor(Color.BLACK);
        g.fillOval(90, 90, 40, 40);

    }
}
