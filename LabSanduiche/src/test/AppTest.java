import Sanduiches.ClassesAbstrataseConcretas.SanduicheBolaFrango;
import Sanduiches.ClassesAbstrataseConcretas.SanduicheFrancesPeru;
import Sanduiches.ClassesAbstrataseConcretas.SanduicheIntegralFrango;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testSanduicheBolaFrango() {
        SanduicheBolaFrango sanduiche = new SanduicheBolaFrango();
        String esperado = "Sanduíche com Pão Bola, Queijo Mussarela, Presunto de Frango, Ovo de Granja e Tomate";
        assertEquals(esperado, sanduiche.montarSanduiche());
    }

    @Test
    void testSanduicheFrancesPeru() {
        SanduicheFrancesPeru sanduiche = new SanduicheFrancesPeru();
        String esperado = "Sanduíche com Pão Francês, Queijo Cheddar, Presunto de Peru, Ovo de Capoeira e Tomate";
        assertEquals(esperado, sanduiche.montarSanduiche());
    }

    @Test
    void testSanduicheIntegralFrango() {
        SanduicheIntegralFrango sanduiche = new SanduicheIntegralFrango();
        String esperado = "Sanduíche com Pão Integral, Queijo Prato, Presunto de Frango, Ovo de Granja e Tomate";
        assertEquals(esperado, sanduiche.montarSanduiche());
    }
}
