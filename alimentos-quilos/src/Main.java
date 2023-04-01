/*
Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alimento em quilos: ");
        double quantidadeAlimentoKg = sc.nextDouble();

        // Convertendo a quantidade de alimento para gramas
        double quantidadeAlimentoG = quantidadeAlimentoKg * 1000;

        // Calculando a duração em dias do alimento
        double duracaoAlimentoDias = quantidadeAlimentoG / 50;

        // Mostrando o resultado
        System.out.printf("O alimento irá durar %.1f dias, considerando o consumo diário de 50g por pessoa.", duracaoAlimentoDias);

        sc.close();

    }
}