package com.gabrielly.java;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentando " +nome+ " com ND");
    }
}
