import java.util.Scanner;
public class Matriz3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
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


        boolean duplicado = false;
        for (int i1 = 0; i1 < 3; i1++) { //percorrem as linhas
            for (int j1 = 0; j1 < 3; j1++) { //percorrem as colunas
                for (int i2 = 0; i2 < 3; i2++) { //percorre novamente, e compara i1 e j1 com todos os outros elementos
                    for (int j2 = 0; j2 < 3; j2++) {
                        if ((i1 != i2 || j1 != j2) && matriz[i1][j1] == matriz[i2][j2]) {
                            System.out.println("Elemento duplicado encontrado: " + matriz[i1][j1]);
                            duplicado = true;
                        }
                    }
                }
            }
        }

if(duplicado == false){
    System.out.println("Sem elementos duplicados.");
}


    }

}
