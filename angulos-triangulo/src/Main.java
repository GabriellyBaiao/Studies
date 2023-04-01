import java.util.Scanner;

/*
Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor do 1º ângulo em graus: ");
        double angulo1 = sc.nextDouble();
        System.out.printf("Digite o valor do 2º ângulo em graus: ");
        double angulo2 = sc.nextDouble();

        double angulo3 = 180 - angulo1 - angulo2;

        System.out.printf("O terceiro ângulo do triângulo tem o valor %.1f%n", angulo3);
        sc.close();
    }
}