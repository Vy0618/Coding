//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize while.

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   int num, t = 1, c = 0, nt = 0;

        System.out.println("Entre com um numero qualquer:");
        num = scan.nextInt();

while (t <= 10){

 nt = num * t;

    System.out.println(nt + "");

    t++;
}



    }
}
