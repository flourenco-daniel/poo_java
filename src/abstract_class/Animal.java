abstract class Animal{
	//metodo abstrato
	public abstract void emitirSom();
	//metodo concreto
	public void dormir(){
		System.out.println("zzz");
	}
}

//subclasse concreta
class Cachorro extends Animal {
	public void emitirSom() {
		System.out.println("Latir!"); //aqui eu herdei o metodo abstrato e identifiquei qual som ele deve emitir
	}
}
//subclasseconcreta
class Gato extends Animal {
		public void emitirSom() {
			System.out.println("Miar!");
		}
	}