package br.com.vivo;
/*
Classe abstrata não pode ser instanciada.
 */
public abstract class FormaGemetrica {

    protected int lados;

    public void setLados(int lados){

        if (lados<0){
            this.lados = 0;
        }
        else
            this.lados = lados;
    }

    public abstract double area();

    public void imprime(){
        System.out.println("Números de lados: " + lados);
        System.out.printf("ÁREA: " + area());
    }
}
