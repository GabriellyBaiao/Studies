package br.com.vivo;

public class Funcionario {


    protected String nome, mail;
    protected int idade;

    public Funcionario(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
    }

    public Funcionario(String nome, String mail, int idade) {
        this.nome =  nome;
        setMail(mail);
        setIdade(idade);
    }

    public void setMail(String mail ){
        this.mail = mail;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida!");
        }
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + mail);
    }
}
