import java.util.Scanner;

/* Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor de x: ");
        int  x = sc.nextInt();
        System.out.println("Entre com o valor de y: ");
        int  y = sc.nextInt();

        int aux = x;
        x = y;
        y = aux;
        System.out.println("Novo valor de x: " + x);
        System.out.println("Novo valor de y: " + y);
    }
}