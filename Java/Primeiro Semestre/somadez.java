import java.util.Scanner;
public class somadez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("A " + i + "° número");
            n1 = ler.nextInt();
            soma += n1;
        }

        System.out.println("A soma entre todos os números é equivalente a: " + soma);
    }
}