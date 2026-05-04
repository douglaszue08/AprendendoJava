import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.exercicios.controladores.Aluno;
import br.com.alura.exercicios.controladores.IdadePessoa;
import br.com.alura.exercicios.controladores.Livro;
import br.com.alura.exercicios.controladores.Produto;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Series;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao com getter e setters");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Meu filme dura: "+meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliacao :"+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Series Lost = new Series();

        Lost.setNome("Lost a Serie");
        Lost.setEpisodiosPorTemporada(10);
        Lost.setTemporadas(10);
        Lost.setMinutosPorEpisodio(180);
        Lost.setAtiva(false);
        Lost.setAnoDeLancamento(2002);
        Lost.avalia(10);
        Lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao par maratonar Lost: "+Lost.getDuracaoEmMinutos());

        Filme meuFilme1 = new Filme();
        meuFilme1.setNome("Avatar");
        meuFilme1.setAnoDeLancamento(2023);
        meuFilme1.setDuracaoEmMinutos(200);
        Lost.mostrarInformacoesSeries();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        /// //////
        calculadora.inclui(meuFilme1);
        calculadora.inclui(Lost);
        System.out.println("calculando o total: "+calculadora.getTempoTotal());





    }
}