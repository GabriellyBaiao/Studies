import java.util.Scanner;

/*
Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        double soma = 0.0;
        for(int i = 1; i <= x; i++){
            soma += 1.0 / i;
        }
        System.out.printf("A soma da série 1 + 1/2 + 1/3 + ... + 1/%d é %.2f", x, soma);
        sc.close();
    }
}