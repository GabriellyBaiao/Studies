import java.util.Locale;
import java.util.Scanner;

/*
Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber.
 */
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Recebendo os valores do usuário
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o valor por hora: R$");
        double valorPorHora = sc.nextDouble();

        System.out.print("Digite o percentual de desconto (ex: 10 para 10%): ");
        double percentualDesconto = sc.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numeroDependentes = sc.nextInt();

        // Calculando o salário bruto
        double salarioBruto = horasTrabalhadas * valorPorHora;

        // Calculando o desconto
        double desconto = salarioBruto * (percentualDesconto / 100);

        // Calculando o salário líquido
        double salarioLiquido = salarioBruto - desconto;

        // Acrescentando o valor dos dependentes
        salarioLiquido += (numeroDependentes * 100);

        // Mostrando o salário a receber
        System.out.printf("O salário a receber é R$%.2f.", salarioLiquido);

        sc.close();
    }
}