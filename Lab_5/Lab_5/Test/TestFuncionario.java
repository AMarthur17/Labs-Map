package Test;

import dominio.Funcionario;
import dominio.Funcao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFuncionario {

    private Funcionario funcionario;
    private Funcao funcao;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Nolan", "111.222.333-44");
        funcao = () -> "Diretor";
    }

    @Test
    void testAdicionarFilme() {
        funcionario.adicionarFilme(funcao, "F001");

        assertEquals(1, funcionario.getFilmografia().size());
        assertTrue(funcionario.getFilmografia().containsKey("F001"));
        assertEquals("Diretor", funcionario.getFilmografia().get("F001").get(0).getDescricao());
    }

    @Test
    void testToStringFilmografia() {
        funcionario.adicionarFilme(funcao, "F002");
        String texto = funcionario.toStringFilmografia();
        assertTrue(texto.contains("F002"));
        assertTrue(texto.contains("Diretor"));
    }

    @Test
    void testToStringGeral() {
        String texto = funcionario.toString();
        assertTrue(texto.contains("Nolan"));
        assertTrue(texto.contains("111.222.333-44"));
    }

    @Test
    void testEqualsEHashCode() {
        Funcionario outro = new Funcionario("Outro Nome", "111.222.333-44");
        assertEquals(funcionario, outro);
        assertEquals(funcionario.hashCode(), outro.hashCode());
    }
}
