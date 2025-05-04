import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAluno {

    @Test
    public void testConstrutor() {
        String nome = "João Silva";
        String matricula = "12345";
        
        Aluno aluno = new Aluno(nome, matricula);
        
        assertNotNull(aluno);
        assertEquals(nome, aluno.getNome());
        assertEquals(matricula, aluno.getMatricula());
    }

    @Test
    public void testGetNome() {
        String nome = "Maria Souza";
        Aluno aluno = new Aluno(nome, "54321");
        
        String nomeRetornado = aluno.getNome();
        
        assertEquals(nome, nomeRetornado);
    }

    @Test
    public void testGetMatricula() {
        String matricula = "67890";
        Aluno aluno = new Aluno("Carlos Oliveira", matricula);
        
        String matriculaRetornada = aluno.getMatricula();
        
        assertEquals(matricula, matriculaRetornada);
    }

    @Test
    public void testConstrutorComValoresNulos() {
        Aluno aluno = new Aluno(null, null);
        
        assertNull(aluno.getNome());
        assertNull(aluno.getMatricula());
    }

    @Test
    public void testConstrutorComValoresVazios() {

        Aluno aluno = new Aluno("", "");
        
        assertEquals("", aluno.getNome());
        assertEquals("", aluno.getMatricula());
    }
}
