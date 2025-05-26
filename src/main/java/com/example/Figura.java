package com.example;

/**
 * Interface que representa uma figura geométrica.
 */
public interface Figura {
    /**
     * Aceita um visitante para realizar uma operação na figura.
     * @param visitante objeto visitante
     * @return resultado da operação em String
     */
    String aceitar(Visitante visitante);
}
