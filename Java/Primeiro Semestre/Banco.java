


import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] saldo = new double[5];
        boolean control = false;
        int escolha, escolha2 = 0, controlcase1 = 1;
        String nome;
        boolean vwhile = true;
        while (vwhile == true) {

            System.out.println("1) Criar nova conta.");
            System.out.println("2) Acessar conta.");
            System.out.println("3) Encerrar o programa");
            escolha = scan.nextInt();


            switch (escolha) {


                case 1:
                    for (int i = 0; controlcase1 == 1; i++) {
                        System.out.println("Entre com o nome da conta");
                        nomes[i] = scan.nextLine();
                        scan.nextLine();
                        System.out.println("Deseja criar outra conta?");
                        System.out.println("1) Sim.");
                        System.out.println("2) Não.");
                        controlcase1 = scan.nextInt();

                    }
                    break;

                case 2:

                    for (int i = 0; i < 2; i++) {
                        System.out.println("Insira o nome do cliente:");
                        nome = scan.nextLine();
                        scan.nextLine();

                        if (nomes[i].equals(nome)) {
                            System.out.println("1) Depositar");
                            System.out.println("2) Sacar");
                            System.out.println("3) Consultar Saldo");
                            System.out.println("4) Encerrar o programa e sair.");
                            escolha2 = scan.nextInt();


                        } if (escolha2 == 1) {
                            System.out.println("Insira o valor que deseja depositar:");
                            double deposito = scan.nextDouble();
                            saldo[i] += deposito;


                        }

                        if (escolha2 == 2) {

                            System.out.println("Insira o valor que deseja sacar:");
                            double saque = scan.nextDouble();
                            saldo[i] -= saque;

                        }

                        if (escolha2 == 3) {

                            System.out.println("O valor do saldo é:\n" + saldo[i]);

                        }
                        if (escolha2 == 4) {

                            System.out.println("saindo...");

                        }


                    }
                case 3:
                    System.out.println("PROGRAMA ENCERRADO.");
                    vwhile = false;
                    break;


            }
        }

    }
}











