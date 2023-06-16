package com.aplicattion;

public class Main {

    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.consumoCombustivel= 100;
        van.capCombustivel = 0.2;

        System.out.println(van);
    }
    
}
