package com.leonardogtc.jcp.cap005;

public class AutoPolicyTeste {
    static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        // Exibe se cada apólice está em um estado "sem culpa"
        displayPolicy(policy1);
        displayPolicy(policy2);

    }

    // Método estático que mostra se uma apólice está em um estado com seguro de automóvel sem culpa
    public static void displayPolicy(AutoPolicy autoPolicy) {
        System.out.println("Conta #: " + autoPolicy.getAccountNumber());
        System.out.println("Marca e Modelo: " + autoPolicy.getMakeAndModel());
        System.out.println("Estado: " + autoPolicy.getState());
        String resp = (autoPolicy.isNoFaultState() ? "está" : "não está");
        System.out.printf("O carro segurado pela apólice %s em um estado \"sem culpa\"%n%n", resp);
    }
}
