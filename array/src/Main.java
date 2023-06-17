public class Main {
    public static void main(String[] args) {

       int[][] b = {{1,2}, {3,4,5}};

        System.out.println("Elementos do array: ");
        for(int i=0; i<b.length; i++) {
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
