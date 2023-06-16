package br.com.vivo.application;

import br.com.vivo.entities.Account;
import br.com.vivo.entities.BussinesAccount;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

       Account acc = new BussinesAccount(111, "Teste", 1.14, 1.19);

       double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
       acc.deposit(valorDeposito);
       JOptionPane.showMessageDialog(null,"O valor depositado foi de: " + valorDeposito);
       

    }
}
