import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;
        Scanner input = new Scanner(System.in);
        double area;

        Poligono p; // superclasse abstrata não instanciável
        Poligono q = new Quadrado(2);
        Poligono r = new Retangulo(3,5);
        Poligono t = new Triangulo(7,4);

        System.out.println("CÁLCULO DA ÁREA: ");
        System.out.println("[1]- QUADRADO");
        System.out.println("[2]- RETANGULO");
        System.out.println("[3]- TRIÂNGULO");
        System.out.print("ESCOLHA A OPÇÃO: ");
        opcao = input.nextInt();

        p = null;
        switch (opcao){

            case 1: p = q;
                break;
            case 2: p = r;
                break;
            case 3: p = t;
                break;
            default:
                System.out.println("Opção Inválida!");

        }
        area = p.calcularArea(); //chamada polimórfica

        System.out.print("AREA = " + area);
        System.exit(0);
    }
}