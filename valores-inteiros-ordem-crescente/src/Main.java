import java.util.Scanner;

/*
Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.
 */
public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Entre com 2 valores inteiros: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      if(num1 > num2){
          System.out.println(num1 + " " + num2);
      } else{
          System.out.println(num2 + " " + num1);
      }
      sc.close();
    }
}