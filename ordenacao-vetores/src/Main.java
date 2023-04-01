import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N[] = new int[10];
        Scanner leia = new Scanner(System.in);

        for(int i=0; i<10; i++)
        {
            System.out.println("Digite o numero: " + (i+1) + ":");
            N[i] = leia.nextInt();
        }
        ordenaArrayInt(N);
        System.out.println("Em ordem crescente: ");

        mostraArray(N);
    }
        public static void ordenaArrayInt (double vet[], double valor)
        {
            int x, y, aux;
            for(x=0; x<arr.length; x++)
                for (y=0; y<arr.length; y++)
                    if(arr[x]< arr[y]) {
                        aux = arr[y];
                        arr[y] = arr[x];
                        arr[x] = aux;
                    }
            }
            public static void mostraArray(int arr[])
            {
                for(int i=0; i<arr.length; i++)
                    System.out.println(arr[i] + " ");

        }
}