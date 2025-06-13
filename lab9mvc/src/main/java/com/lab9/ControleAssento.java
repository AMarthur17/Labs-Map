package com.lab9;

public class ControleAssento {
    private Onibus onibus;

    public ControleAssento(Onibus onibus) {
        this.onibus = onibus;
    }

    public void reservarAssento(int numero) {
        onibus.reservarAssento(numero);
    }

    public void comprarAssento(int numero) {
        onibus.comprarAssento(numero);
    }
}