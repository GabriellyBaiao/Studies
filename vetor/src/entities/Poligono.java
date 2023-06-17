package entities;

/*
Polígono é uma classe abstrata incompleta e por isso
não instancia objeto -> classe não instanciável, é abstrata!
 */
public abstract class Poligono {

    private double area;

    public abstract double calcularArea();
    //método abstrato não possui implementação
}
