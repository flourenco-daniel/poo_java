public class Referencia {
    private Aluno a1, a2;
    public Referencia ( ) {
        a1 = new Aluno ("Carlos", 20);
        a2 = new Aluno ("Ana", 23);
        System.out.println("Nome do aluno 1 é: "+ a1.recuperarNome());
        System.out.println("Nome do aluno 2 é: "+ a2.recuperarNome());
        a2 = a1; //aqui eu referenciei a2 igual a a1. Observe o que acontecerá abaixo
        a2.definirNome("Flávia");
        System.out.println("O nome do aluno 1 é "+ a1.recuperarNome()); // aqui, o nome que vai sair é Flávia, pois referenciei a2 = a1
        manipulaAluno(a1);
        System.out.println("O nome do aluno 1 é "+ a1.recuperarNome()); // Aqui o nome do aluno vai ser marcia, pois apliquei a1 à funcção definida abaixo
        }
        public void manipulaAluno(Aluno aluno){
        aluno.definirNome = ("Márcia")
        }
        public static void main(String args[]) {
            Referencia r = new Referencia ();
            System.out.println("Fim da execução");
        }


}