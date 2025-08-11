
import java.util.Scanner;
public class ex113004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        System.out.println("Insira um número qualquer:");
        n1 = scan.nextInt();


        if (n1 > 0){
            System.out.println("O número é positivo.");
        } if (n1 < 0){
            System.out.println("O número é negativo.");
        } if (n1 == 0) {
            System.out.println("O número é nulo.");
        }



    }
}