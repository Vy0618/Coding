
import java.util.Scanner;
public class Ex83004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

double pesopeixe, excesso = 0, taxa = 0, precofinal;
        System.out.println("Insira o preço do peixe pescado, em quilogramas:");
        pesopeixe = scan.nextDouble();

    if (pesopeixe > 50){
        excesso = pesopeixe - 50;
        taxa = excesso * 4;


    }

        System.out.println("Um peixe de " + pesopeixe + " kg ultrapassa o peso limite em " + excesso + " quilogramas.\nPortanto, a taxa a ser paga será equivalente a R$" + taxa + ".");




    }
}