package com.leonardogtc.jcp.cap006;

public class E06_01_Test {
    static void main(String[] args) {
        E06_01 panel = new E06_01();
        javax.swing.JFrame application = new javax.swing.JFrame();
        application.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}
