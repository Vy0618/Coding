
import java.util.Scanner;
public class Ex43004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n1, n2;
        System.out.println("Insira uma distância em metros:");
        n1 = scan.nextInt();

        n2 = (n1*100);


        System.out.println("Convertendo para centimétros, essa distância equivale a: " + n2+ " cm.");



    }
}