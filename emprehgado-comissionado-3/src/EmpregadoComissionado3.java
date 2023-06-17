public class EmpregadoComissionado3 {

    private String nome;
    private String sobrenome;
    private String cpf;
    private double vendasSemanais;
    private double porcentagemDeComissao;

    public EmpregadoComissionado3(String n, String s, String ncpf, double vendas, double porc) {
        nome = n;
        sobrenome = s;
        cpf = ncpf;
        setVendasSemanais(vendas);
        // valida e armazena as vendas brutas
        setPorcentagemDeComissao(porc);
        // valida e armazena a taxa de comissao
    }

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String s) {
        sobrenome = s;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setCpf(String ncpf) {
        cpf = ncpf;
    }

    public void setVendasSemanais(double vendas) {
        vendasSemanais = (vendas < 0.0) ? 0.0 : vendas;
    }

    public double getVendasSemanais() {
        return vendasSemanais;
    }

    public void setPorcentagemDeComissao(double porc) {
        porcentagemDeComissao = (porc > 0.0 && porc < 1.0) ? porc : 0.0;
    }

    public double getPorcentagemDeComissao() {
        return porcentagemDeComissao;
    }

    public double calcula() {
        return (vendasSemanais * porcentagemDeComissao);
    }

    public String toString() {
        return "Nome do empregado: " + nome + " " + sobrenome +
                "\nCPF: " + cpf + "\nVendas Semanais: " + vendasSemanais +
                "\nPorcentagem de Comissão: " + porcentagemDeComissao;
    }
}
