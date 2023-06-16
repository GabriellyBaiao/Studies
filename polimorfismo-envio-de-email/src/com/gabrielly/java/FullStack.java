package com.gabrielly.java;

public class FullStack extends Knowledge {

    public FullStack(String nome){
        this.nome = nome;
    }

    @Override
    public void emailSender() {
        System.out.println("Você foi classificado(a) como desenvolver(a) FullStack, entraremos em contato");
    }
}
