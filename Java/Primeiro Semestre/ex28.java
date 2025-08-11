import java.util.Scanner;
public class ex28
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma;
        System.out.println("Digite o primeiro numero");
        double a = ler.nextDouble();
        System.out.println("Digite o segundo numero");
        double b = ler.nextDouble();
        soma = a + b ;
        System.out.println("A soma dos numeros é: "+ soma);

        System.out.println("Deseja continuar a somar? (S para sim, N para não)");
        char opção = ler.next().charAt(0);

        while (opção == 'S'){

            System.out.println("Digite o primeiro numero");
            double c = ler.nextDouble();
            System.out.println("Digite o segundo numero");
            double d = ler.nextDouble();
            soma = c + d ;
            System.out.println("A soma dos numeros é: "+ soma);
        }
    }
}