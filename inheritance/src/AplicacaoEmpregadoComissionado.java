import javax.swing.*;

public class AplicacaoEmpregadoComissionado {
    public static void main(String[] args) {

        EmpregadoComissionado empregado = new EmpregadoComissionado("José", "da Silva", "22222222222",
                                                                     1000, 0.06);

        JOptionPane.showMessageDialog(null, "Salário do Funcionário: " + empregado.calcula());
        empregado.setVendasSemanais(500);
        empregado.setPorcentagemDeComissao(0.1);

        JOptionPane.showMessageDialog(null, "Dados do empregado:\n "+
                empregado.toString() +
                "\nSalário: " + empregado.calcula());
        System.exit(0);
    }
}