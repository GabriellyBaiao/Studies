import java.util.Scanner;

/*
Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o tipo de investimento (1 = poupança e 2 = renda fixa): ");
        int tipo = sc.nextInt();

        System.out.println("Entre com o valor do investimento: ");
        double investimento = sc.nextDouble();

        if (tipo == 1) {
            investimento *= 1.03;
        } else if (tipo == 2) {
            investimento *= 1.05;
        } else {
            System.out.println("Tipo de investimento inválido!.");
            return;
        }
        System.out.printf("O valor corrigido em 30 dias é de R$ %.2f.%n", investimento);
    }
}