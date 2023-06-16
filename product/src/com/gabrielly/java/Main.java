package com.gabrielly.java;

import com.gabrielly.java.entities.Carro;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Carro
        Carro carro = new Carro("Toyota", "Corolla", 2021, 2, 4);

        // Exibe as informações do carro em uma mensagem de diálogo
        String mensagem = "Marca: " + carro.getMarca() + "\n"
                + "Modelo: " + carro.getModelo() + "\n"
                + "Ano: " + carro.getAno() + "\n"
                + "Número de portas: " + carro.getNumPortas() + "\n"
                + "Número de assentos: " + carro.getNumAssentos();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
