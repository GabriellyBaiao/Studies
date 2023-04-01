import java.util.Locale;
import java.util.Scanner;

/* Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado. */
public class CalcularAreaQuadrado {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double lado, area;
        System.out.print("Entre com o valor do lado do quadrado: ");
        lado = sc.nextDouble();
        area = lado*lado;

        System.out.println("A área do quadrado é: " + area);
    }
}