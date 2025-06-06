package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Queijo;

public class QueijoPrato implements Queijo {
    @Override
    public String tipo() {
        return "Queijo Prato";
    }
}

