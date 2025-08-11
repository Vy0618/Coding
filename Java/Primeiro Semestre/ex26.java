import java.util.Scanner;
public class ex26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 0, numeros = 0;

        System.out.println("Insira um número inteiro qualquer:");
        n = ler.nextInt();


        while(numeros <= (n - 1)){
        numeros++;
            System.out.println(numeros);
        }
    }
}