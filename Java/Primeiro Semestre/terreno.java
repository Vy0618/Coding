import java.util.Scanner;
public class terreno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int l, c, a;
        System.out.println("Insira a a largura em metros de seu terreno:");
        l = ler.nextInt();
        System.out.println("Insira o comprimento em metros de seu terreno:");
        c = ler.nextInt();

        a = l * c;
        if (a < 100){

            System.out.println("Seu terreno se enquadra na categoria popular.");

        } else if ( a >= 100 && a <= 500) {
            System.out.println("Seu terreno se enquadra na categoria master.");

        } else if ( a > 500){
            System.out.println("Seu terreno se enquadra na categoria vip.");

        }

    }
}