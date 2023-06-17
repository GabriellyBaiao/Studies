import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Ler o primeiro valor inteiro
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor inteiro:");
        int valor1 = Integer.parseInt(input1);

        // Ler o segundo valor inteiro
        String input2 = JOptionPane.showInputDialog("Digite o segundo valor inteiro:");
        int valor2 = Integer.parseInt(input2);

        // Calcular a soma
        int soma = valor1 + valor2;

        // Exibir a soma em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }
}
