public class Conta{
	public void pagar(){ //método normal
	}
	public void pagar(int cod_opcao){} //a pessoa pode escolher aqui qual o tipo de pagamento: pix, debito, etc...
	public void pagar(String texto_opcao){} //aqui pode ser o texto da opcao
	public void pagar(String texto_opcao, int cod_opcao){} // agora posso pesquisar os dois valores
}