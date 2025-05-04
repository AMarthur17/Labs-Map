import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMatriculaAluno {
    private MatriculaAluno matricula;
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;
    
    @BeforeEach
    void setUp() {
        matricula = new MatriculaAluno("João", "A001");
        professor = new Professor("Dr. Silva", "P001");
        disciplina = new Disciplina("Matemática", "D001");
        turma = new Turma(disciplina, professor);
    }

    @Test
    void testCriarMatriculaAluno() {
        assertNotNull(matricula);
        assertEquals("João", matricula.getAluno().getNome());
        assertEquals("A001", matricula.getAluno().getMatricula());
    }

    @Test
    void testMatricularEmTurma() {
        matricula.matricularEmTurma(turma);
        assertTrue(matricula.getTurmas().contains(turma));
        assertTrue(turma.getListaDeAlunos().contains(matricula.getAluno()));
    }

    @Test
    void testMatricularEmTurmaDuplicada() {
        matricula.matricularEmTurma(turma);
        matricula.matricularEmTurma(turma);
        assertEquals(1, matricula.getTurmas().size());
    }

    @Test
    void testNumeroDeTurmas() {
        Turma turma2 = new Turma(new Disciplina("Física", "D002"), professor);
        matricula.matricularEmTurma(turma);
        matricula.matricularEmTurma(turma2);
        assertEquals(2, matricula.getNumeroDeTurmas());
    }
}