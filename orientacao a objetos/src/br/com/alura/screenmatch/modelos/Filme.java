package br.com.alura.screenmatch.modelos;

public class Filme {

  private String nome;
    private int anoDeLancamento;
   private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
   private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do filme é " + nome);
        System.out.println("Nome de lançamento é " + anoDeLancamento);
    }
   public void avaliaAe(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }
   public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
