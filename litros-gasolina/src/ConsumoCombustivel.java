import java.util.Locale;
import java.util.Scanner;

/*
Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 */
public class ConsumoCombustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tempo do percurso em horas: ");
        double percusoHoras = sc.nextDouble();

        System.out.println("Digite a velocidade média (km/h): ");
        double velocidadeMedia = sc.nextDouble();

        double distanciaPercorrida = percusoHoras * velocidadeMedia;
        double litrosGastos = distanciaPercorrida / 12.0;

        System.out.printf("A quantidade de litros gastos em uma viagem é: %.1f%n", litrosGastos);
        sc.close();
    }
}