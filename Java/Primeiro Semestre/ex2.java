//Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize for.


public class ex2 {
    public static void main(String[] args) {
   int num = 1;

 for(int i = 0; i < 50; i++){
       if (num % 2 == 0) {
           System.out.print(num + " ");
       }
       num++;
   }


        System.out.println("\n");

 for(int i = 50; i < 100; i++){
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }


    }
}
