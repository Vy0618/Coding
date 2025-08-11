import java.util.Scanner;
public class alistamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, i, d, al;

        System.out.println("Insira o seu ano de nascimento:");
        a = ler.nextInt();

        i = 2025 - a;
        if (i >= 18){
            al = i - 18;
            System.out.println("Já se passaram " + al + " anos desde o momento de se alistar.");


        } else if (i < 18) {
            al = 18 - i;
            System.out.println("Faltam " + al + " anos para o alistamento militar.");

        } else if ( i == 18){
            System.out.println("Está na hora de fazer o alistamento militar!");

        }

    }
}