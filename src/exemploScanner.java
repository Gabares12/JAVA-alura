import java.util.Scanner;

public class exemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor que pretende investir esse mês:");
        double valor = scanner.nextDouble();

        System.out.println( nome + " que tem  " + idade + " anos, que vai investir " + valor);
    }
}
