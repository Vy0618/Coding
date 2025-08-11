import java.util.Scanner;
public class Parouimpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n, v;

        System.out.println("Insira um número inteiro qualquer:");
        n = ler.nextInt();
        v = n%2;

        if (v == 0)
            System.out.println("O número inserdo é par.");
            else
            System.out.println("O número inserido é ímpar.");

    }
}