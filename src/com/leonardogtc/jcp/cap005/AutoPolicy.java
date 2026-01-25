package com.leonardogtc.jcp.cap005;

public class AutoPolicy {

    private int accountNumber;  // Numero da conta da apólice
    private String makeAndModel;    // Carro ao qual a apólice é aplicada
    private String state;   // Estado com duas letras

    // Construtor
    public AutoPolicy(int account, String makeAnd, String state) {
        this.accountNumber = account;
        this.makeAndModel = makeAnd;
        this.state = state;
    }

    // Define o accountNuber
    public void setAccountNumber(int account) {
        this.accountNumber = account;
    }

    // Retorna o accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Define o makeAndModel
    public void setMakeAndModel(String makeAnd) {
        this.makeAndModel = makeAnd;
    }

    // Retorna o makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    // Define o estado
    public void setState(String state) {
        this.state = state;
    }

    // Retorna o estado
    public String getState() {
        return state;
    }

    // Método predicado é retornado se o estado tem seguro "sem culpa"
    public boolean isNoFaultState() {
        boolean noFaultState;
        // Determina se o estado tem seguros de automóveis "sem culpa"
        switch (getState()) {
            case "MA": case "NJ": case "NY": case "PA": case "VA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }

}
