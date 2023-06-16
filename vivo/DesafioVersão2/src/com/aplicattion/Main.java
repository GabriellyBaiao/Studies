package com.aplicattion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        String name, email;
        int java, csharp, golang, javascript, vue, php;
        System.out.print("Digite seu nome: ");
        name = input.nextLine();
        System.out.print("Digite seu email: ");
        email = input.nextLine();
        System.out.print("Digite o nível de seu conhecimento em Java: ");
        java = input.nextInt();
        System.out.print("Digite o nível de seu conhecimento em C#: ");
        csharp = input.nextInt();
        System.out.print("Digite o nível de seu conhecimento em Golang: ");
        golang = input.nextInt();
        System.out.print("Digite o nível de seu conhecimento em Javascript: ");
        javascript = input.nextInt();
        System.out.print("Digite o nível de seu conhecimento em PHP: ");
        php = input.nextInt();
        System.out.print("Digite o nível de seu conhecimento em Vue :");
        vue = input.nextInt();

        if(java >= 7 && java <= 10 && csharp >=7 && csharp <= 10 && golang >=7 && golang<=10
                && javascript >= 7 && javascript <= 10 && vue >=7 && vue <=10 && php >= 7 && php <=10){
            System.out.println("\nVocê foi classificado(a) como desenvolvedor(a) Backend e Frontend");
        }else if(java>7 && java<=10 && csharp>=7 && csharp>10 && golang>=7 && golang<=10){
            System.out.println("\n Você foi classificado(a) como desenvolverdor(a) Backend");
        }else if(javascript>7 && javascript<=10 && vue>=7 && vue>10 && php>=7 && php<=10){
            System.out.println("\nVocê foi classificado(a) como desenvolverdor(a) Frontend");
        }else{
            System.out.println("\nVocê não foi classificado para nenhuma das áreas.");
        }
    }
}
