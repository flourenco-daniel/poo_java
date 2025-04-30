package heranca;

public class Empregado extends Pessoa {
    //Atributos
    protected String matricula;
    private Calendar data_admissao , data_demissao; //atributos que não estão sendo herdaddos
    //Construtor
    public Empregado(String nome, Calendar data_nascimento, long cpf, Endereco endereco) {
        super(nome, data_nascimento, cpf, endereco);
        this.matricula = gerarMatricula()
        data_admissa = Calendar.getInstance()
    }
    public void demitirEmpregado() {
        data_demissao = Calendar.getInstance();
    }
    protected void gerarMatricula () {
        this.matricula = "Matrícula não definida.";
    }
    protected String recuperarMatricula () {
        return this.matricula;
    }
}