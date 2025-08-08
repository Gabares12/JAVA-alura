import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome ("o poderoso chefão");
        meuFilme.setDuracaoEmMinutos (1972);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos (180);
        System.out.println("duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações : " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.TotalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(22);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar Lost : " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());


    }

}
