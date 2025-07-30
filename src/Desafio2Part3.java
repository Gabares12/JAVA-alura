import java.util.Scanner;

public class Desafio2Part3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite o seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
        System.out.println("qual sua nota pro filme?");
        double avaliacaoDoFilme = leitura.nextInt();
        System.out.println(" o ano de lnçamento é " + anoDeLancamento + " O filme é " + filme + " e sua nota é " + avaliacaoDoFilme );

    }
}
