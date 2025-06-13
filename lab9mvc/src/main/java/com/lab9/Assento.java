package com.lab9;

public class Assento {
    private int numero;
    private String status;

    public Assento(int numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}