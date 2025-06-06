package Sanduiches.ClassesAbstrataseConcretas;


import Ingredientes.ClassesConcretas.OvoCapoeira;
import Ingredientes.ClassesConcretas.PaoFrances;
import Ingredientes.ClassesConcretas.PresuntoPeru;
import Ingredientes.ClassesConcretas.QueijoCheddar;
import Ingredientes.ClassesConcretas.TomateVermelho;
import Ingredientes.Interfaces.Ovo;
import Ingredientes.Interfaces.Pao;
import Ingredientes.Interfaces.Presunto;
import Ingredientes.Interfaces.Queijo;
import Ingredientes.Interfaces.Tomate;



public class SanduicheFrancesPeru extends Sanduiche {
    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public Ovo criarOvo() {
        return new OvoCapoeira();
    }

    @Override
    public Tomate criarTomate() {
        return new TomateVermelho();
    }
}
