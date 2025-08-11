import java.util.Scanner;
public class ex253004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int soma = 0, check = 10000;

        int[] luizao = new int[5];
         luizao[0] = 1;
         luizao[1] = 2;
         luizao[2] = 3;
         luizao[3] = 4;
         luizao[4] = 5;


         for(int i = 0; i < luizao.length; i++){
             System.out.println(luizao[i]);
         }

        System.out.println("\n");

        for (int i = luizao.length - 1; i >= 0; i-- ){
            System.out.println( luizao[i]);
        }








    }
}