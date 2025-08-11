import java.util.Scanner;
public class ex183004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;


        System.out.println("Insira um numero inteiro");
        n1 = scan.nextInt();
        System.out.println("Insira o segundo numero inteiro:");
        n2 = scan.nextInt();


        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {

                System.out.println(i);
                }
            }
        if (n1 > n2) {
            for (int i = n2; i < n1; i++) {

                System.out.println(i);
            }
        }
    }
}
