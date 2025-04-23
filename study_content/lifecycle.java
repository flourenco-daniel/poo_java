import java.util.Random;
public class Aluno{    
//Atributos
private String nome;
private int idade;
private double codigo_identificador;
private Random aleatorio;
//Construtor
public Aluno(String nome, int idade){ // mesmo nome da classe
     aleatorio = new Random();
     this.nome = nome;
     this.idade = idade;
     this.codigo_identificador = aleatorio.nextDouble();
}
//Métodos
public void definirNome(String nome){
     this.nome = nome;
}  
public void definirIdade( int idade){
     this.idade = idade;
}
}