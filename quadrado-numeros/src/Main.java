import java.util.Scanner;

/*
Calcule e mostre o quadrado dos números entre 10 e 150.
 */
public class Main {
    public static void main(String[] args) {

       for(int i = 10 ; i<150; i++){
           int quadrado = i * i;
           System.out.println("O quadrado de " + i + " é " + quadrado);
       }
    }
}