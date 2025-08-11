import java.util.Scanner;
public class somasaquinze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0;


        for (int i = 0; i <= 15; i++) {
            soma += i;
        }
            System.out.println("A soma de todos os números entre 1 e 15 é igual a " + soma);

    }
}