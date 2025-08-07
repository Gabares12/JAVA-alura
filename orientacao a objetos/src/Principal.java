import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.nome = "o poderoso chefão";
    meuFilme.anoDeLancamento = 1972;
    meuFilme.incluidoNoPlano = true;
    meuFilme.duracaoEmMinutos = 180;

    meuFilme.exibeFichaTecnica();
    meuFilme.avaliaAe(8);
    meuFilme.avaliaAe(10);
    meuFilme.avaliaAe(10);
    System.out.println("Total de avaliações : " + meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.pegaMedia());
    //meuFilme.somaDasAvaliacoes = 10;
    //meuFilme.TotalDeAvaliacoes = 1;
    //System.out.println(meuFilme.pegaMedia());



}

}
