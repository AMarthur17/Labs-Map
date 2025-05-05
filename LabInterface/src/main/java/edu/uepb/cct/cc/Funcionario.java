package edu.uepb.cct.cc;

import java.util.*;

public class Funcionario {
    private String nome;
    private String cpf;

    private Set<Funcao> funcoes; //tem um conjunto de funções - indica que um funcionário pode exercer múltiplas funções(composição)
    private Map<String, List<Funcao>> filmografia; // para cada filme identificado por um String (o ID), existe uma lista de funções (Funcao) que ele exerceu naquele filme. (composição)

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcoes = new HashSet<>();
        this.filmografia = new HashMap<>();
    }

    public void adicionarFilme(Funcao funcao, String idFilme) {
        filmografia.computeIfAbsent(idFilme, k -> new ArrayList<>());
        if (!filmografia.get(idFilme).contains(funcao)) {
            filmografia.get(idFilme).add(funcao);
        }
        funcoes.add(funcao);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Map<String, List<Funcao>> getFilmografia() {
        return filmografia;
    }

    public String toStringFilmografia() {
        StringBuilder sb = new StringBuilder();
        sb.append("_____________________________________________________________________\n");
        sb.append("Filmografia de: ").append(nome).append("\n");
        sb.append(String.format("%-30s %-30s\n", "Filme (ID)", "Função"));
        sb.append("--------------------------------------------------------------\n");
        for (Map.Entry<String, List<Funcao>> entry : filmografia.entrySet()) {
            for (Funcao funcao : entry.getValue()) {
                sb.append(String.format("%-30s %-30s\n", entry.getKey(), funcao.getDescricao()));
            }
        }
        sb.append("_____________________________________________________________________\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("___________________________________________\n");
        sb.append("Funcionário: ").append(nome).append("\n");
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("Funções desempenhadas:\n");

        if (funcoes.isEmpty()) {
            sb.append("Nenhuma função atribuída\n");
        } else {
            for (Funcao funcao : funcoes) {
                sb.append("- ").append(funcao.getDescricao()).append("\n");
            }
        }
        sb.append("___________________________________________");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
