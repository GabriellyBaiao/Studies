import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[20];

        for(int i = 0; i < 20; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        ordenaArrayDouble(vetor);

        System.out.println("Digite o valor real a ser pesquisado: ");
        double valor = scanner.nextDouble();

        int posicao = buscaArrayDouble(vetor, valor);

        if (posicao == -1) {
            System.out.println("O valor " + valor + " não foi encontrado no vetor.");
        } else {
            System.out.println("O valor " + valor + " foi encontrado na posição " + posicao + " do vetor.");
        }
            }
            public static void ordenaArrayDouble(double[] arr) {
        double aux;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                if (arr[x] < arr[y]) {
                    aux = arr[y];
                    arr[y] = arr[x];
                    arr[x] = aux;
                }
            }
        }
    }
    public static int buscaArrayDouble(double[] arr, double valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}


