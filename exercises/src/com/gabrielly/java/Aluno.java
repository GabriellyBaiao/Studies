package com.gabrielly.java;

public class Aluno {

    private String nome;
    private int matricula;
    private double prova, trabalho, media;

    public Aluno(){

    }
    public Aluno(int matricula, String nome, double prova, double trabalho){
        setMatricula(matricula);
        setNome(nome);
        setProva(prova);
        setTrabalho(trabalho);
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public  void setNome(String nome){
        this.nome = nome;
    }
    public void setProva(double prova){
        if(prova>0){
            this.prova = prova;
        }else {
            this.prova = 0;
        }
    }
    public void setTrabalho(double trabalho){
        if(trabalho>0){
            this.trabalho = trabalho;
        }else {
            this.trabalho = 0;
        }
    }
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public double getProva(){
        return prova;
    }
    public double getTrabalho(){
        return trabalho;
    }

    public void calculaMedia(double pesoP, double pesoT){
        media = prova * pesoP + trabalho * pesoT;
    }
    public void calculaMedia(){
        media = (prova + trabalho)/2;
    }
    public void situacao(){
        if(media>7){
            System.out.printf("Aluno aprovado com média %3.2f", media);
        }else{
            System.out.printf("Reprovado com média %3.2f", media);
        }
    }
}
