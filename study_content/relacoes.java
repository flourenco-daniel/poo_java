class Escola {
    private String nome, CNPJ;
    private Endereco endereco; //associação
    private Departamento departamentos [] ; //composição
    private Aluno discentes [];
    private int nr_discentes , nr_departamentos
    //métodos
    public Escola (String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno [1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;

    }
    public void criarDepartamento(String nomeDepartamento){
        if(nr_departamentos <= 10)
        {
            departamentos[nr_departamentos] = new Departamento (nomeDepartamento);
            nr_departamentos++;
        } else {
            System.out.println("Não é possível criar outro Departamento;");
        }
    public void matricularAluno (Aluno novoAluno) {
        discentes [nr_discentes] = novoAluno;
    }
}