//Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize while.



public class Whileex1 {
    public static void main(String[] args) {
   int num = 1;

   while (num <= 50){
       if (num % 2 == 0) {
           System.out.print(num + " ");
       }
       num++;
   }


        System.out.println("\n");

   while (num > 50 && num <= 100){
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }


    }
}
