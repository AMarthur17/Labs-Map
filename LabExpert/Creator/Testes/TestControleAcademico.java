import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class TestControleAcademico {
    private ControleAcademico controle;

    @BeforeEach
    void setUp() {
        controle = new ControleAcademico();
    }

    @Test
    void testCriarProfessor() {
        Professor professor = controle.criarProfessor("Dr. Silva", "P001");
        assertNotNull(professor);
        assertEquals("Dr. Silva", professor.getNome());
        assertEquals("P001", professor.getCodigoProf());
    }

    @Test
    void testCriarAluno() {
        Aluno aluno = controle.criarAluno("João", "A001");
        assertNotNull(aluno);
        assertEquals("João", aluno.getNome());
        assertEquals("A001", aluno.getMatricula());
    }

    @Test
    void testAdicionarDisciplina() {
        Disciplina disciplina = controle.addDisciplina("Matemática", "D001");
        assertNotNull(disciplina);
        assertEquals("Matemática", disciplina.getNome());
        assertEquals("D001", disciplina.getCodigoDisciplina());
    }

    @Test
    public void testCriarTurma() {
        Professor professor = controle.criarProfessor("Carlos", "3001");
        Disciplina disciplina = controle.addDisciplina("Redes de Computadores", "202");
        Turma turma = controle.criarTurma("T202", disciplina, professor);
        
        assertNotNull(turma);
        assertEquals(disciplina.getNome(), turma.getDisciplina().getNome());
        assertEquals(disciplina.getCodigoDisciplina(), turma.getDisciplina().getCodigoDisciplina());

        assertEquals(professor.getNome(), turma.getProfessor().getNome());
        assertEquals(professor.getCodigoProf(), turma.getProfessor().getCodigoProf());
    }

    @Test
    void testCriarMatriculaAluno() {
        MatriculaAluno matricula = controle.criarMatriculaAluno("João", "A001");
        assertNotNull(matricula);
        assertEquals("João", matricula.getAluno().getNome());
        assertEquals("A001", matricula.getAluno().getMatricula());
    }

    @Test
    void testMatricularAlunoEmTurma() {
        Professor professor = controle.criarProfessor("Dr. Silva", "P001");
        Disciplina disciplina = controle.addDisciplina("Matemática", "D001");
        Turma turma = controle.criarTurma("T001", disciplina, professor);
        MatriculaAluno matricula = controle.criarMatriculaAluno("João", "A001");

        controle.matricularAlunoEmTurma(matricula, turma);
        assertTrue(turma.getListaDeAlunos().contains(matricula.getAluno()));
    }

    @Test
    public void testGetTurmasPorProfessor() {
        Professor professor = new Professor("Mariana", "PROF002");
        Disciplina disciplina = new Disciplina("Banco de Dados", "DISC202");
        
        controle.addDisciplina(disciplina.getNome(), disciplina.getCodigoDisciplina());
        controle.criarMatriculaProfessor(professor.getNome(), professor.getCodigoProf());
        controle.criarTurma("TURMA202", controle.getDisciplinaPorCodigo(disciplina.getCodigoDisciplina()), controle.getProfessorPorCodigo("PROF002"));
        
        List<Turma> turmas = controle.getTurmasPorProfessor(controle.getProfessorPorCodigo("PROF002"));
    
        assertEquals(1, turmas.size());
        assertTrue(turmas.stream().anyMatch(t -> t.getDisciplina().getCodigoDisciplina().equals(disciplina.getCodigoDisciplina())
            && t.getProfessor().getCodigoProf().equals(professor.getCodigoProf())));
    }


    @Test
    void testGetAlunosPorTurma() {
        Professor professor = controle.criarProfessor("Dr. Silva", "P001");
        Disciplina disciplina = controle.addDisciplina("Matemática", "D001");
        Turma turma = controle.criarTurma("T001", disciplina, professor);
        MatriculaAluno matricula = controle.criarMatriculaAluno("João", "A001");

        controle.matricularAlunoEmTurma(matricula, turma);
        List<Aluno> alunos = controle.getAlunosPorTurma(turma);

        assertNotNull(alunos);
        assertEquals(1, alunos.size());
        assertEquals("João", alunos.get(0).getNome());
    }
}
