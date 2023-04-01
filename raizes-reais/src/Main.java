import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
/*
Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o coeficiente A: ");
        double a = sc.nextDouble();
        System.out.println("Entre com o coeficiente B: ");
        double b = sc.nextDouble();
        System.out.println("Entre com o coeficiente C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b,2) - 4 * a * c;
        if(delta<0){
            System.out.print("Não existem raízes reais!.");
        } else if(delta == 0){
            double x = -b / (2*a);
            System.out.printf("Existe uma raíz real: %.2f%n", x);
        } else {
            double x1 = (- b + Math.sqrt(delta)/2*a);
            double x2 = (- b - Math.sqrt(delta)/2*a);
            System.out.printf("Existem duas raízes reais %.2f%n e %.2f%n", x1, x2);
        }
        sc.close();
    }
}