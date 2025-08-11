import java.util.Scanner;
public class ex44
{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int AndreeCarlos;
        double Felipe;

        System.out.println("Defina o valor da conta que Carlos, André e Felipe devem pagar: ");
        double valor = ler.nextDouble();

         AndreeCarlos = (int) valor / 3;

        Felipe = valor - 2 * AndreeCarlos;


        System.out.println("Valor a pagar:\nAndré: "+ AndreeCarlos +"\nCarlos: "+ AndreeCarlos +"\nFelipe: "+ Felipe);


    }
}