package com.gabrielly.java;

class Paralelogramo extends Quadrilatero {
    private double angulo;

    public Paralelogramo(double base, double altura, double angulo) {
        super(base, altura);
        this.angulo = angulo;
    }

    public double calcularArea() {
       return base * altura * Math.sin(Math.toRadians(angulo));
    }
}

