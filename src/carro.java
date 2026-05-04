import java.time.LocalDate;

public class carro {
    String modelo;
    int ano = 1970;
    String cor;
    int dataHoje;
    int anoAtual;
    int anosDeUso;

    void fichaTecnica(){
       /* System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);*/
        anoAtual = LocalDate.now().getYear();
        anosDeUso = anoAtual - ano;
        System.out.println("Esse carro tem  "+ anosDeUso +" anos de uso");

        // System.out.println("o ano do carro: "+ano+" e tem "+ +" de uso!!!");

    }
}
