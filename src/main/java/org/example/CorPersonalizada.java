package org.example;

public class CorPersonalizada extends CarroDecorator {

    public CorPersonalizada(Carro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Cor Personalizada";
    }
}