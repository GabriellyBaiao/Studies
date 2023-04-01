
public class Main {

    public static void main(String[] args){

        double moeda[] = {0.01, 0.05, 0.10, 0.20, 0.30, 0.40, 0.50, 1};

        for(int i=0; i<moeda.length; i++){
            System.out.printf("Moeda: %.2f\n", moeda[i]);
        }
    }
}