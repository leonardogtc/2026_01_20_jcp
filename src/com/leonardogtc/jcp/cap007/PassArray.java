package com.leonardogtc.jcp.cap007;

public class PassArray {
    static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.printf(
                "Efeitos de passar uma referência para um array inteiro:%n" +
                        "Os valores da matriz original são:%n");

        // Gera a saída de elementos do array original
        for (int value : array) {
            System.out.printf("%d ", value);
        }

        modifyArray(array); // Passa a referência do array

        System.out.printf("%nOs valores da matriz modificados são:%n");

        // Gera a saída de elementos do array modificado
        for (int value : array) {
            System.out.printf("%d ", value);
        }

        System.out.printf(
                "%n%nEfeitos da passagem do valor do elemento da matriz:%n" +
                        "array[3] antes de modifyElement: %d%n", array[3]);

        modifyElement(array[3]);    // Tenta modificar o array[3]

        System.out.printf("%narray[3] depois de modifyElement: %d%n", array[3]);

    }

    // Multiplica cada elemento do array por 2
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    // Multiplica o argumento por 2
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Valor do elemento em modifyElement: %d ", element);
    }
}
