import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        ControleAcademico controleAcademico = new ControleAcademico();
                
        // Cria disciplinas
        controleAcademico.addDisciplina("Estruturas de Dados", "DISC101");
        controleAcademico.addDisciplina("Banco de Dados", "DISC102");           

        // Criando matrícula do professor
        controleAcademico.criarMatriculaProfessor("Mariana", "PROF101");

        // Cria turmas com o respectivo professor e adiciona o horário
        controleAcademico.criarTurma("TURMA201", controleAcademico.getDisciplinaPorCodigo("DISC101"), controleAcademico.getProfessorPorCodigo("PROF101"));
        controleAcademico.criarTurma("TURMA202", controleAcademico.getDisciplinaPorCodigo("DISC102"), controleAcademico.getProfessorPorCodigo("PROF101"));
        
        // Obtém e exibe o número de turmas do professor
        List<Turma> turmas = controleAcademico.getTurmasPorProfessor(controleAcademico.getProfessorPorCodigo("PROF101"));
        System.out.println("Número de turmas: " + turmas.size());
    }
}
