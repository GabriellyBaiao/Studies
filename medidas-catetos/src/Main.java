import java.util.Scanner;

/*
Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa
 */
public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o cateto1: ");
       int cateto1 = sc.nextInt();

       System.out.println("Digite o cateto2: ");
       int cateto2 = sc.nextInt();

       double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("A hipotenusa do triângulo retângulo é %.2f%n", hipotenusa);
        sc.close();
    }
}