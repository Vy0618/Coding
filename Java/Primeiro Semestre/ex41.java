

import java.util.Scanner;
public class ex41 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double precoPorQuilo = 12.00;

        System.out.println("Digite o peso do prato montado (Em quilos): ");
        double peso = ler.nextDouble();

        double valor = (peso - 1.00) * precoPorQuilo;

        System.out.println("Total a pagar: R$"+valor);
    }
}