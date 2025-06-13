package com.lab9;

public class Quiosque implements AssentoListener {
    @Override
    public void atualizarAssento(AssentoEvent evento) {
        Assento assento = evento.getAssento();
        System.out.println("Quiosque: Assento " + assento.getNumero() + " agora está " + assento.getStatus());
    }
}
