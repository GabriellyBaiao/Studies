public class Funcionario {

    protected String nome;
    protected String mail;
    protected Integer idade;

    public Funcionario(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
    }

    public Funcionario(String nome, String mail, int idade) {
        this.nome = nome;
        this.mail = mail;
        this.idade = idade;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void exibeDados() {
        System.out.printf("Nome: %s\nEmail: %s\nIdade: %d", nome, mail, idade);
    }
}

