package Ingredientes.ClassesConcretas;

import Ingredientes.Interfaces.Queijo;

public class QueijoMussarela implements Queijo {
    @Override
    public String tipo() {
        return "Queijo Mussarela";
    }
}
