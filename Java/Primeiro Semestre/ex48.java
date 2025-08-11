import java.util.Scanner;
public class ex48 {
    public static void main(String[] args) {
        int[] n = new int[5];
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n.length; i++) {
            System.out.println("Insira um número inteiro qualquer:");
            n[i] = scan.nextInt();
        }



        for (int i = 0; i < n.length; i+=2) {
            soma += n[i];

        }

        System.out.println("A soma de todos os valores em posições ímpares é igual a " + soma + ".");

    }
}