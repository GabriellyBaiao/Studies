public class EmpregadoComissionadoComSalarioBase {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double vendasSemanais;
    private double porcentagemDeComissao;
    private double salarioBase;

    public EmpregadoComissionadoComSalarioBase(String n, String s, String ncpf, double vendas, double porc, double salario) {
        this.nome = n;
        this.sobrenome = s;
        this.cpf = ncpf;
        setVendasSemanais(vendas);
        setPorcentagemDeComissao(porc);
        setSalarioBase(salario);
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String s) {
        this.sobrenome = s;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setCpf(String ncpf) {
        this.cpf = ncpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setVendasSemanais(double vendas) {
        this.vendasSemanais = (vendas < 0.0) ? 0.0 : vendas;
    }

    public double getVendasSemanais() {
        return vendasSemanais;
    }

    public void setPorcentagemDeComissao(double porc) {
        this.porcentagemDeComissao = (porc > 0.0 && porc < 1.0) ? porc : 0.0;
    }

    public double getPorcentagemDeComissao() {
        return porcentagemDeComissao;
    }

    public void setSalarioBase(double salario) {
        this.salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcula() {
        return (vendasSemanais * porcentagemDeComissao) + salarioBase;
    }

    public String toString() {
        return "Nome do empregado: " + nome + " " +
                sobrenome +
                "\nCPF: " + cpf +
                "\nVendas Semanais: " + vendasSemanais +
                "\nPorcentagem da comissão: " +
                porcentagemDeComissao +
                "\nSalário base: " + salarioBase;
    }
}
