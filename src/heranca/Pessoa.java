package heranca;

//atributos

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long cpf;
    private Endereco endereco;
//construtor
    public Pessoa(String nome, Calendar data_nascimento, long cpf, Endereco endereco){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        atualizarIdade();
    }
//métodos
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    protected void atualizarIdade(){
        this.idade = calcularIdade();
    }
    protected int recuperarIdade() {
        return this.idade;
    }
    protected void atualizarCPF(long cpf){
        this.cpf = cpf;
    }
    protected long recuperarCPF(){
        return this.cpf;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco(){
        return this.endereco;
    }
    private int calcularIdade(){
        Calendar hoje = Calendar.getInstance();
        int lapso = hoje.get(year) - data_nascimento.get(year);
        if ((data_nascimento.get(MONTH) > hoje.get(MONTH)) || (data_nascimento.get(MONTH)
        ==
        hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE)))
            lapso--;
        return lapso;
    }
}
