package com.gabrielly.java;


import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

    Vetor vetor = new Vetor(10);


    vetor.adiciona("Curso ");
    vetor.adiciona("elemento 2");
    vetor.adiciona("elemento 3");

    System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}

