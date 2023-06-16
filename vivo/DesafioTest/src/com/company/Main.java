package com.company;


import javax.swing.*;

public class Main
{
    public static void main( String args[] )
    {
        String name, email;
        int java, csharp, golang, javascript,vue, php;

        name = JOptionPane.showInputDialog("Digite seu nome: ");
        email = JOptionPane.showInputDialog("Digite seu nível email: ");
        java = Integer.parseInt(JOptionPane.showInputDialog("Digite seu nível em Java: "));
        csharp = Integer.parseInt(JOptionPane.showInputDialog("Digite seu nível em C#: "));
        golang = Integer.parseInt(JOptionPane.showInputDialog("Digite o nível de seu conhecimento em Golang: "));
        javascript = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu nível de conhecimento em Javascript: "));
        vue = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu nível de conhecimento em VUE: "));
        php = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu nível de conhecimento em PHP: "));

        if(java>6 && csharp>6 && golang>6 && javascript>6 && vue>6 && php>6 ){
            JOptionPane.showMessageDialog(null,"Você é um(a) desenvolvedor(a) Backend e Frontend");
        }else if(javascript>6 && vue>6 && php>6){
            JOptionPane.showMessageDialog(null,"Você foi classificado(a) como Desenvolvedor(a) Frontend, entraremos em contato.");
        }else if(java>6 && csharp>6 && golang>6){
            JOptionPane.showMessageDialog(null,"Você foi classificado(a) como desenvolvedor(a) Backend");
        }else{
            JOptionPane.showMessageDialog(null, "Você não está qualificado para nenhuma das áreas");
        }

    }
}
