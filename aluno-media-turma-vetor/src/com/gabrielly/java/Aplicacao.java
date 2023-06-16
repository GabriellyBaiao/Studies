package com.gabrielly.java;

public class Aplicacao {

        public static void main(String[] args) {
            Quadrilatero quadrilatero1 = new Retangulo(5, 3);
            Quadrilatero quadrilatero2 = new Quadrado(4);
            Quadrilatero quadrilatero3 = new Paralelogramo(6, 2, 30);

            System.out.println("Área do retângulo: " + quadrilatero1.calcularArea());
            System.out.println("Área do quadrado: " + quadrilatero2.calcularArea());
            System.out.println("Área do paralelogramo: " + quadrilatero3.calcularArea());
        }
    }
