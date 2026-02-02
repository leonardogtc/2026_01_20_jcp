package com.leonardogtc.jcp.cap006;

public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        javax.swing.JFrame application = new javax.swing.JFrame();

        application.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }

}
