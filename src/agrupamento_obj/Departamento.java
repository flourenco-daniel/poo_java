package agrupamento_obj;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    // Atributos
    private String nome;
    private String codigo;
    private List<Aluno> alunosMatriculados;
    private List<String> disciplinas;
    private boolean ativo;

    // Construtor
    public Departamento(String nome) {
        this.nome = nome;
        this.codigo = gerarCodigo();
        this.alunosMatriculados = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.ativo = true;
    }

    // Métodos para gerenciar alunos
    public void matricularAluno(Aluno aluno) {
        if (ativo && !alunosMatriculados.contains(aluno)) {
            alunosMatriculados.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }

    // Métodos para gerenciar disciplinas
    public void adicionarDisciplina(String disciplina) {
        if (ativo && !disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public void removerDisciplina(String disciplina) {
        disciplinas.remove(disciplina);
    }

    // Getters e Setters
    public String recuperarNome() {
        return this.nome;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public String recuperarCodigo() {
        return this.codigo;
    }

    public List<Aluno> recuperarAlunos() {
        return new ArrayList<>(alunosMatriculados); // retorna uma cópia da lista
    }

    public List<String> recuperarDisciplinas() {
        return new ArrayList<>(disciplinas); // retorna uma cópia da lista
    }

    public boolean estaAtivo() {
        return this.ativo;
    }

    // Métodos de controle do departamento
    public void ativarDepartamento() {
        this.ativo = true;
    }

    public void desativarDepartamento() {
        this.ativo = false;
    }

    // Método auxiliar para gerar código único
    private String gerarCodigo() {
        // Gera um código baseado no nome do departamento e um número aleatório
        return nome.substring(0, Math.min(3, nome.length())).toUpperCase() + 
               String.format("%03d", (int)(Math.random() * 999));
    }

    // Método para contar alunos
    public int contarAlunos() {
        return alunosMatriculados.size();
    }

    // Método para contar disciplinas
    public int contarDisciplinas() {
        return disciplinas.size();
    }

    // Override do toString para melhor visualização
    @Override
    public String toString() {
        return String.format("Departamento: %s (Código: %s) - %s", 
                           nome, 
                           codigo, 
                           ativo ? "Ativo" : "Inativo");
    }

    // Método para gerar relatório do departamento
    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== Relatório do Departamento ===\n");
        relatorio.append("Nome: ").append(nome).append("\n");
        relatorio.append("Código: ").append(codigo).append("\n");
        relatorio.append("Status: ").append(ativo ? "Ativo" : "Inativo").append("\n");
        relatorio.append("Número de Alunos: ").append(contarAlunos()).append("\n");
        relatorio.append("Número de Disciplinas: ").append(contarDisciplinas()).append("\n");
        
        relatorio.append("\nDisciplinas:\n");
        for (String disc : disciplinas) {
            relatorio.append("- ").append(disc).append("\n");
        }

        return relatorio.toString();
    }
}