package com.leonardogtc.jcp.cap007;

public class ArrayListCollection {
    public static void main(String[] args) {
        // cria um novo ArrayList de Strings com uma capacidade inicial de 10
        java.util.ArrayList<String> items = new java.util.ArrayList<String>();

        items.add("red"); // anexa um item à lista
        items.add(0, "yellow"); // insere "yellow" no índice 0

        // cabeçalho
        System.out.print("Display list contents with counter-controlled loop:");

        // exibe as cores na lista
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }

        // exibe as cores utilizando for aprimorado no método display
        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green"); // adiciona "green" ao fim da lista
        items.add("yellow"); // adiciona "yellow" ao fim da lista
        display(items, "List with two new elements:");

        items.remove("yellow"); // remove o primeiro "yellow"
        display(items, "Remove first instance of yellow:");

        items.remove(1); // remove o item no índice 1
        display(items, "Remove second list element (green):");

        // verifica se um valor está na lista
        System.out.printf("\"red\" is %sin the list%n",
                items.contains("red") ? "" : "not ");

        // exibe o número de elementos na lista
        System.out.printf("Size: %s%n", items.size());
    }

    // exibe os elementos do ArrayList no console
    public static void display(java.util.ArrayList<String> items, String header) {
        System.out.printf(header); // exibe o cabeçalho

        // exibe cada elemento em items
        for (String item : items) {
            System.out.printf(" %s", item);
        }

        System.out.println();
    }

}
