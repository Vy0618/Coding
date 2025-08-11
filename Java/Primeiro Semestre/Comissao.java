import java.util.Scanner;
public class Comissao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double s, v, c, st;

        s = 1200;

        System.out.println("Insira o valor total vendido durante este mês, em reais:");
         v = ler.nextDouble();

         if (v >= 2000) {
             c = (v * 10) / 100;
             st = (s + c);
             System.out.println("Você receberá uma comissão de 10%, equivalente a R$ " + (c) + "reais. Seu salário total será equivalente a R$ " + (st) + "reais.");
         } else
             System.out.println("Você não receberá nenhuma comissão.");






    }
}