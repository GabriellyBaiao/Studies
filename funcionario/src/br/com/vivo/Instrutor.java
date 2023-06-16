package br.com.vivo;

public class Instrutor extends Funcionario {


    private String disciplina;

    public Instrutor(String nome, String mail, int idade, String disciplina){
        super(nome, mail);
        setDisciplina(disciplina);
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibeDados(){
        super.exibeDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
