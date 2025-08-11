import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n.length; i++) {
            System.out.println("Insira um número inteiro qualquer:");
            n[i] = scan.nextInt();
        }


        int countImpares = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                countImpares++;
            }
        }


        int[] impares = new int[countImpares];
        int nimpar = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                impares[nimpar] = n[i];
                nimpar++;
                
            }
        }

        System.out.println("Números ímpares:");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
