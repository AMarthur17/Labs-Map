public class Main {
    public static void main(String[] args) {
        // Cria uma instância do controle acadêmico
        ControleAcademico controleAcademico = new ControleAcademico();
            
        // Cria disciplinas
        controleAcademico.addDisciplina("Estruturas de Dados", "DISC101");
        controleAcademico.addDisciplina("Banco de Dados", "DISC102");           

        // Criando matrícula do professor
        controleAcademico.criarMatriculaProfessor("Laura", "PROF101");
        controleAcademico.criarMatriculaProfessor("Kevin", "PROF102");

        // Cria turmas com o respectivo professor e adiciona o horário
        controleAcademico.criarTurma("TURMA101", controleAcademico.getDisciplinaPorCodigo("DISC101"), controleAcademico.getProfessorPorCodigo("PROF101"));
        controleAcademico.getTurmaPorCodigo("TURMA101").setHorario("Terça -> 10:00h-12:00h");

        controleAcademico.criarTurma("TURMA102", controleAcademico.getDisciplinaPorCodigo("DISC102"), controleAcademico.getProfessorPorCodigo("PROF102"));
        controleAcademico.getTurmaPorCodigo("TURMA102").setHorario("Quinta -> 15:00h-17:00h");
        
        // Cria alunos e suas matrículas
        controleAcademico.criarMatriculaAluno("Arthur", "ALUNO101");
        controleAcademico.criarMatriculaAluno("Fernanda", "ALUNO102");

        // Matricula alunos em turmas
        controleAcademico.matricularAlunoEmTurma(controleAcademico.getMatriculaPorCodigo("ALUNO101"), controleAcademico.getTurmaPorCodigo("TURMA101"));
        controleAcademico.matricularAlunoEmTurma(controleAcademico.getMatriculaPorCodigo("ALUNO102"), controleAcademico.getTurmaPorCodigo("TURMA101"));
        controleAcademico.matricularAlunoEmTurma(controleAcademico.getMatriculaPorCodigo("ALUNO102"), controleAcademico.getTurmaPorCodigo("TURMA102"));
        
        // Exibindo informações
        controleAcademico.exibirInformacoesProfessores();
        controleAcademico.exibirInformacoesDisciplinas();
        controleAcademico.exibirInformacoesAlunos();

    }
}
