import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Titular: ");
        String titular = sc.nextLine();
        System.out.println("Digite Número: ");
        int numero = sc.nextInt();
        System.out.println("Digite o Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o tipo de conta: \n" +
                "1- Conta Poupança \n" +
                "2- Conta Empresa");
        int opcao = sc.nextInt();

        if(opcao == 1) {
            System.out.println("Digite a taxa de juros: ");
            double taxaDeJuros = sc.nextDouble();

            Conta contaPoupanca = new ContaPoupanca(titular, numero, saldo, taxaDeJuros);

            contaPoupanca.deposito(5000);
            contaPoupanca.saque(50);
            System.out.println("Saldo da empresa: " + contaPoupanca.getSaldo() + "\n"
                    + "Número: " + contaPoupanca.getNumero() + "\n" + "Titular: " + contaPoupanca.getTitular()
                    + "Limite Empréstimo: " + ((ContaPoupanca) contaPoupanca).getTaxaDeJuros());


        } else {
            System.out.println("Digite o limite do empréstimo: ");
            double limiteEmprestimo = sc.nextDouble();
            Conta contaEmpresa = new ContaEmpresa(titular, numero, saldo, limiteEmprestimo);

            contaEmpresa.saque(100);
            System.out.println("Saldo da empresa: " + contaEmpresa.getSaldo() + "\n"
                    + "Número: " + contaEmpresa.getNumero() + "\n" + "Titular: " + contaEmpresa.getTitular()
                    + "Limite Empréstimo: " + ((ContaEmpresa) contaEmpresa).getLimiteEmprestimo());

        }
    }
}
