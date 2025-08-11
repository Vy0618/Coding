import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int litros = 0, opcao = 0;
        double vt;


        while (opcao != 4) {

            System.out.println("Insira o combustível que deseja abastecer, sendo:\n1)Gasolina;\n2)Etanol;\n3)Álcool;\n4)Sair.");
            opcao = ler.nextInt();

            System.out.println("Insira a quantidade de litros que deseja abastecer:");
            litros = ler.nextInt();



            switch (opcao) {
                case 1:
                    vt = 5 * litros;

                    System.out.println("Para encher o tanque com " + litros + " litros de gasolina, você gastará R$" + vt + " reais.");
                    break;

                case 2:
                    vt = 2.90 * litros;
                    System.out.println("Para encher o tanque com " + litros + " litros de etanol, você gastará R$" + vt + " reais.");
                    break;

                case 3:
                    vt = 3.10 * litros;
                    System.out.println("Para encher o tanque com " + litros + " litros de álcool, você gastará R$" + vt + " reais.");
                    break;

                case 4:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("ERRO.");

            }


        }
    }
}