package com.leonardogtc.jcp.cap008;

public class ThisTest {
    static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

// classe SimpleTime demonstra a referência "this"
class SimpleTime {
    private int hora;
    private int minuto;
    private int segundo;

    /*
    Se o construtor utilizar nomes de parâmetros idênticos a
    nomes de variáveis de instância a referência "this" será
    exigida para distinguir entre os nomes.
     */
    public SimpleTime(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /*
    Utilizam "this" explicito e implícito para chamar toUniversalString
     */
    public String buildString() {
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }

    /*
    Converter em String no formato de data/hora universal (HH:MM:SS)
     */
    public String toUniversalString() {
        /*
        "this" não é requerido aqui para acessar variáveis de instância,
        porque o método não tem variáveis locais com os mesmos nomes
        das variáveis de instância.
         */
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
