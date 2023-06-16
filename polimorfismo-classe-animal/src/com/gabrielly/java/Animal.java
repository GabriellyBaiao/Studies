package com.gabrielly.java;

public abstract class Animal{

    String nome;

    public Animal(String nome){
        this.nome = nome;
    }
    public void alimentar(){
        System.out.println("Alimentar animal genérico.");
    }
}
