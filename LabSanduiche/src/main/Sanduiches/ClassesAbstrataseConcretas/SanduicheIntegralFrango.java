package Sanduiches.ClassesAbstrataseConcretas;


import Ingredientes.ClassesConcretas.OvoGranja;
import Ingredientes.ClassesConcretas.PaoIntegral;
import Ingredientes.ClassesConcretas.PresuntoFrango;
import Ingredientes.ClassesConcretas.QueijoPrato;
import Ingredientes.ClassesConcretas.TomateVermelho;
import Ingredientes.Interfaces.Ovo;
import Ingredientes.Interfaces.Pao;
import Ingredientes.Interfaces.Presunto;
import Ingredientes.Interfaces.Queijo;
import Ingredientes.Interfaces.Tomate;


public class SanduicheIntegralFrango extends Sanduiche {
    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Ovo criarOvo() {
        return new OvoGranja();
    }

    @Override
    public Tomate criarTomate() {
        return new TomateVermelho();
    }
}
