import java.time.LocalDate;

public class Principal1 {

    static void main(String[] args) {
        pessoa p1 = new pessoa();
        p1.idade = 20;
        p1.nome = "Joao";
        p1.imprimir();

        /*calculadora p2 = new calculadora();
        p2.calcular();*/

        musica p3 = new musica();
        p3.avalia(3.4);
        p3.avalia(4.5);
        p3.avalia(5.6);
        p3.avalia(10.0);
        System.out.println("total de avalicoes= "+p3.somaAvaliacoes);
        System.out.println("Soma de avalicoes= "+p3.avaliacao);
        System.out.println("A media das notas é "+ p3.pegaMedia());

        carro c1 = new carro();
        c1.anoAtual = LocalDate.now().getYear();
        System.out.println(c1.anoAtual);
        c1.fichaTecnica();


        aluno al1 = new aluno();
        al1.nome = "Aluno";
        al1.idade = 20;
        al1.imprimirAluno();
    }

}
