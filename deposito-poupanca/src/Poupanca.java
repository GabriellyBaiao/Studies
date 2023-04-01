import java.util.Locale;
import java.util.Scanner;

/*Receba o valor de um depósito em poupança. Calcule e mostre o valor
após 1 mês de aplicação sabendo que rende 1,3% a. m.*/
public class Poupanca {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do depósito em poupança R$: ");
        double deposito = sc.nextDouble();

        double rendimento = deposito * 0.013;
        double valorFinal = deposito + rendimento;

        System.out.printf("O valor após 1 mês de aplicação é: R$ %.2f%n", valorFinal);
        sc.close();
    }
}