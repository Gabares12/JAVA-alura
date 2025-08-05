public class fichaAluno {

    String nome;
    int idade;
    int serie;
    boolean bomAluno;

    void fichaDoAluno(){
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("O aluno está na " + serie + " Série ");
        System.out.println("é bom aluno?" + bomAluno);
    }
}
