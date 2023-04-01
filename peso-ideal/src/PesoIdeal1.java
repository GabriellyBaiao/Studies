import java.util.Scanner;

public class PesoIdeal1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double alt = 1, somaAltMulher = 0, mediaAltMulher = 0;
        int sexo, numMulher = 0;

        while(alt!=0){
            System.out.printf("Sexo:\n1 - Homem\n2 - Mulher\n");
            sexo = input.nextInt();
            System.out.println("Altura: \n");
            alt = input.nextDouble();
            if(alt!=0){
                switch (sexo){
                    case1:System.out.printf("O peso ideal é: %6.2f kg\n",72.7 * alt - 58);
                    break;
                    case2:System.out.printf("O peso ideal é: %6.2f kg\n", 62.1 * alt-44);
                    somaAltMulher += alt;
                    numMulher ++;
                    break;
                    default:
                        System.out.printf("Sexo inválido\n");
                }
            }
        }
        if(numMulher!= 0){
            mediaAltMulher = somaAltMulher/numMulher;
            System.out.printf("A media de altura entre as mulheres é de: %5.2f\n", mediaAltMulher;
            System.exit(0);
        }
    }
}