package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Queijo;

public class QueijoCheddar implements Queijo {
    @Override
    public String tipo() {
        return "Queijo Cheddar";
    }
}

