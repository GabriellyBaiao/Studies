import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do funcionário:");
            String nome = input.nextLine();

            System.out.println("Digite o e-mail do funcionário:");
            String mail = input.nextLine();

            System.out.println("Digite a idade do funcionário:");
            int idade = input.nextInt();
            input.nextLine(); // Limpar o buffer do teclado

            System.out.println("Digite a linguagem de programação do programador:");
            String linguagem = input.nextLine();

            System.out.println("Digite o sistema operacional do programador:");
            String sistOper = input.nextLine();

            funcionarios[i] = new Programador(nome, mail, idade, linguagem, sistOper);
        }

        System.out.println("Dados dos funcionários:");

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibeDados();
            System.out.println();
        }

        input.close();
    }
}