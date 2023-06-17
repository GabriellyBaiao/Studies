import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a. Vetor das letras vogais do alfabeto
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        // b. Vetor do número de dias em cada um dos meses do ano
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // c. Vetor da temperatura mínima e máxima de cada dia de uma semana
        double[] temperaturas = {20.5, 22.3, 18.9, 25.1, 23.7, 19.6, 21.8};

        // d. Matriz das três notas de cada aluno de uma turma com 40 matriculados
        double[][] notasAlunos = new double[40][3];

        // Solicitar entrada de notas dos alunos
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notasAlunos[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Exibir os elementos dos vetores
        System.out.println("Letras vogais do alfabeto:");
        for (char vogal : vogais) {
            System.out.print(vogal + " ");
        }

        System.out.println("\n\nNúmero de dias em cada mês do ano:");
        for (int dias : diasMeses) {
            System.out.print(dias + " ");
        }

        System.out.println("\n\nTemperaturas mínima e máxima de cada dia da semana:");
        for (double temperatura : temperaturas) {
            System.out.print(temperatura + " ");
        }

        System.out.println("\n\nNotas dos alunos:");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
