import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] temperaturasMaximas = new double[7];
        double[] temperaturasMinimas = new double[7];

        for(int i = 0; i<7; i++) {
            System.out.println("Dia " + (i+1));
            System.out.println("Digite a temperatura máxima: ");
            temperaturasMaximas[i] = sc.nextDouble();

            System.out.println("Digite a temperatura mínima: ");
            temperaturasMinimas[i] = sc.nextDouble();
        }
        System.out.println("\nTemperaturas da semana: ");
        for(int i = 0; i<7;i++){
            System.out.println("Dia " + (i+1) + ":");
            System.out.println("Temperatura máxima: " + temperaturasMaximas);
            System.out.println("Temperatura mínima: " + temperaturasMinimas);
        }
        sc.close();
    }

}