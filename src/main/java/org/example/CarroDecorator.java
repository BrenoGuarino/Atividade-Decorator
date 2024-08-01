package org.example;

public abstract class CarroDecorator implements Carro {

    private Carro carro;
    public String estrutura;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.carro.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.carro.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}