package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Pao;

public class PaoBola implements Pao {
    @Override
    public String tipo() {
        return "Pão Bola";
    }
}

