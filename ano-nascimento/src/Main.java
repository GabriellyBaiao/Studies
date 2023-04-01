/*
Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Entre com o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Entre com o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade atual é: " + idade);

        int soma = idade + 17;
        System.out.print("Você tera daqui 17 anos, a idade de: " + soma);

    }
}