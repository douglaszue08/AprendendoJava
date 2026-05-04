package br.com.alura.exercicios.controladores;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void maiorIdade() {
        if ( idade < 18){
            System.out.println(getNome() + " É de menor ");
        }else
            System.out.println(getNome() + " é de maior ");
    }

}