public class Pessoa {
	//sobrecarga
	public void falar(){
		System.out.println("Oi!");
	}	
	public void falar(string Texto){
		System.out.println(Texto);
	}
	public void falar(String t) { //aqui ele vai dar erro dizendo que o falar() já foi definido pois estou utilizando o mesmo tipo da variável (string) anteriormente
		System.out.println(t);
	}
	public void falar(String texto, int quantidade) { //aqui vai dar certo pois eu estou utilizando mais de um tipo de variável na assinatura 
		System.out.println(texto, quantidade);
	}
}