import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestTurma {
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;
    private Aluno aluno1;
    private Aluno aluno2;
    
    @BeforeEach
    void setUp() {
        professor = new Professor("Dr. Silva", "P001");
        disciplina = new Disciplina("Matemática", "D001");
        turma = new Turma(disciplina, professor);
        aluno1 = new Aluno("Carlos", "A001");
        aluno2 = new Aluno("Ana", "A002");
    }

    @Test
    void testCriarTurma() {
        assertNotNull(turma);
        assertEquals(disciplina, turma.getDisciplina());
        assertEquals(professor, turma.getProfessor());
        assertTrue(turma.getListaDeAlunos().isEmpty());
    }

    @Test
    void testAdicionarAluno() {
        turma.adicionarAluno(aluno1);
        assertTrue(turma.getListaDeAlunos().contains(aluno1));
        assertEquals(1, turma.getNumeroDeAlunos());
    }

    @Test
    void testAdicionarAlunoDuplicado() {
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno1);
        assertEquals(1, turma.getNumeroDeAlunos());
    }

    @Test
    void testAdicionarMultiplosAlunos() {
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        assertEquals(2, turma.getNumeroDeAlunos());
    }

    @Test
    void testSetHorario() {
        turma.setHorario("08:00 - 10:00");
        assertEquals("08:00 - 10:00", turma.getHorario());
    }

    @Test
    void testSetProfessor() {
        Professor novoProfessor = new Professor("Dra. Souza", "P002");
        turma.setProfessor(novoProfessor);
        assertEquals(novoProfessor, turma.getProfessor());
    }
}