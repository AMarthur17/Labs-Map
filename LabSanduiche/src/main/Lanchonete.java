import Sanduiches.ClassesAbstrataseConcretas.Sanduiche;
import Sanduiches.ClassesAbstrataseConcretas.SanduicheBolaFrango;
import Sanduiches.ClassesAbstrataseConcretas.SanduicheFrancesPeru;
import Sanduiches.ClassesAbstrataseConcretas.SanduicheIntegralFrango;

public class Lanchonete {
    public static void main(String[] args) {
        // Sanduíche 1
        Sanduiche sanduiche1 = new SanduicheIntegralFrango();
        System.out.println("\n");
        System.out.println(sanduiche1.montarSanduiche());

        // Sanduíche 2
        Sanduiche sanduiche2 = new SanduicheFrancesPeru();
        System.out.println(sanduiche2.montarSanduiche());

        // Sanduíche 3
        Sanduiche sanduiche3 = new SanduicheBolaFrango();
        System.out.println(sanduiche3.montarSanduiche());
    }
}

