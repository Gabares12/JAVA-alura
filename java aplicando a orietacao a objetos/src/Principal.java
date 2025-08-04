public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "o poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;
        meuFilme.somaDasAvaliacoes = 34.34;
        meuFilme.totalDeAvaliacoes = 10;
        meuFilme.duracaoEmMinutos = 180;

        Filme meuFilme2 = new Filme();
        meuFilme2.nome = "Rocky, um lutador";
        meuFilme2.anoDeLancamento = 1976;
        meuFilme2.incluidoNoPlano = true;
        meuFilme2.somaDasAvaliacoes = 23.23;
        meuFilme2.totalDeAvaliacoes = 10;
        meuFilme2.duracaoEmMinutos = 192;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme2.nome);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaAe(8);
        meuFilme.avaliaAe(5);
        meuFilme.avaliaAe(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        System.out.println("////////////////////////////////////////");


        meuFilme2.nome = "Rocky, um lutador";
        meuFilme2.anoDeLancSamento = 1976;
        meuFilme2.incluidoNoPlano = true;
        meuFilme2.somaDasAvaliacoes = 23.23;
        meuFilme2.totalDeAvaliacoes = 10;
        meuFilme2.duracaoEmMinutos = 192;

        System.out.println(meuFilme2.nome);
        System.out.println(meuFilme2.incluidoNoPlano);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaAe(10);
        meuFilme.avaliaAe(9);
        meuFilme.avaliaAe(10);

        System.out.println(meuFilme2.somaDasAvaliacoes);
        System.out.println(meuFilme2.totalDeAvaliacoes);
        System.out.println(meuFilme2.pegaMedia());




    }




}
