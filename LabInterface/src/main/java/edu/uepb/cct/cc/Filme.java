package edu.uepb.cct.cc;

import java.util.*;
import java.util.stream.Collectors;

public class Filme {
    private String nome;
    private String id;
    private int ano;
    private String trilhaSonora;

    //tem um mapa de funcionários associados as funções (composição)
    private Map<Funcionario, List<Funcao>> funcionarios; 

    public Filme(String nome, int ano, String id) {
        this.nome = nome;
        this.ano = ano;
        this.id = id;
        this.funcionarios = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getId() {
        return id;
    }

    public String getTrilhaSonora() {
        return trilhaSonora;
    }

    public void setTrilhaSonora(String trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }

    public boolean adicionarNoFilme(Funcionario funcionario, Funcao funcao) {
        try {
            List<Funcao> funcoes = funcionarios.computeIfAbsent(funcionario, k -> new ArrayList<>());
            if (!funcoes.contains(funcao)) {
                funcoes.add(funcao);
                funcionario.adicionarFilme(funcao, this.id); // usamos o ID
                return true;
            } else {
                System.out.println("Função já atribuída a este funcionário.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao adicionar funcionário ao filme: " + e.getMessage());
            return false;
        }
    }

    public List<Funcionario> getFuncionariosPorFuncao(String descricaoFuncao) {
        return funcionarios.entrySet().stream()
            .filter(e -> e.getValue().stream()
                .anyMatch(f -> f.getDescricao().equalsIgnoreCase(descricaoFuncao)))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

    public List<Funcionario> getDiretores() {
        return getFuncionariosPorFuncao("Diretor");
    }

    public List<Funcionario> getRoteiristas() {
        return getFuncionariosPorFuncao("Roteirista");
    }

    public List<Funcionario> getAtores() {
        return getFuncionariosPorFuncao("Ator");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("_____________________________________________________________________\n");
        sb.append(String.format("Filme: %s (%d) [ID: %s]\n", nome, ano, id));
        sb.append(String.format("Trilha sonora: %s\n", trilhaSonora != null ? trilhaSonora : "N/A"));
        sb.append("\nFuncionários e Funções:\n");
        sb.append(String.format("%-30s %-30s %-20s\n", "CPF", "Funcionário", "Função"));
        sb.append("--------------------------------------------------------------------\n");

        for (Map.Entry<Funcionario, List<Funcao>> entry : funcionarios.entrySet()) {
            Funcionario funcionario = entry.getKey();
            for (Funcao funcao : entry.getValue()) {
                sb.append(String.format("%-30s %-30s %-20s\n",
                        funcionario.getCpf(), funcionario.getNome(), funcao.getDescricao()));
            }
        }

        sb.append("_____________________________________________________________________\n");
        return sb.toString();
    }
}
