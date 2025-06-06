package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Ovo;

public class OvoCapoeira implements Ovo {
    @Override
    public String tipo() {
        return "Ovo de Capoeira";
    }
}
