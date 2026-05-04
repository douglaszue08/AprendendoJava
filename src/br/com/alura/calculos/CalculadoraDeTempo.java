package br.com.alura.calculos;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Series;
import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    /*public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Series f){
        tempoTotal += f.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo){
        System.out.println("Incluindo o tempo do titulo: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
