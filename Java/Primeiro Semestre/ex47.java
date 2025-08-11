import java.util.Scanner;
public class ex47 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n.length; i++) {
            System.out.println("Insira um número inteiro qualquer:");
            n[i] = scan.nextInt();


        }
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");


        }
    }
}