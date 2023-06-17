import java.util.Scanner;

public class ProgramaAlturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] alturas = new double[20];
        for(int i=0; i<alturas.length; i++){
            System.out.println("Digite a altura da pessoa " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0;
        for(double altura:alturas){
            somaAlturas += altura;
        }

        double mediaAlturas = somaAlturas / alturas.length;

        int countAcimaDaMedia = 0;
        for(double altura:alturas){
            if(altura > mediaAlturas){
                countAcimaDaMedia++;
            }
        }
        System.out.println("Média da altura das pessoas: " + mediaAlturas);
        System.out.println("Número de pessoas acima da média: " + countAcimaDaMedia);

        sc.close();
    }
}