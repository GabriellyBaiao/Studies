package poo.aula3.atividade.exercicio3;


import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, s, d;
        do {
            System.out.print("Digite sua conta  com até 6 dígitos: ");
            n = input.nextInt();
        }while(n<0);

        d = n;
        s = 0;

        while (d != 0)
        {
            s += (d % 10);
            d /= 10;
        }
        System.out.printf("\nConta Bancária: %.6f%", n, s%10);

        }
}