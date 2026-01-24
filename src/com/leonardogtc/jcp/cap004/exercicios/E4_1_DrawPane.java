package com.leonardogtc.jcp.cap004.exercicios;

/**
 * a) Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior esquerdo,
 * estendendo-as até que cubram a metade superior esquerda do painel. Uma abordagem é dividir a largura e altura em um
 * número igual de passos (descobrimos que 15 passos funcionam bem). A primeira extremidade de uma linha sempre estará
 * no canto superior esquerdo (0, 0).
 * A segunda extremidade pode ser encontrada iniciando no canto inferior esquerdo e movendo-se para cima em um passo
 * vertical e para a direita em um passo horizontal. Desenhe uma linha entre as duas extremidades. Continue movendo-se
 * para cima e para o passo à direita a fim de encontrar cada extremidade sucessiva. A figura deve ser dimensionada de
 * maneira correspondente à medida que você redimensiona a janela.
 */

import javax.swing.JPanel;
import java.awt.Graphics;

public class E4_1_DrawPane extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int largura = getWidth();
        int altura = getHeight();
        int passos = 15;

        // Calculando o tamanho de cada salto
        int passoHorizontal = largura / passos;
        int passoVertical = altura / passos;

        int i = 0;
        while (i < passos) {
            /*
            A linha começa sempre em (0,0);
            A segunda extremidade começa em baixo (altura) e vai subindo,
            enquanto se desloca para a direita.
            */
            int xFim = i * passoHorizontal;
            int yFim = altura - (i * passoVertical);

            g.drawLine(0, 0, xFim, yFim);

            i++;

        }

    }
}
