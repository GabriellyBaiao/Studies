import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        EmpregadoComissionadoComSalarioBase4 empregado = new EmpregadoComissionadoComSalarioBase4("Rafael",
                "Akio", "42669782464-0", 1000, 0.04, 5000);

        String str = "Nome: " + empregado.getNome() +
                "\nSobrenome: " + empregado.getSobrenome() +
                "\nCPF: " + empregado.getCpf() +
                "\nVendas: " + empregado.getVendasSemanais() +
                "\n%Comissao: " + empregado.getPorcentagemDeComissao() +
                "\nSalário base: " + empregado.getSalarioBase();

        JOptionPane.showMessageDialog(null, "\nSalario Final: " + empregado.calcula());
        empregado.setSalarioBase(20000);
        JOptionPane.showMessageDialog(null, "Dados Atualizados do empregado:\n" +
                empregado + "\nSalario: " + empregado.calcula());
        System.exit(0);
    }
}
