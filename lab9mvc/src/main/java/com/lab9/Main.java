package com.lab9;

public class Main {
    public static void main(String[] args) {
        // Criação do ônibus com 5 assentos
        Onibus onibus = new Onibus(5);

        // Criação dos ouvintes (Painel Central e Quiosque)
        PainelCentral painelCentral = new PainelCentral();
        Quiosque quiosque = new Quiosque();

        // Adicionando os ouvintes ao ônibus
        onibus.adicionarListener(painelCentral);
        onibus.adicionarListener(quiosque);

        // Criação do controlador de assento
        ControleAssento controle = new ControleAssento(onibus);

        // Assentos inicialmente disponíveis
        painelCentral.atualizarAssento(new AssentoEvent(onibus.getAssento(1)));
        painelCentral.atualizarAssento(new AssentoEvent(onibus.getAssento(2)));
        painelCentral.atualizarAssento(new AssentoEvent(onibus.getAssento(3)));
        painelCentral.atualizarAssento(new AssentoEvent(onibus.getAssento(4)));
        painelCentral.atualizarAssento(new AssentoEvent(onibus.getAssento(5)));

        // Reservando assento 1
        controle.reservarAssento(1);

        // Comprando assento 2
        controle.comprarAssento(2);

        // Reservando assento 3
        controle.reservarAssento(3);

        // Comprando assento 4
        controle.comprarAssento(4);

        // Reservando assento 5
        controle.reservarAssento(5);
    }
}
