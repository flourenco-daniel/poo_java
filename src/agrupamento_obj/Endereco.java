package agrupamento_obj;

public class Endereco {
    // Atributos
    private String rua, bairro, cidade;

    // Construtor
    public Endereco(String rua, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    // Métodos para atualizar dados (setters)
    public void atualizarRua(String rua) {
        this.rua = rua;
    }

    public void atualizarBairro(String bairro) {
        this.bairro = bairro;
    }

    public void atualizarCidade(String cidade) {
        this.cidade = cidade;
    }

    // Métodos para recuperar dados (getters)
    public String recuperarRua() {
        return this.rua;
    }

    public String recuperarBairro() {
        return this.bairro;
    }

    public String recuperarCidade() {
        return this.cidade;
    }

    // Método para criar endereço completo (não necessário já que temos o construtor)
    public void criarEndereco(String nomeRua) {
        this.rua = nomeRua;
    }

    // Sobrescrevendo o método toString para melhor visualização do endereço
    @Override
    public String toString() {
        return String.format("Rua %s, %s, %s", rua, bairro, cidade);
    }

    // Método para retornar endereço completo
    public String enderecoCompleto() {
        return "Rua: " + this.rua + 
               "\nBairro: " + this.bairro + 
               "\nCidade: " + this.cidade;
    }
}