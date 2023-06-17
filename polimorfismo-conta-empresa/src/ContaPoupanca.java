public class ContaPoupanca extends Conta {

    private double taxaDeJuros;


    public ContaPoupanca(String titular, int numero, double saldo, double taxaDeJuros){
        super(titular, numero, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros(){
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros){
        this.taxaDeJuros = taxaDeJuros;
    }

    public double atualizaSaldo(){
        double valorCorrigido = this.getSaldo() * this.getTaxaDeJuros();
        this.setSaldo(valorCorrigido);
        return valorCorrigido;
    }
}
