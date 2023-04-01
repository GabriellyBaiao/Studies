import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        double notas[][] = new double[3][2];
        Scanner sc = new Scanner(System.in);
        double media;
        int aluno, nota;

        for(aluno=0; aluno<3; aluno++){
            for(nota=0; nota<2; nota++)
            {
                System.out.println("Aluno " + (aluno+1) + ": digite a" + " (nota+1)" + " nota: ");
                notas[aluno][nota] = sc.nextDouble();
            }
            System.out.println();
            System.out.println("Consultando as notas de um aluno");
            System.out.println("Digite o n.o do aluno (1-3): ");
            aluno = sc.nextInt();

            System.out.println("Aluno: " + aluno);
            System.out.println("Nota 1: " + notas[aluno-1][0]);
            System.out.println("Nota 2: " + notas[aluno-1][1]);
            media = (notas[aluno-1][0] + notas[aluno-1][1]/2);
            System.out.println("Media: " + media);
        }
    }
}