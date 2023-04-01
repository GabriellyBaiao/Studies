import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/*
Receba 2 valores reais. Calcule e mostre o maior deles.
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Recebendo os valores do usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        // Verificando qual é o maior número
        double maior;
        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }

        // Mostrando o resultado
        System.out.printf("O maior número é %.2f.", maior);

        sc.close();
    }
}