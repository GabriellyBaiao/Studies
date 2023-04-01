import entities.Aluno;

public class AppAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(1);
        aluno1.setNome("Gabrielly");
        aluno1.setP(10);
        aluno1.setT(8);
        System.out.printf("A matrícula do(a) aluno(a) é: %d\n", aluno1.getMatricula());
        System.out.printf("O nome do aluno é: %s\n", aluno1.getNome());
        System.out.printf("A nota da prova do aluno é: %4.2f\n", aluno1.getP());
        System.out.printf("A nota de trabalho do aluno é: %4.2f\n", aluno1.getT());
        aluno1.calculaMedia(0.6, 0.4);
        aluno1.situacao();

        Aluno aluno2 = new Aluno(2, "Jorge",8, 10);
        System.out.printf("\n\nA matrícula do aluno é: %d\n", aluno2.getMatricula());
        System.out.printf("O nome do aluno é: %s\n", aluno2.getNome());
        System.out.printf("A nota de prova do aluno é: %4.2f\n", aluno2.getP());
        System.out.printf("A nota de trabalho do aluno é: %4.2f\n", aluno2.getT());
        aluno2.calculaMedia();
        aluno2.situacao();
    }
}
