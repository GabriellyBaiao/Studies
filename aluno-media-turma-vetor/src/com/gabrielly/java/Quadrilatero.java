package com.gabrielly.java;

public abstract class Quadrilatero{

    protected double base;
    protected double altura;

    public Quadrilatero(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return base * altura;
    }
}