public class ContaEmpresa extends Conta {

    private double limiteEmprestimo;

    public ContaEmpresa(String titular, int numero, double saldo, double limiteEmprestimo){
        super(titular, numero, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo(){
        return this.limiteEmprestimo = limiteEmprestimo;
    }

    public void setLimiteEmprestimo(){
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double emprestimo(double valorEmprestimo) throws Exception {
        var valida = validaEmprestimo(valorEmprestimo);
        if(valida == 0) {
            throw new Exception("O empréstimo não atendeu as condições necessárias");
        } else {
            return this.getSaldo();
        }
    }

    public double validaEmprestimo(double valorEmprestimo) {
        if(valorEmprestimo < this.getLimiteEmprestimo() && valorEmprestimo > 0) {
            return this.getSaldo() + valorEmprestimo;
        } else {
            return 0;
        }
    }
}

