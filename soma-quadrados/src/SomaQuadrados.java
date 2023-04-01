
/*Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.*/

import java.util.Scanner;

public class SomaQuadrados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com valor do primeiro nº: ");
        int n1 = sc.nextInt();
        System.out.println("Entre com o valor do segundo nº: ");
        int n2 = sc.nextInt();

        int soma = (n1 * n1) + (n2 * n2);
        System.out.println("Soma dos quadrados é: " + soma);

        sc.close();
    }
}