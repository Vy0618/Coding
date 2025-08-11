import java.util.Scanner;
public class desafio4 {
    public static void main(String[] argos) {
        Scanner ler = new Scanner(System.in);

        double dinheirocaixa, qntd100 = 0, qntd50 = 0, qntd20 = 0, qntd10 = 0, qntd5 = 0, dinheirosaqueex, dinheirosaque, controle = 1000;

        System.out.println("Insira a quantidade de dinheiro, em reais, que deseja sacar:");
        dinheirosaque = ler.nextDouble();

        dinheirosaqueex = dinheirosaque;

        while (dinheirosaque >= 100) {
            qntd100++;
           controle = (dinheirosaque - 100);
           dinheirosaque = controle;

        }
        while (dinheirosaque >= 50) {
            qntd50++;
            controle = (dinheirosaque - 50);
            dinheirosaque = controle;

        }
        while (dinheirosaque >= 20) {
            qntd20++;
            controle = (dinheirosaque - 20);
            dinheirosaque = controle;

        }
        while (dinheirosaque >= 10) {
            qntd10++;
            controle = (dinheirosaque - 10);
            dinheirosaque = controle;

        }
        while (dinheirosaque >= 5) {
            qntd5++;
            controle = (dinheirosaque - 5);
            dinheirosaque = controle;


            }




         if (dinheirosaque != 0) {
             System.out.println("ERRO.");
         }else{
                 System.out.println("Para sacar R$" + dinheirosaqueex + " reais, o caixa eletrônico te dará:\n" + qntd100 + " cédulas de R$ 100.\n" + qntd50 + " células de R$50.\n" + qntd20 + " cédulas de R$ 20.\n" + qntd10 + " cédulas de R$ 10.\n" + qntd5 + " cédulas de R$ 5.");
             }





    }
}
