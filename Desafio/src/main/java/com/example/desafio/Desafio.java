package com.example.desafio;

import java.util.Scanner;

public class Desafio
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in);
        String name, email;
        int java, csharp, golang, javascript,vue, php;

        System.out.printf("Digite seu nome: ");
        name = input.nextLine();
        System.out.printf("Digite seu email: ");
        email = input.nextLine();
        System.out.printf("Digite o nível de seu conhecimento em Java: ");
        java = input.nextInt();
        System.out.printf("Digite o nível de seu conhecimento em C#: ");
        csharp = input.nextInt();
        System.out.printf("Digite o nível de seu conhecimento em GoLang: ");
        golang = input.nextInt();
        System.out.printf("Digite o nível de seu conhecimento em Javascript: ");
        javascript = input.nextInt();
        System.out.printf("Digite o nível de seu conhecimento em VUE: ");
        vue = input.nextInt();
        System.out.printf("Digite o nível de seu conhecimento em PHP: ");
        php = input.nextInt();

        if(java>6 && csharp>6 && golang>6 && javascript>6 && vue>6 && php>6 ){
            System.out.printf("Backend e Frontend");
        }else if(javascript>6 && vue>6 && php>6){
            System.out.printf("Você foi classificado como Desenvolvedor Frontend, entraremos em contato.");
        }else if(java>6 && csharp>6 && golang>6){
            System.out.printf("Backend");
        }else{
            System.out.printf("Você não está qualificado para nenhuma das áreas");
        }
        System.exit(0);
    }
}