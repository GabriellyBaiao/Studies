import java.util.Scanner;

/*
Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro: ");
        int x = sc.nextInt();

        if(x % 2 == 0 && x % 3 == 0){
            System.out.println(x + " esse valor é divisivel por 2 e 3.");
        } else {
            System.out.println(x + " não é divisível por 2 e 3.");
        }
        sc.close();
    }
}