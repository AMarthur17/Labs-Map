package com.lab9;

public class PainelCentral implements AssentoListener {
    @Override
    public void atualizarAssento(AssentoEvent evento) {
        Assento assento = evento.getAssento();
        String cor = obterCor(assento.getStatus());
        System.out.println("PainelCentral: Assento " + assento.getNumero() + " agora está " + cor);
    }

    private String obterCor(String status) {
        switch (status) {
            case "disponível":
                return "verde";
            case "reservado":
                return "amarelo";
            case "indisponível":
                return "vermelho";
            default:
                return "sem cor definida";
        }
    }
}
