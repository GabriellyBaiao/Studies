public class Quadrado extends Poligono {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
