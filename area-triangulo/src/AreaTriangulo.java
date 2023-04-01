import java.util.Locale;
import java.util.Scanner;

/* Receba a base e a altura de um triângulo. Calcule e mostre a sua área */
public class AreaTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double area, base, altura;
        System.out.println("Entre com a base e altura: ");
        base = sc.nextDouble();
        altura = sc.nextDouble();
        area = (base * altura) /2;
        System.out.printf("AREA: %.2f%n",area);

        sc.close();
    }
}