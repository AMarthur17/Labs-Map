package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Pao;

public class PaoIntegral implements Pao {
    @Override
    public String tipo() {
        return "Pão Integral";
    }
}
