package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    public void inclui(Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();


    }
}
