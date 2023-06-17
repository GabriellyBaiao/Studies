import entities.Aluno;
import entities.Local;
import entities.Professor;
import entities.Seminario;

public class Main {
    public static void main(String[] args) {

       Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca","pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar onepiece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.imprime();
    }
}