import java.util.Scanner;

/*Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.println("Entre com a largura: ");
        double largura = sc.nextDouble();
        System.out.println("Entre com a altura: ");
        double altura = sc.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.printf("VOLUME = %.2f%n", volume);

        sc.close();
    }
}