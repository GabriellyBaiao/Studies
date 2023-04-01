public class Main {
    public static void calculaArea(int lado) {
        int area = lado * lado;
        System.out.println("A área do terreno no formato de quadrado é: " + area);
    }

    public static void calculaArea(int base, int altura) {
        int area = base * altura;
        System.out.println("A área do terreno no formato retangular é: " + area);
    }

    public static void main(String[] args) {
        int ladoQuadrado = 5;
        int base = 10;
        int altura = 15;

        calculaArea(ladoQuadrado);
        calculaArea(base, altura);
    }
}
