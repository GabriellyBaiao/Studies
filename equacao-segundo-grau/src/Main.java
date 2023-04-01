import java.util.Locale;
import java.util.Scanner;

/* Receba os coeficientes A, B e C de uma equação do 2º grau
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são x1 = %.2f e x2 = %.2f", x1, x2);
        }
        sc.close();
    }
}