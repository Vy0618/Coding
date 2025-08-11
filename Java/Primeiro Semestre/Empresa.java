/******************************************************************************

 A empresa XKW concedeu um bônus de 20%
 do valor do salário a todos os funcionários com tempo de trabalho na empresa
 igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
 salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
 bônus recebido por ele.

 *******************************************************************************/
import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double s, t, a;
        // s = salário; a = aumento; t = tempo;


        System.out.println("Insira o seu salário atual em Reais:");
        s = ler.nextDouble();

        System.out.println("Insira há quanto tempo está trabalhando nesta empresa em anos:");
        t = ler.nextDouble();

        if (t >= 5) {
            a = (s * 20) / 100;
            System.out.println("Você receberá um aumento de 20%, equivalente a R$ " + (a) + " reais.");
        }
            else {
            a = (s * 10) / 100;
            System.out.println("Você recebrá um aumento de 10%, equivalente a R$ " + (a) + " reais.");
        }
    }
}