public class minhasMusicas {

    String nome;
    String nomeDoArtista;
    int anoDeLancamento;
    double duracaoDaMusica;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void fichaTecnica(){
        System.out.println("nome da musica: " + nome);
        System.out.println("Nome do artista: " + nomeDoArtista);
        System.out.println("ano de lançamento: " + anoDeLancamento);
        System.out.println("tem " + duracaoDaMusica + " minutos ");
    }
    void avalicoes(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
