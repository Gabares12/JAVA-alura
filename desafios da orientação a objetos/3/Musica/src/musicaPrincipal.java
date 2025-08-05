public class musicaPrincipal {
    public static void main(String[] args) {
        minhasMusicas musicas = new minhasMusicas();
        musicas.nome = "Forever Young";
        musicas.nomeDoArtista = "alphaville";
        musicas.anoDeLancamento = 1984;
        musicas.duracaoDaMusica = 3.46;
        musicas.somaDasAvaliacoes = 10;
        musicas.totalDeAvaliacoes = 1;

        musicas.fichaTecnica();
        musicas.avalicoes(10);
        System.out.println(musicas.somaDasAvaliacoes);
        System.out.println(musicas.totalDeAvaliacoes);
        System.out.println(musicas.pegaMedia());

    }

}
