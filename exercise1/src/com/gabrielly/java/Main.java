package com.gabrielly.java;

import entities.NumeroInteiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int valor = input.nextInt();

        NumeroInteiro numero = new NumeroInteiro(valor);

        System.out.println("O número " + numero.getValor() + " é par? " + numero.ehPar());
        System.out.println("O número " + numero.getValor() + " é primo? " + numero.ehPrimo());
        System.out.println("O fatorial de " + numero.getValor() + " é " + numero.fatorial());

        input.close();
    }
}

