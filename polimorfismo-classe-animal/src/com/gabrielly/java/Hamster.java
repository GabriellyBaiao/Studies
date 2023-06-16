package com.gabrielly.java;

public class Hamster extends Animal{

    public Hamster(String nome) {
        super(nome);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando " + nome + " com ração.");
    }
}
