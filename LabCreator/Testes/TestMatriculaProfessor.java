import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestMatriculaProfessor {
    private MatriculaProfessor matricula;
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;
    
    @BeforeEach
    void setUp() {
        professor = new Professor("Dr. Silva", "P001");
        matricula = new MatriculaProfessor("Dr. Silva", "P001");
        disciplina = new Disciplina("Matemática", "D001");
        turma = new Turma(disciplina, professor);
    }

    @Test
    void testCriarMatriculaProfessor() {
        assertNotNull(matricula);
        assertEquals("Dr. Silva", matricula.getProfessor().getNome());
        assertEquals("P001", matricula.getProfessor().getCodigoProf());
    }

    @Test
    void testAdicionarTurma() {
    matricula.adicionarTurma(turma);
    assertTrue(matricula.getTurmas().contains(turma));
    assertEquals(professor.getCodigoProf(), turma.getProfessor().getCodigoProf());
}

    @Test
    void testAdicionarTurmaDuplicada() {
        matricula.adicionarTurma(turma);
        matricula.adicionarTurma(turma);
        assertEquals(1, matricula.getTurmas().size());
    }

    @Test
    void testNumeroDeTurmas() {
        Turma turma2 = new Turma(new Disciplina("Física", "D002"), professor);
        matricula.adicionarTurma(turma);
        matricula.adicionarTurma(turma2);
        assertEquals(2, matricula.getNumeroDeTurmas());
    }
}
