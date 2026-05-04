import java.time.LocalDate;

public class musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int somaAvaliacoes;
  LocalDate data;

    void mostrar(){

        System.out.println("Titulo: "+titulo + " Artista: "+artista+" anoLancamento: "+anoLancamento);
    }

    void avalia (double nota){
        avaliacao += nota;
        somaAvaliacoes++;
    }

    double pegaMedia(){
        return avaliacao/somaAvaliacoes;

    }


}
