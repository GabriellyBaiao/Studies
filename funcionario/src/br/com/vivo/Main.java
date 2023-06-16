package br.com.vivo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Funcionario[] funcionarios = new Funcionario[3];

      funcionarios[0] = new Funcionario("Joao", "joao@",21);
      funcionarios[1] = new Instrutor("gabis","gabi.iz",27, "Programação avançada");
      funcionarios[2] = new Programador("Rafael Akio", "rafa@", "python");

      for(Funcionario funcionario: funcionarios){
          funcionario.exibeDados();
          System.out.println("--------------------------");
      }
    }
}
