import java.util.Scanner;
public class Matriz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matriz padrão:");
        for(int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz formatada:");
        for(int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    matriz[i][j] = 0;
                }

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
