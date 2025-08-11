import java.util.Scanner;
public class ex35
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = "";
        int contador = 1, opcao;
        double preco, desconto, precof, somapreco = 0;

        do {
            System.out.println("Insira o nome do produto:");
            nome = ler.nextLine();

            System.out.println("Insira o preço do pruduto em reais:");
            preco = ler.nextDouble();
            somapreco += preco;

            ler.nextLine();
            contador++;

        } while (contador <=3);

        System.out.println("Escolha a forma de pagamento, sendo: \n1 à Vista em Dinheiro ou PIX;\n2 à vista no cartão de crédito;\n3 - Parcelado no cartão em duas vezes sem juros;\n4 - Parcelado no cartão em três vezes ou até 10 parcelos, com juros de 10%.");
        opcao = ler.nextInt();

        switch(opcao){
            case 1:
                desconto = (somapreco * 8) / 100;
                precof = somapreco - desconto;
                System.out.println("O preço final da compra será equivalente a R$" + precof + " reais.");
break;
            case 2:
                desconto = (somapreco * 3) / 100;
                precof = somapreco - desconto;
                System.out.println("O preço final da compra será equivalente a R$" + precof + " reais.");
break;
            case 3:
                System.out.println("O preço final da compra será equivalente a R$" + somapreco + " reais.");
break;
            case 4:
                desconto = (somapreco * 10) / 100;
                precof = somapreco + desconto;
                System.out.println("O preço final da compra será equivalente a R$" + precof + " reais.");
break;
            default:
                System.out.println("Opção inválida.");

        }

    }
}