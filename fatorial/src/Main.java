import java.util.Scanner;

/*
Receba um número inteiro. Calcule e mostre o seu fatorial
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();

        int fatorial = 1;
        for(int i = x; i>=1; i--) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d.%n", x, fatorial);
        sc.close();
    }
}