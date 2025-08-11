

import java.util.Scanner;
public class Gasolina {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pg, vg, pa, ct;
        int tc;

        pg = 1.80;
        pa = 1;

        System.out.println("Insira o tipo de combustível utilizado pelo seu carro, sendo 1 Gasolina e 2 Álcool:");
        tc = ler.nextInt();

        System.out.println("Insira a capacidade (em litros), do tanque do seu carro:");
         ct = ler.nextDouble();

         switch (tc) {
             case 1:
                 vg = 1.80 * ct;
                 System.out.println("Você gastará R$ " + vg + " reais para encher o tanque de gasolina.");
                 break;
             case 2:
                 vg = 1 * ct;
                 System.out.println("Você gastará R$ " + vg + " reais para encher o tanque de álcool.");
                 break;

                 default:
                 System.out.println("Opção inválida.");


         }
    }
}