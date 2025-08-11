
import java.util.Scanner;
public class Ex63004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n1;
double n2;
        System.out.println("Insira uma temperatura em graus Farenheit:");
        n1 = scan.nextInt();

        n2 = (5*(n1-32)/9);


        System.out.println("Essa temperatura, em Celsius, é equivalente a: " + n2 + " .");



    }
}