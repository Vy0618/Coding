
import java.util.Scanner;
public class Ex33004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n1, n2, n3, n4, media;
        System.out.println("Insira a primeira nota bimestral:");
        n1 = scan.nextInt();
        System.out.println("Insira a segunda nota bimestral:");
        n2 = scan.nextInt();
        System.out.println("Insira a terceira nota bimestral:");
        n3 = scan.nextInt();
        System.out.println("Insira a quarta nota bimestral:");
        n4 = scan.nextInt();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A média das notas dos quatro bimestres é igual a: " + media + ".");



    }
}