import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sInput = new Scanner(System.in);
        Scanner nInput = new Scanner(System.in);

        int tam, i, anoFabr, anoModelo, numPortas, numEixos;
        double capacidade, valor;
        String tipo, modelo, placa;

        System.out.println("Digite o tamanho da frota: ");
        tam = nInput.nextInt();
        Veiculo frota[] = new Veiculo[tam];

        for (i = 0; i < tam; i++) {
            System.out.println("Tipo do " + (i + 1) + "Veiculo (a - auto / c - caminhão): ");
            tipo = sInput.nextLine();

            if (!tipo.equalsIgnoreCase("a") && !tipo.equalsIgnoreCase("c")) {
                System.out.println("Tipo não previsto");
            } else {
                System.out.println("Modelo: ");
                modelo = sInput.nextLine();
                System.out.println("Placa: ");
                placa = sInput.nextLine();
                System.out.println("Ano fabricação: ");
                anoFabr = nInput.nextInt();
                System.out.println("Valor: ");
                valor = nInput.nextDouble();

                if (tipo.equalsIgnoreCase("a")) {
                    System.out.println("Ano modelo: ");
                    anoModelo = nInput.nextInt();

                    System.out.println("Portas: ");
                    numPortas = nInput.nextInt();

                    frota[i] = new Carro(modelo, placa, anoFabr, anoModelo, numPortas, valor);
                } else if (tipo.equalsIgnoreCase("c")) {
                    System.out.println("Capacidade (toneladas): ");
                    capacidade = nInput.nextDouble();
                    System.out.println("Num de Eixos: ");
                    numEixos = nInput.nextInt();
                    frota[i] = new Caminhao(modelo, placa, anoFabr, capacidade, numEixos, valor);
                } else {
                    frota[i] = new Veiculo(modelo, placa, anoFabr, valor);
                }
            }
        }

        for (i = 0; i < tam; i++) {
            System.out.println("Veiculo n.o " + (i + 1));
            if (frota[i] != null)
                frota[i].imprime();
            System.out.println();
        }
    }
}