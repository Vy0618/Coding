
import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double dinheirobase, dinheirof, vvariavel;
        int opcao = 0;


        while(opcao != 4) {

        dinheirobase = 10000;

        System.out.println("Bom dia! Bem vindo ao nosso banco. Você deseja:\n1 - Verificar Saldo Bancário\n2 - Realizar depósito bancário\n3 - Sacar dinheiro\n4 - Sair.");
        opcao = ler.nextInt();



            switch (opcao) {

                case 1:
                    System.out.println("\nSeu saldo bancário, no momento, é de R$" + dinheirobase + ".");
                    break;

                case 2:
                    System.out.println("Qual é o valor que deseja depositar?");
                    vvariavel = ler.nextDouble();

                        dinheirof = dinheirobase + vvariavel;
                        dinheirobase = dinheirof ;
                        break;

                case 3:
                    System.out.println("Qual é o valor que desejas sacar?");
                    vvariavel = ler.nextDouble();

                        dinheirof = dinheirobase - vvariavel;
                        dinheirobase = dinheirof;
                        break;

                case 4:
                    System.out.println("Foi um prazer trabalhar convosco! Volte sempre.");
                    break;

            }
        }
    }
}
