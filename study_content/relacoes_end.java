class Endereco {
    private String nome_rua;
    private int numero;
    public Escola (String nome_rua, int numero){
        this.setNomeRua(nome_rua);
        this.numero=numero;
    }
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

