package org.example;



public class AparelhoDeSom extends CarroDecorator {

    public AparelhoDeSom(Carro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Aparelho De Som";
    }
}
