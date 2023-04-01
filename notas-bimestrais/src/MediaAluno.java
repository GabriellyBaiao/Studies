import java.util.Locale;
import java.util.Scanner;

/*
Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”
 */
public class MediaAluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as 4 notas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.printf("Média aritmética: %.1f%n", media);
        if(media >= 6.0){
            System.out.println("Aprovado.");
        }else if (media>=3.0 ){
            System.out.print("Exame.");
        } else {
            System.out.println("Retido.");
        }
        sc.close();
    }
}