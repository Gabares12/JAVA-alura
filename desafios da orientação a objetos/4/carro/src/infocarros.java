public class infocarros {
    String modelo;
    String corDoveiculo;
    int anoDoVeiculo;

    void fichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("A cor do carro é: " + corDoveiculo);
        System.out.println("ano do carro é:" + anoDoVeiculo);

    }
    int calculaIdade() {
        return 2025 - anoDoVeiculo;
    }

}
