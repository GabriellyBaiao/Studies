package br.com.vivo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] alturas = new double[20];

        for(int i = 0; i< alturas.length; i++){
        System.out.println("Digite a altura da pessoa: " + (i+1) + ": ");
        alturas[i] = sc.nextDouble();
      }

        double somaAlturas = 0;
        for(double altura : alturas){
            somaAlturas += altura;
        }
        double mediaAlturas = somaAlturas / alturas.length;

        int countAcimaMedia = 0;
        for(double altura : alturas){
            if(altura > mediaAlturas){
                countAcimaMedia++;
            }
        }

        System.out.println("Médias das alturaS: " + mediaAlturas);
        System.out.println("Número de pessoas acima da média: " + countAcimaMedia);

        sc.close();
    }
}
