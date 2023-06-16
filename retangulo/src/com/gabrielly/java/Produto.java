package com.gabrielly.java;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(){
    }

    public Produto(int c, String n, double p) {

        this.codigo = c;
        this.nome = n;
        this.preco = p;
    }
    public void rebaixarPreco(){
         preco = preco * 0.9;
    }
    public void rebaixarPreco(double porcent){

        preco = preco - porcent / 100 * preco;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double p) {

        if(p>0)
            this.preco = p;
        else
            this.preco = 0;
    }

}
