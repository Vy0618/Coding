import java.util.Scanner;

public class ex50
{
    public static void main(String[] args) {
        int Height = 10;
        double[] num1 = new double[Height];
        double totalvalue = 0.0;
        double tax = 0.0;
        double valuewithtax = 0.0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < Height; i++) {
            System.out.print("Informe o valor do " + (i+1) + "° produto: R$ ");
            num1[i] = ler.nextDouble();
            totalvalue += num1[i];
        }
        if (totalvalue > 1200){
            valuewithtax = totalvalue * 0.025;
            System.out.print("Como o valor da compra excedeu R$1200, será cobrado uma taxa de 2.5% a mais do valor total.\nO valor total da compra é igual a: "+ valuewithtax);
        } else if (totalvalue <= 1200){
            System.out.print("O valor total da compra é igual a: "+ totalvalue);
        }
    }
}