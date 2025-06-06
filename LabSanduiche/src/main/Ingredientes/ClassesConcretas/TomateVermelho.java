package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Tomate;

public class TomateVermelho implements Tomate {
    @Override
    public String tipo() {
        return "Tomate";
    }
}
