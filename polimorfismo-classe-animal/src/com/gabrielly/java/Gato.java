package com.gabrielly.java;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando " +nome+ " com whiskas");
    }
}
