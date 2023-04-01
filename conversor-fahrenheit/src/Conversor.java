import java.util.Locale;
import java.util.Scanner;

/*Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5. */

public class Conversor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor em Celsius: ");
        double celsius = sc.nextDouble();

        double  fahrenheit = (9*celsius+160) /5;
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit", celsius, fahrenheit);

        sc.close();
    }
}