public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("nome do filme " + nome);
        System.out.println("Nome de lançamento " + anoDeLancamento);
    }
    void avaliaAe(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }
double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
}

}
