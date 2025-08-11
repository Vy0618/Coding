import java.util.Scanner;
public class desafio5 {
    public static void main(String[] argos) {
        Scanner ler = new Scanner(System.in);

        double vemprestimo, qparcela, vparcela, vfinal = 0, vparcelaf, decisao, porcentagem, controle = 0, vemprestimoex, controle2 = 0;

        System.out.println("Insira o valor do empréstimo que deseja realizar:");
        vemprestimo = ler.nextDouble();
        vemprestimoex = vemprestimo;
        System.out.println("Insira a quantidade de parcelas na qual deseja pagar o empréstimo:");
        qparcela = ler.nextDouble();

        while(controle != qparcela) {

            vparcela = vemprestimo / qparcela;

            porcentagem = (vemprestimo * 2) / 100;
            vfinal = vemprestimo + porcentagem;
            vemprestimo = vfinal;
            controle++;

            vparcela++;

                System.out.println("O valor da " + controle + "° parcela, será igual a: " +vparcela);
            }





        System.out.println("\nUm empréstimo de R$" + vemprestimoex +";\nPago em " + qparcela + " parcelas;\nCom juros compostos de 2%;\nTerá como valor final R$ " + vfinal + ".");






    }
}
