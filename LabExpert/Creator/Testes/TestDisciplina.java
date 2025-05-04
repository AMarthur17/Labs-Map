import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDisciplina {
    
    @Test
    void testCriarDisciplina() {
        Disciplina disciplina = new Disciplina("Matemática", "D001");
        assertNotNull(disciplina);
        assertEquals("Matemática", disciplina.getNome());
        assertEquals("D001", disciplina.getCodigoDisciplina());
    }
    
    @Test
    void testDisciplinaComNomeVazio() {
        Disciplina disciplina = new Disciplina("", "D002");
        assertNotNull(disciplina);
        assertEquals("", disciplina.getNome());
        assertEquals("D002", disciplina.getCodigoDisciplina());
    }
    
    @Test
    void testDisciplinaComCodigoVazio() {
        Disciplina disciplina = new Disciplina("Física", "");
        assertNotNull(disciplina);
        assertEquals("Física", disciplina.getNome());
        assertEquals("", disciplina.getCodigoDisciplina());
    }
    
    @Test
    void testDisciplinaComNomeENulo() {
        Disciplina disciplina = new Disciplina(null, "D003");
        assertNotNull(disciplina);
        assertNull(disciplina.getNome());
        assertEquals("D003", disciplina.getCodigoDisciplina());
    }
    
    @Test
    void testDisciplinaComCodigoNulo() {
        Disciplina disciplina = new Disciplina("Química", null);
        assertNotNull(disciplina);
        assertEquals("Química", disciplina.getNome());
        assertNull(disciplina.getCodigoDisciplina());
    }
}
