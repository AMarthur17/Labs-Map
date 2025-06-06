package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Presunto;

public class PresuntoFrango implements Presunto {
    @Override
    public String tipo() {
        return "Presunto de Frango";
    }
}

