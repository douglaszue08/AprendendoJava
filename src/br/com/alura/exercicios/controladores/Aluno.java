package br.com.alura.exercicios.controladores;

public class Aluno {
    private String nome;
    private int nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void calcularMedia(){
        if(getNota()>=5){
            System.out.println(getNota()+" você foi aprovado ");
        }else
            System.out.println(getNota()+" você foi reprovado ");
    }
}
