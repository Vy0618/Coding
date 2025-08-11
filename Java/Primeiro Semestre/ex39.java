import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, dias;
        String nome;

        System.out.println("Insira seu nome: ");
        nome = ler.nextLine();

        System.out.println("Insira sua idade: ");
        idade = ler.nextInt();

        dias = idade*365;

        System.out.println(nome + " você viveu, até o momento, " +dias+ " dias.");
    }
}