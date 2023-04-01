import java.util.Locale;
import java.util.Scanner;

/*
Esse programa recebe informações sobre a altura e sexo de indivíduos e calcula o peso ideal para cada um deles.
O usuário deve informar o sexo do indivíduo digitando 1 para homem ou 2 para mulher, seguido da altura em metros.
O programa continuará executando até que a altura informada seja igual a 0. O cálculo do peso ideal é feito de acordo com as seguintes fórmulas: para homens, 72.7 * altura - 58, e para mulheres, 62.1 * altura - 44. Se o sexo informado for inválido, o programa exibirá uma mensagem de erro. Ao final da execução,
caso tenha havido ao menos uma mulher informada, será exibida a média de altura entre as mulheres.
 */
public class PesoIdeal2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double alt = 1, somaAltMulher = 0, mediaAltMulher = 0;
        int sexo, numMulher = 0;
        while (alt != 0) {
            System.out.println("Sexo:");
            System.out.println("1 - Homem");
            System.out.println("2 - Mulher");

            sexo = input.nextInt();

            System.out.println("Altura:");

            alt = input.nextDouble();

            if (alt == 0) {
                break;
            }

            if (sexo == 1) {
                System.out.printf("O peso ideal é: %6.2f kg\n", 72.7 * alt - 58);
            } else if (sexo == 2) {
                System.out.printf("O peso ideal é: %6.2f kg\n", 62.1 * alt - 44);
                   somaAltMulher += alt;
                   numMulher++;
                } else {
                    System.out.println("Sexo inválido");
                }
            }

            if (numMulher != 0) {
                mediaAltMulher = somaAltMulher / numMulher;
                System.out.printf("A media de altura entre as mulheres é de: %5.2f\n", mediaAltMulher);
            }

            input.close();
        }
    }