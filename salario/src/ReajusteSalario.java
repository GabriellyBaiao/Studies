import java.util.Locale;
import java.util.Scanner;

/*Receba o salário de um funcionário e mostre o novo salário com reajuste de 15% */
public class ReajusteSalario{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor do salario atual do funcionario: ");
        double salarioAtual = sc.nextDouble();

        double percentualReajuste = 15;
        double valorReajuste = salarioAtual * (percentualReajuste / 100);
        double novoSalario = salarioAtual + valorReajuste;

        System.out.printf("O salário com reajuste é: %.2f%n", novoSalario );

    }
}