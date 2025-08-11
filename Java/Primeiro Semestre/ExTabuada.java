import java.util.Scanner;
public class ExTabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Escolha a tabuada de um número:");
        n = ler.nextInt();

        for (int i = 0; i <= 10; ++i)
        System.out.println("Tabuada "+ n*i);

    }
}