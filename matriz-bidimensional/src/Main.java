import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int estante[][]= new int[4][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Prateleira " + (i+1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Compartimento " + (j+1) + ": ");
                estante[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Prateleira " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(estante[i][j] + " ");
            }
            System.out.println();
        }
    }
}
