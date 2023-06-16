package com.gabrielly.java;

public class Papagaio extends Animal{

    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando " + nome + " com semente.");
    }
}
