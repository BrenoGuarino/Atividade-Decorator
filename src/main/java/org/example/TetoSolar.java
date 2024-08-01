package org.example;

public class TetoSolar extends CarroDecorator {

    public TetoSolar(Carro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Teto Solar";
    }
}