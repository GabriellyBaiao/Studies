import java.util.Scanner;

/*
Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
duração (minutos). Calcule e mostre a velocidade média em km/h.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Recebe o número de voltas, a extensão do circuito em metros e o tempo de duração em minutos
        System.out.print("Digite o número de voltas: ");
        int voltas = sc.nextInt();

        System.out.print("Digite a extensão do circuito em metros: ");
        int extensao = sc.nextInt();

        System.out.print("Digite o tempo de duração em minutos: ");
        int tempo = sc.nextInt();

        // Calcula a distância percorrida em km
        double distancia = voltas * extensao / 1000.0;

        // Calcula a velocidade média em km/h
        double velocidadeMedia = distancia / (tempo / 60.0);

        // Exibe o resultado
        System.out.printf("A velocidade média foi de %.2f km/h.%n", velocidadeMedia);
    }
}