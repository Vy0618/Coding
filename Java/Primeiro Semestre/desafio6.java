import java.util.Scanner;
import java.lang.Math;
public class desafio6 {
    public static void main(String[] argos) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;

        System.out.println("Entre com a variável A, sendo ela um número inteiro:");
        a = ler.nextInt();
        System.out.println("Entre com a variável B, sendo ela um número inteiro:");
        b = ler.nextInt();
        System.out.println("Entre com a variável C, sendo ela um número inteiro:");
        c = ler.nextInt();

        delta = ((b*b) - 4*a*c);

        if (delta >= 0){
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);

            System.out.println("O valor de x1 é igual a " + x1 + ";\nO valor de x2 é igual a " + x2 +";\nE o valor de delta é igual a " + delta + ".");


        } else {
            System.out.println("Delta não possui raiz, pois é igual a zero.");

        }

    }
}