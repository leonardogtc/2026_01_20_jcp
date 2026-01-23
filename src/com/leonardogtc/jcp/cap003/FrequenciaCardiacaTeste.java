package com.leonardogtc.jcp.cap003;



public class FrequenciaCardiacaTeste {
    static void main(String[] args) {
        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca("Leonardo","Tavares",25,5,1971);
        int idade = frequenciaCardiaca.calculaIdade();
        System.out.println(idade);
    }
}
