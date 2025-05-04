package Test;

import dominio.Filme;
import dominio.Funcionario;
import dominio.Funcao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestFilme {

    private Filme filme;
    private Funcionario funcionario;
    private Funcao diretorFuncao;
    private Funcao atorFuncao;

    @BeforeEach
    void setUp() {
        filme = new Filme("Inception", 2010, "F123");
        funcionario = new Funcionario("Christopher Nolan", "123.456.789-00");

        diretorFuncao = () -> "Diretor";
        atorFuncao = () -> "Ator";
    }

    @Test
    void testAdicionarFuncionarioComSucesso() {
        boolean resultado = filme.adicionarNoFilme(funcionario, diretorFuncao);
        assertTrue(resultado);
        assertEquals(1, filme.getDiretores().size());
    }

    @Test
    void testAdicionarFuncionarioComFuncaoDuplicada() {
        filme.adicionarNoFilme(funcionario, diretorFuncao);
        boolean resultado = filme.adicionarNoFilme(funcionario, diretorFuncao);
        assertFalse(resultado); // mesma função não pode ser adicionada duas vezes
    }

    @Test
    void testGetAtores() {
        filme.adicionarNoFilme(funcionario, atorFuncao);
        List<Funcionario> atores = filme.getAtores();
        assertEquals(1, atores.size());
    }

    @Test
    void testGetFuncionariosPorFuncaoNaoExiste() {
        List<Funcionario> roteiristas = filme.getRoteiristas();
        assertTrue(roteiristas.isEmpty());
    }

    @Test
    void testToStringContemDados() {
        filme.setTrilhaSonora("Hans Zimmer");
        filme.adicionarNoFilme(funcionario, diretorFuncao);
        String output = filme.toString();
        assertTrue(output.contains("Filme: Inception"));
        assertTrue(output.contains("Diretor"));
        assertTrue(output.contains("Christopher Nolan"));
    }
}
