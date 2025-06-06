package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Ovo;

public class OvoGranja implements Ovo {
    @Override
    public String tipo() {
        return "Ovo de Granja";
    }
}

