package dominio;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Filme> filmes = new HashMap<>();
    private static final Map<String, Funcionario> funcionarios = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1 -> cadastrarFilme();
                case 2 -> cadastrarFuncionario();
                case 3 -> atribuirFuncionarioAFilme();
                case 4 -> exibirFilmes();
                case 5 -> exibirFuncionarios();
                case 6 -> exibirFilmografia();
                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void menu() {
        System.out.println("\n--- MENU GLOBO FILMES ---");
        System.out.println("1. Cadastrar filme");
        System.out.println("2. Cadastrar funcionário");
        System.out.println("3. Atribuir função a funcionário em um filme");
        System.out.println("4. Exibir todos os filmes");
        System.out.println("5. Exibir todos os funcionários");
        System.out.println("6. Exibir filmografia de um funcionário");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");
    }

    private static void cadastrarFilme() {
        System.out.print("Nome do filme: ");
        String nome = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        System.out.print("ID único do filme: ");
        String id = scanner.nextLine();
        Filme filme = new Filme(nome, ano, id);
        System.out.print("Trilha sonora: ");
        String trilha = scanner.nextLine();
        filme.setTrilhaSonora(trilha);
        filmes.put(id, filme);
        System.out.println("Filme cadastrado com sucesso.");
    }

    private static void cadastrarFuncionario() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        funcionarios.put(cpf, new Funcionario(nome, cpf));
        System.out.println("Funcionário cadastrado com sucesso.");
    }

    private static void atribuirFuncionarioAFilme() {
        System.out.print("CPF do funcionário: ");
        String cpf = scanner.nextLine();
        Funcionario funcionario = funcionarios.get(cpf);
        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        System.out.print("ID do filme: ");
        String idFilme = scanner.nextLine();
        Filme filme = filmes.get(idFilme);
        if (filme == null) {
            System.out.println("Filme não encontrado.");
            return;
        }

        Funcao funcao = escolherFuncao();
        if (funcao != null) {
            filme.adicionarNoFilme(funcionario, funcao);
            System.out.println("Função atribuída com sucesso.");
        } else {
            System.out.println("Função inválida.");
        }
    }

    private static Funcao escolherFuncao() {
        System.out.println("Escolha a função:");
        System.out.println("1. Ator");
        System.out.println("2. Diretor");
        System.out.println("3. Roteirista");
        System.out.println("4. Camera");
        System.out.println("5. Cinegrafista");
        System.out.print("Opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        return switch (opcao) {
            case 1 -> new Ator();
            case 2 -> new Diretor();
            case 3 -> new Roteirista();
            case 4 -> new Camera();
            case 5 -> new Cinegrafista();
            default -> null;
        };
    }

    private static void exibirFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        for (Filme filme : filmes.values()) {
            System.out.println(filme);
        }
    }

    private static void exibirFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (Funcionario funcionario : funcionarios.values()) {
            System.out.println(funcionario);
        }
    }

    private static void exibirFilmografia() {
        System.out.print("CPF do funcionário: ");
        String cpf = scanner.nextLine();
        Funcionario funcionario = funcionarios.get(cpf);
        if (funcionario != null) {
            System.out.println(funcionario.toStringFilmografia());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
