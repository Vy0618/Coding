
import java.util.Scanner;
public class Ex53004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n1, n2, salario;
        System.out.println("Insira o seu salário por hora:");
        n1 = scan.nextInt();

        System.out.println("Insira quantas horas você trabalha no mês:");
        n2 = scan.nextInt();

    salario = n1 * n2;


        System.out.println("O seu salário é igual a R$: " + salario+ " .");



    }
}