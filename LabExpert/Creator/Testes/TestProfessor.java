import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProfessor {
    
    @Test
    void testCriarProfessor() {
        Professor professor = new Professor("Dr. Silva", "P001");
        assertNotNull(professor);
        assertEquals("Dr. Silva", professor.getNome());
        assertEquals("P001", professor.getCodigoProf());
    }
    
    @Test
    void testProfessorComNomeVazio() {
        Professor professor = new Professor("", "P002");
        assertNotNull(professor);
        assertEquals("", professor.getNome());
        assertEquals("P002", professor.getCodigoProf());
    }
    
    @Test
    void testProfessorComCodigoVazio() {
        Professor professor = new Professor("Dr. Souza", "");
        assertNotNull(professor);
        assertEquals("Dr. Souza", professor.getNome());
        assertEquals("", professor.getCodigoProf());
    }
    
    @Test
    void testProfessorComNomeNulo() {
        Professor professor = new Professor(null, "P003");
        assertNotNull(professor);
        assertNull(professor.getNome());
        assertEquals("P003", professor.getCodigoProf());
    }
    
    @Test
    void testProfessorComCodigoNulo() {
        Professor professor = new Professor("Dr. Almeida", null);
        assertNotNull(professor);
        assertEquals("Dr. Almeida", professor.getNome());
        assertNull(professor.getCodigoProf());
    }
}