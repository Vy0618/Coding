//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   int num, t = 1, c = 0, nt = 0;

        System.out.println("Entre com um numero qualquer:");
        num = scan.nextInt();

for (int i = 0; i <= 9; i++){

 nt = num * t;

    System.out.println(nt + "");

t++;
        }
    }
}
