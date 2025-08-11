import java.util.Scanner;

public class ex37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cavalos, ferraduras;

        System.out.print("Digite o numero de cavalos no haras: ");
        cavalos = scanner.nextInt();

        ferraduras = cavalos * 4;

        System.out.println("O número total de ferraduras necessárias é: " + cavalos);
    }
}
