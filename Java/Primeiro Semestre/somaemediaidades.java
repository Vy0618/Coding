import java.util.Scanner;
public class somaemediaidades {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, maior = 0, soma = 0;
        double media = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("A " + i + "° idade");
            idade = ler.nextInt();
            soma += idade;
            media = soma/20;
            if (idade >= 18) {
                maior++;
            }
        }


        System.out.println("A soma entre todos as idades é equivalente a: " + soma + "\nA média das idades é igual a " + media + " \nA quantidade de pessoas maior de idade é igual a " + maior + ".");
    }
}