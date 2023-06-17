package entities;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario seminario;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("------------------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminario == null) {
            System.out.println("## Seminário não cadastrado ##");
            return;
        }
        System.out.println("## Seminário cadastrado ##");
        System.out.println("Título: " + this.seminario.getTitulo());
        System.out.println("Local: " + this.seminario.getLocal().getEndereco());
        Aluno[] alunos = this.seminario.getAlunos();
        if (alunos == null || alunos.length == 0) {
            System.out.println("Nenhum aluno inscrito no seminário.");
            return;
        }
        System.out.println("*** Alunos ***");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
    }

    public String getNome() {
        return nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
