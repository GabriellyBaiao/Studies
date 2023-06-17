import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        EmpregadoComissionadoComSalarioBase empregado = new EmpregadoComissionadoComSalarioBase("Gabrelly",
                "Baião","22222222222", 1000,0.06, 1.500);

        JOptionPane.showMessageDialog(null, "Salário do Funcionário: " + empregado.calcula());
        empregado.setVendasSemanais(500);
        empregado.setPorcentagemDeComissao(0.1);

        JOptionPane.showMessageDialog(null, "Dados do Funcionário: " +
                empregado.toString() + "Salário: " + empregado.calcula());
        System.exit(0);
        }
    }
