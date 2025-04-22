public class Aluno {
	private String nome;
	public void inserirNome (String) nn { //public significa que o usuário (dev) poderá chamar os métodos inserirNome mais adiante
		nome = nn;
	}
	public String recuperarNome() {
		return nome;
	}
	public static void main(String args[]){ //static void main significa que ele está fora da classe aluno
		Aluno a = new Aluno();
		a.inserirNome ("Pessoa");
		System.out.println("saida: "+a.recuperarNome());
	}
}

//Em Java, cada classe pública deve estar em um arquivo com o mesmo nome da classe e extensão “java”. 
//Logo, a classe do código superior deve ser salva em um arquivo de nome “Aluno.java