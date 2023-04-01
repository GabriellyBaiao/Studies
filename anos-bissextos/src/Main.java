import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
idade em anos, meses e dias, considerando os anos bissextos.

 */
public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a data de nascimento (ano, mês, dia):");
            int anoNasc = sc.nextInt();
            int mesNasc = sc.nextInt();
            int diaNasc = sc.nextInt();

            System.out.println("Digite a data atual (ano, mês, dia):");
            int anoAtual = sc.nextInt();
            int mesAtual = sc.nextInt();
            int diaAtual = sc.nextInt();

            LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
            LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);

            Period periodo = Period.between(dataNasc, dataAtual);

            int anos = periodo.getYears();
            int meses = periodo.getMonths();
            int dias = periodo.getDays();

            System.out.printf("Idade: %d anos, %d meses e %d dias%n", anos, meses, dias);
    }
}