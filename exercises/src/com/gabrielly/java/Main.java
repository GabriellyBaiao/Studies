package com.gabrielly.java;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno(1, "Gabi", 10, 10);
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Prova: " + aluno1.getProva());
        System.out.println("Trabalho: " + aluno1.getTrabalho());
        aluno1.calculaMedia();
        aluno1.situacao();

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(1);
        aluno2.setNome("Gabrielly");
        aluno2.setProva(10);
        aluno2.setTrabalho(8);
        System.out.printf("\n\nA matrícula do(a) aluno(a) é: %d\n", aluno2.getMatricula());
        System.out.printf("O nome do aluno é: %s\n", aluno2.getNome());
        System.out.printf("A nota da prova do aluno é: %4.2f\n", aluno2.getProva());
        System.out.printf("A nota de trabalho do aluno é: %4.2f\n", aluno2.getTrabalho());
        aluno1.calculaMedia(0.6, 0.4);
        aluno1.situacao();
    }
}