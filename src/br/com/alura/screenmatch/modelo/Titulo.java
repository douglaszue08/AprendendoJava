package br.com.alura.screenmatch.modelo;

public class Titulo {


    ////////////// atributos/////////////////

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    //variavel privada
    private double somaDasAvaliacoes;
    //variavel privada
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //////////////////// Metodos///////////////////

    public String getNome() {
        return nome;
    }

    ////// get - METODOS ACESSO (ACESSORES) que permitir " LER " o  valor de atributo privado////
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    ///  set - METODOS ACESSO (ACESSORES) que permitir q " INCLUA " valor de atributo privado///
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    ///
    ///
    ///
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
