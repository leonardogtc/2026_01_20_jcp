package com.leonardogtc.jcp.cap003;

import javax.swing.*;

public class NameDialog {
    static void main(String[] args) {
        // Pede o nome do usuário
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        // Cria a mensagem
        String mensagem = String.format("Bem-vindo, %s, ao Java como Programar!", nome);

        // Exibe a mensagem
        JOptionPane.showMessageDialog(null, mensagem, "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
    }
}
