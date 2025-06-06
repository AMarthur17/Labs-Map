package Sanduiches.ClassesAbstrataseConcretas;

import Ingredientes.Interfaces.Ovo;
import Ingredientes.Interfaces.Pao;
import Ingredientes.Interfaces.Presunto;
import Ingredientes.Interfaces.Queijo;
import Ingredientes.Interfaces.Tomate;

public abstract class Sanduiche {
    public abstract Pao criarPao();
    public abstract Queijo criarQueijo();
    public abstract Presunto criarPresunto();
    public abstract Ovo criarOvo();
    public abstract Tomate criarTomate();

    public String montarSanduiche() {
        Pao pao = criarPao();
        Queijo queijo = criarQueijo();
        Presunto presunto = criarPresunto();
        Ovo ovo = criarOvo();
        Tomate tomate = criarTomate();

        return "Sanduíche com " + pao.tipo() + ", " + queijo.tipo() + ", " 
                + presunto.tipo() + ", " + ovo.tipo() + " e " + tomate.tipo();
    }
}

