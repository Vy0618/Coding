
import java.util.Scanner;
public class Ex73004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

double altura, peso;
        System.out.println("Insira a sua altura em metros:");
        altura = scan.nextDouble();

        peso = (72.7*altura) - 58;

        System.out.println("Seu peso ideal é igual a: " + peso + " kg.");




    }
}