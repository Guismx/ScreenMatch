package br.com.guismx.screenmatch.calculos;

import br.com.guismx.screenmatch.modelos.Filme;
import br.com.guismx.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo extends Filme {
    private int tempoTotal;
//GETTER
    public int getTempoTotal() {
        return tempoTotal;
    }
//MÉTODOS PARA CALCULAR A DURAÇÃO DA SÉRIE/FILME
    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
