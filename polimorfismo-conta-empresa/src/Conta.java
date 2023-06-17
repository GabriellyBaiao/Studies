public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(){

    }

    public Conta(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double saque(double x){
        return this.saldo = saldo - x;
    }

    public double deposito(double x){
        return this.saldo += x;
    }

    public String toString() {
        return "Número: " + this.numero
                + "Titular: " + this.titular
                + "Saldo: " + this.saldo;
    }
}

