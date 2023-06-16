package com.gabrielly.java.entities;

public class Carro extends Veiculo{

    private int numAssentos;
    private int numPortas;


    public Carro(String marca, String modelo, int ano, int numAssentos, int numPortas){
       super(marca, modelo, ano);
       this.numAssentos = numAssentos;
       this.numPortas = numPortas;
    }

    public void setNumAssentos(int numAssentos){
        this.numAssentos = numAssentos;
    }

    public int getNumAssentos(){
        return numAssentos;
    }

    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

    public int getNumPortas(){
        return numPortas;
    }
}

