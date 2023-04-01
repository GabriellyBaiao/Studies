import java.util.Scanner;

/*
Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.

 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Entre com os 4 valores: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();

        if(num4 < num1){
            System.out.println(num4 + " " + num1 + " " + num2 + " " + num3);
        } else if (num4 < num2){
            System.out.println(num1 + " " + num4 + " " + num2 + " " + num3);
        } else if (num4 < num3) {
            System.out.println(num1 + " " + num2 + " " + num4 + " " + num3);
        } else {
            System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        }
        sc.close();
    }
}