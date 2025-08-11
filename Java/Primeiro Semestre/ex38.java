
import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double total = 0, poupanca, vtb = 0, vtp = 0;
        int opcao = 0, qbroa = 0, qpao = 0;

        while (opcao != 5){

        System.out.println("\nEntre com uma opção:\n1)Checar o valor arrecadado pelas vendas de broas;\n2)Checar o valor arrecadado pelas vendas de pães;\n3)Checar o valor total arrecadado;\n4)Checar o valor que será depositado na poupança;\n5) Sair.");
        opcao = ler.nextInt();

        switch(opcao) {
            case 1:

                System.out.println("\nQuantas broas foram vendidas hoje?");
                qbroa = ler.nextInt();
                vtb = qbroa * 1.50;
                System.out.println("\nA venda de " + qbroa + " broas arrecadou um total de R$" + vtb + " reais.");
                break;

            case 2:
                System.out.println("\nQuantos pães foram vendidos hoje?");
                qpao = ler.nextInt();
                vtp = qpao * 0.12;
                System.out.println("\nA venda de " + qpao + " pães arrecadou um total de R$" + vtp + " reais.");
                break;


            case 3:
                if (qpao == 0) {
                    total = (vtp + vtb);
                    System.out.println("\nO total das vendas de " + qbroa + " broas e " + qpao + " pães equivale a R$" + total + " reais.");
                    break;

                } else if (qbroa == 0) {
                    total = (vtp + vtb);
                    System.out.println("\nO total das vendas de " + qbroa + " broas e " + qpao + " pães equivale a R$" + total + " reais.");
                    break;
                } else {
                    total = (vtp + vtb);
                    System.out.println("\nO total das vendas de " + qbroa + " broas e " + qpao + " pães equivale a R$" + total + " reais.");
                }
                break;


            case 4:
                poupanca = (total * 10) / 100;
                System.out.println("\nR$" + poupanca + " reais, o equivalente a 10% da venda de broas e pães hoje, serão depositados em sua poupança.");
                break;
            case 5:
                System.out.println("\nAté amanhã!");
                break;
            default:
                System.out.println("\nERRO.");
                break;


            }
        }
    }
}