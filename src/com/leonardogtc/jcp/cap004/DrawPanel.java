package com.leonardogtc.jcp.cap004;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width - 1, height - 1);
        g.drawLine(0, height - 1, width - 1, 0);
    }
}
