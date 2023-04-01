import java.util.Scanner;
/*
Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 números inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int maior, menor;

        if(n1>n2){
            maior = n1;
            menor = n2;
        } else {
            menor = n2;
            maior = n1;
        }
        if(maior % menor == 0) {
            System.out.printf("%d é múltiplo de %d", maior, menor);
        } else {
            System.out.printf("%d não é mútiplo de %d", maior, menor);
        }
        sc.close();
    }
}