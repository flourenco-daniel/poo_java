//1- declaração de classes e atributos
class Endereco {
    private String nome_rua;
    private int numero;
//2- construtor
    public Endereco (String nome_rua, int numero){
        this.setNomeRua(nome_rua);
        this.numero=numero;
    }
//3- Métodos (setters)
    private void setNomeRua(String nome_rua) {
        this.nome_rua = nome_rua
    }
    public String getNomeRua () {
        return this.nome_rua;
    }
    private void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }
}

//comentando o código:

//primeiro eu construo a classe e defino os construtores

//nos métodos, eu to falando o seguinte: seta o nome_rua e depois faz um get para eu usar essa classe nos atributos endereço da classe escola.