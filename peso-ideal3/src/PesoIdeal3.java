import java.util.Scanner;

public class PesoIdeal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alt = 1, somaAltMulher = 0, mediaAltMulher = 0;
        int sexo, numMulher = 0;

        while (alt != 0) {
            System.out.println("Sexo: ");
            System.out.println("1 - Homem");
            System.out.println("2 - Mulher");
            sexo = input.nextInt();
            System.out.println("Altura: ");
            alt = input.nextDouble();

            switch (sexo) {
                case 1:
                    System.out.printf("O peso ideal é: %6.2f kg\n", 72.7 * alt - 58);
                    break;
                case 2:
                    System.out.printf("O peso ideal é: %6.2f kg\n", 62.1 * alt - 44);
                    somaAltMulher += alt;
                    numMulher++;
                    break;
                default:
                    System.out.println("Sexo inválido");
                    break;
            }
        }

        if (numMulher != 0) {
            mediaAltMulher = somaAltMulher / numMulher;
            System.out.printf("A média de altura entre as mulheres é de: %.2f\n", mediaAltMulher);
        }

    }
}

