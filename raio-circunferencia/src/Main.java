import java.util.Locale;
import java.util.Scanner;

/*
Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o raio: ");
        double raio = sc.nextDouble();

        double comprimento = 2 * Math.PI * raio;
        System.out.printf("Comprimento da circunferência é: %.2f%n", comprimento);

        sc.close();
    }
}