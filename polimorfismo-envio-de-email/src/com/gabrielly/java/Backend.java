package com.gabrielly.java;

public class Backend extends Knowledge {

    public Backend(String nome){
        this.nome = nome;
    }

    @Override
    public void emailSender(){
        System.out.println("Você foi classificado(a) como desenvolver(a) Backend, entraremos em contato");
    }
}

