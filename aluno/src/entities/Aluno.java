package entities;

public class Aluno {

    private int matricula;
    private String nome;
    private double p, t, media;

    public Aluno(){
    }
    public Aluno(int matricula, String nome, double p, double t){
        setMatricula(matricula);
        setNome(nome);
        setP(p);
        setT(t);
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setP(double p){
        if(p>0){
            this.p= p;
        }else {
            this.p = 0;
        }
    }
    public void setT(double t){
        if (t > 0) {
            this.t = t;
        }else {
            this.t = 0;
        }
    }
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public double getP(){
        return p;
    }
    public double getT(){
        return t;
    }
    public void calculaMedia(double pesoP, double pesoT){
        media = p * pesoP + t * pesoT;
    }
    public void calculaMedia(){
        media = (p+t)/2;
    }
    public void situacao(){
        if(media>6){
            System.out.printf("Aluno aprovado com média: %4.2f\n", media);
        }else{
            System.out.printf("Aluno reprovado com media:  %4.2f\n", media);
        }
    }
}
