import java.util.Scanner;
public class Peso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int sexo;
        double peso, h;

        System.out.println("Insira seu sexo, sendo 1 masculino e 2 feminino:");
        sexo = ler.nextInt();
        System.out.println("Entre com sua altura em metros:");
                h = ler.nextDouble();

        switch (sexo){
            case 1:
                peso = ((72.7*h) - 58);
                System.out.println("O peso ideal para você é " + (peso) + " kg.");
                break;
            case 2:
                peso = ((62.1*h) - 44.7);
                System.out.println("O peso ideal para você é " + (peso) + " kg.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }
}
