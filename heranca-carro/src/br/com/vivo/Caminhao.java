package br.com.vivo;

public class Caminhao extends Veiculo {

    private double capacidade;
    private int numEixos;

    public Caminhao(String modelo, String placa, int anoFabr, double capacidade, int numEixos, double valor) {
        super(modelo, placa, anoFabr, valor);
        setCapacidadeCarga(capacidade);
        setNumEixos(numEixos);
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidade = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidade;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void imprime() {
        System.out.printf("\nVeiculo: %s\nPlaca: %7s\n", getModelo(), getPlaca());
        System.out.printf("\nFabr: %4d\nCapacidade de carga: %.2f toneladas\nNum de eixos: %d\nValor: R$ %.2f\n", getAnoFabr(), getCapacidadeCarga(), getNumEixos(), getValor());
    }
}
