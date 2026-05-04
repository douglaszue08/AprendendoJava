package br.com.alura.exercicios.controladores;

public class Produto {

    private String nome;
    private double preco;
    private double desconto;

    public String getNome() {
        return nome;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void aplicarDesconto()
    {
        if(getPreco()>=50){
           preco = preco - desconto;
           System.out.println( getPreco() + " com Desconto aplicado com sucesso");
        }else
            System.out.println(getPreco() + " nao tem Desconto!!!");
    }

}
