package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Pao;

public class PaoFrances implements Pao {
    @Override
    public String tipo() {
        return "Pão Francês";
    }
}

