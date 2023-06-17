package entities;

/*
  Classe concreta: instancia objetos - deve definir todos os métodos.
*/
public class  Quadrado extends Poligono {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}