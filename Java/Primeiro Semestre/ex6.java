// Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize for.

import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 int contador = 0, numero = 0, somadosnumeros = 0;

   for (int i = 0; i < 100; i++){
       numero++;
       if(numero %2 == 0){

      somadosnumeros += numero;


        }

       contador ++;

   }

        System.out.println(somadosnumeros);




        }
    }

