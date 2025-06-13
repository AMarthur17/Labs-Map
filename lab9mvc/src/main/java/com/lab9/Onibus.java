package com.lab9;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private List<Assento> assentos;
    private List<AssentoListener> listeners;

    public Onibus(int quantidadeAssentos) {
        this.assentos = new ArrayList<>();
        this.listeners = new ArrayList<>();
        for (int i = 1; i <= quantidadeAssentos; i++) {
            assentos.add(new Assento(i, "disponível"));
        }
    }

    public Assento getAssento(int numero) {
        return assentos.get(numero - 1); // O número do assento começa em 1
    }

    public void reservarAssento(int numero) {
        Assento assento = assentos.get(numero - 1);
        assento.setStatus("reservado");
        notificarListeners(new AssentoEvent(assento));
    }

    public void comprarAssento(int numero) {
        Assento assento = assentos.get(numero - 1);
        assento.setStatus("indisponível");
        notificarListeners(new AssentoEvent(assento));
    }

    public void adicionarListener(AssentoListener listener) {
        listeners.add(listener);
    }

    private void notificarListeners(AssentoEvent evento) {
        for (AssentoListener listener : listeners) {
            listener.atualizarAssento(evento);
        }
    }
}