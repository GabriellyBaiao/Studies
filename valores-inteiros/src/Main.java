import java.util.Scanner;

/*
Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menor valor
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 valores inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int maior, menor;
        if(n1>n2){
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }
        int diferença = n1-n2;
        System.out.printf("A diferença entre %d e %d é %d", maior, menor, diferença);

        sc.close();
    }
}