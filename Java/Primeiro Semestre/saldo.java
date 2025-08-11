import java.util.Scanner;
public class saldo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double ssm1, ssm2, ms, vc, c;

        System.out.println("Insira o seu saldo médio no primeiro semestre do ano passado:");
        ssm1 = ler.nextDouble();
        System.out.println("Insira o seu saldo médio no segundo semestro do ano passado");
        ssm2 = ler.nextDouble();

        ms = (ssm1 + ssm2) / 2;

    if (ms <= 200)
        System.out.println("Você não receberá nenhum crédito.");
    else if (ms > 200 && ms <= 400) {
        c = (ms*40)/100;
        System.out.println("Você receberá um crédito de 20%, equivalente a R$" + c + " reais.");
    } else if (ms > 401 && ms <= 600) {
        c = (ms*30)/100;
        System.out.println("Você receberá um crédito de 30%, equivalente a R$" + c + " reais.");

        } else if (ms > 601) {
            c = (ms*40)/100;
            System.out.println("Você receberá um crédito de 40%, equivalente a R$" + c + " reais.");

        }

    }
}