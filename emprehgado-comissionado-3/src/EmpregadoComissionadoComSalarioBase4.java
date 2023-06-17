public class EmpregadoComissionadoComSalarioBase4 extends EmpregadoComissionado3 {

    private String nome;
    private String sobrenome;
    private String cpf;
    private double salarioBase;
    private double vendasSemanais;
    private double porcentagemDeComissao;

    public EmpregadoComissionadoComSalarioBase4(String n, String s, String ncpf, double vendas, double porc, double salario) {
        // chamada explícita ao construtor da super classe
        super(n, s, ncpf, vendas, porc);
        setSalarioBase(salario);
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String ncpf){
        this.cpf = ncpf;
    }

    public String getCpf(){
        return cpf;
    }


    public void setSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcula() {
        return (vendasSemanais * porcentagemDeComissao) + getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalário Base: " + getSalarioBase();
    }
}
