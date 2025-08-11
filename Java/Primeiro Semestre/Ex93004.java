
import java.util.Scanner;
public class Ex93004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

double area, lata = 54, preco, qntd;

        System.out.println("Insira, em metros quadrados, o tamanho da área a ser pintada:");
        area = scan.nextInt();

        qntd = area / lata;
        preco = qntd * 80;

        System.out.println("Para pintar uma área de " + area + " metros quadrados, será nescessário aproximadamente " + qntd + " latas de tinta.\nO custo total será de R$ " + preco);




    }
}