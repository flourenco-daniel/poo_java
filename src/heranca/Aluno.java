package heranca;

public class Aluno extends Pessoa {
    //atributos -- herdados da classe pessoa mais os que vou declarar abaixo
    private String matricula;
    //construtor -- herdados da classe pessoa mais os que vou declarar abaixo
    public Aluno(String nome, Calendar data_nascimento, long cpf, Endereco endereco){
        super (nome, data_nascimento, cpf, endereco); // aqui a classe pessoa faz o uso do construtor da classe Aluno
    }
}