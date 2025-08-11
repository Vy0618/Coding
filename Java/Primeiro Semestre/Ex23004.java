
import java.util.Scanner;
public class Ex23004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n, n1, soma;
        System.out.println("Insira um número qualquer:");
        n = scan.nextInt();
        System.out.println("Insira outro número qualquer:");
        n1 = scan.nextInt();

        soma = n + n1;

        System.out.println("A soma de ambos os números é igual a: " + soma + ".");

    }
}