import java.util.Locale;
import java.util.Scanner;

/*Receba 2 números reais. Calcule e mostre a diferença desses valores*/

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite segundo numero: ");
        double num2 = sc.nextDouble();

        double diferenca = num1 - num2;

        System.out.printf("DIFERENÇA: %.2f%n", diferenca );
        sc.close();
    }
}