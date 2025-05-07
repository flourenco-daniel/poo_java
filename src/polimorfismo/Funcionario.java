
//com override
public class Funcionario extends Pessoa {
	@Override
	public void falar(){
	// aqui, usando o override ele vai excluir a herança falar() de pessoa e vai utilizar o metodo de forma independente
		System.out.println("Opa!");
	}