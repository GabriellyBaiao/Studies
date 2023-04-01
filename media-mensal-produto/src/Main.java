import java.sql.SQLOutput;
import java.util.Scanner;

/*
Receba o preço atual e a média mensal de um produto. Calcule e mostre o
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30  + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5
Obs.: para outras condições, preço novo será igual ao preço atual.

 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Recebe o preço atual e a média mensal de vendas
        System.out.print("Digite o preço atual do produto: ");
        double precoAtual = sc.nextDouble();

        System.out.print("Digite a média mensal de vendas do produto: ");
        int vendasMensais = sc.nextInt();

        // Calcula o novo preço do produto com base na tabela de descontos
        double novoPreco;
        if (vendasMensais < 500) {
            novoPreco = precoAtual * 1.1;
        } else if (vendasMensais < 1000) {
            novoPreco = precoAtual * 1.15;
            if (precoAtual >= 30 && precoAtual < 80) {
                novoPreco = precoAtual * 1.15;
            }
        } else {
            novoPreco = precoAtual * 0.95;
            if (precoAtual < 80) {
                novoPreco = precoAtual;
            }
        }

        // Exibe o resultado
        if (novoPreco == precoAtual) {
            System.out.println("Não houve mudança no preço.");
        } else if (novoPreco > precoAtual) {
            System.out.printf("O novo preço é de R$%.2f, um acréscimo de %.2f%% em relação ao preço atual.%n",
                    novoPreco, (novoPreco / precoAtual - 1) * 100);
        } else {
            System.out.printf("O novo preço é de R$%.2f, uma redução de %.2f%% em relação ao preço atual.%n",
                    novoPreco, (1 - novoPreco / precoAtual) * 100);
        }

    }
}