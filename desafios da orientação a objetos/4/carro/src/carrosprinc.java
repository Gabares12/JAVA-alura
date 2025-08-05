public class carrosprinc {
    public static void main(String[] args) {

        infocarros carroMeu = new infocarros();
        carroMeu.modelo = "GolG2";
        carroMeu.anoDoVeiculo = 2012;
        carroMeu.corDoveiculo = "cinza perolado roxo";

        carroMeu.fichaTecnica();

        System.out.println("idade do carro:" + carroMeu.calculaIdade() + "anos");

    }

}
