import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class ex53
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] numeros = new double[10];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o "+ (i+1) +" º numero");
            numeros[i] = ler.nextDouble();
        }

        Arrays.sort(numeros);
        System.out.println("Ordem crescente: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " ");
        }

        System.out.println("Ordem decrescente: ");
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i] + " ");
        }

        System.out.println("Ordem invertida:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }






    }
}