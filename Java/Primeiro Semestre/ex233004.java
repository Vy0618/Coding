import java.util.Scanner;
public class ex233004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int soma = 0, check = 10000;

        int[] luizao = new int[5];
         luizao[0] = 1;
         luizao[1] = 2;
         luizao[2] = 3;
         luizao[3] = 4;
         luizao[4] = 5;

        for (int i = 0; i < luizao.length; i++ ){
           if (luizao[i] > luizao[0]){
               luizao[0] = luizao[i];

           }

        }
        System.out.println("O maior número é igual a:" + luizao[0]);







    }
}