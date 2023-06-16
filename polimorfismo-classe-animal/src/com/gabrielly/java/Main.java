package com.gabrielly.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cachorro golias = new Cachorro("Golias");
        Gato boris = new Gato("Boris");
        Papagaio louro = new Papagaio("Louro");
        Hamster hamtaro = new Hamster("Hamtaro");

        List<Animal>animais = new ArrayList<>();
        animais.add(golias);
        animais.add(boris);
        animais.add(hamtaro);

        for(Animal animal: animais){
             animal.alimentar();
        }
    }
}
