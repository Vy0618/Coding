import java.util.Scanner;
public class Matriz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        matriz [0] [0] = 1;
        matriz [0] [1] = 2;
        matriz [0] [2] = 3;
        matriz [0] [3] = 4;

        matriz [1] [0] = 5;
        matriz [1] [1] = 6;
        matriz [1] [2] = 7;
        matriz [1] [3] = 8;

        matriz [2] [0] = 9;
        matriz [2] [1] = 1;
        matriz [2] [2] = 1;
        matriz [2] [3] = 6;

        matriz [3] [0] = 3;
        matriz [3] [1] = 4;
        matriz [3] [2] = 5;
        matriz [3] [3] = 6;

        System.out.println("MATRIZ");
        for(int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}











