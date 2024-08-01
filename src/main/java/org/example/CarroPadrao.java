package org.example;

public class CarroPadrao implements Carro {

    public float preco;

    public CarroPadrao() {
    }

    public CarroPadrao(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getEstrutura() {
        return "Carro Padrão";
    }

}