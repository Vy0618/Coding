import java.util.Scanner;
public class ex52 {

    public static void main(String[] args) {
        int length = 6;
        int[] idade = new int[length];
        String[] nome = new String[length];
        int somaidade = 0;
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite o nome da " + (i + 1) + " º Pessoa ");
            nome[i] = ler.nextLine();


            System.out.println("Digite a idade da " + (i + 1) + "º Pessoa ");
            idade[i] = ler.nextInt();
            somaidade += idade[i];

            ler.nextLine();
        }

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 18) {
                System.out.println(nome[i] + " é crianças.");
            } else if (idade[i] >= 18 && idade[i] <= 60) {
                System.out.println(nome[i] + " é adultos.");
            } else if (idade[i] >= 60) {
                System.out.println(nome[i] + " é da melhor idade.");
            }


        }
        System.out.println("E o total das idades é de: " + somaidade);


    }
}
