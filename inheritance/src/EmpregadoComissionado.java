public class EmpregadoComissionado extends Object {

    private String nome;
    private String sobrenome;
    private String cpf;
    private double vendasSemanais;
    private double porcentagemComissao;

    public EmpregadoComissionado(String n, String s, String ncpf, double vendas, double porc){
        nome = n;
        sobrenome = s;
        cpf = ncpf;
        setVendasSemanais(vendas);
        setPorcentagemDeComissao(porc);
    }
    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String s){
        sobrenome = s;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setCpf(String n){
        cpf = n;
    }

    public String getCpf(){
        return cpf;
    }

    public void setVendasSemanais(double vendas){
        vendasSemanais = (vendas < 0.0) ? 0.0 : vendas;
    }

    public double getVendasSemanais(){
        return vendasSemanais;
    }

    public void setPorcentagemDeComissao(double porc){
        porcentagemComissao = (porc > 0.0 && porc < 1.0) ? porc : 0.0;
    }

    public double getPorcentagemComissao(){
        return porcentagemComissao;
    }

    public double calcula(){
        return vendasSemanais * porcentagemComissao;
    }

    public String toString(){
        return "Nome do empregado: " + nome + " " +
                sobrenome +
                "\nCPF: " + cpf +
                "\nVendas Semanais: " + vendasSemanais +
                "\nPorcentagem da comissão: " +
                porcentagemComissao;
    }
}
