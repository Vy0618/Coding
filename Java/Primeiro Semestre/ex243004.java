import java.util.Scanner;
import java.util.Random;
public class ex243004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess, qntd = 0;

        System.out.println("Entre com um numero inteiro qualquer entre um a 10:");
        guess = scan.nextInt();


        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            int[] n = new int[8];
            n[i] = r.nextInt(10);

            if (n[i] == guess) {
                qntd++;
            }
        }

        System.out.println("Existem " + qntd + " numeros " + guess + " " +
                "na lista secreta de números aleatórios.");
    }
}

