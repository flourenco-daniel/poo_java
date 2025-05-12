package agrupamento_obj;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Escola {
    // Atributos
    private String nome, CNPJ;   
    private Endereco endereco;
    private List<Departamento> departamentos;
    private List<Aluno> discentes;

    // Métodos
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<>();
        this.discentes = new ArrayList<>();
    }

    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento(nomeDepartamento));
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos() {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno a : discentes) {
            if (!agrupamento.containsKey(a.recuperarNaturalidade())) {
                agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
            }
            agrupamento.get(a.recuperarNaturalidade()).add(a);
        }
        System.out.println("Resultado do agrupamento por naturalidade: " + agrupamento);
    }
}