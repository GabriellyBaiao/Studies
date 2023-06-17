public class Main {
    public static void main(String[] args) {

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        double[] temperaturaMinima = {20.5, 18.9, 21.2, 19.8, 17.6, 22.0, 20.3};
        double[] temperaturaMaxima = {30.1, 29.4, 31.5, 28.9, 27.2, 32.6, 29.8};

        double[][] notasAlunos = new double[4][3];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++) {
                notasAlunos[i][j] = Math.random() * 10;
            }
        }

        System.out.println("Letras vogais:");
        for (char vogal : vogais ){
            System.out.print(vogal + " ");
        }
        System.out.println("\n");

        System.out.println("Número de dias em cada mês: ");
        for(int i = 0; i < 12; i++){
            System.out.println("Mês " + (i + 1) + ": " + diasMes[i]);
        }
        System.out.println();

        System.out.println("Temperaturas da semana:");
        for(int i = 0; i < 7; i++){
            System.out.println("Dia " + (i + 1) + ": " + temperaturaMinima[i] + "ºC - " + temperaturaMaxima[i] + "ºC");
        }
        System.out.println();

        System.out.println("Notas dos alunos:");
        for(int i = 0; i < notasAlunos.length; i++){
            System.out.print("Aluno " + (i + 1) + ": ");
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
