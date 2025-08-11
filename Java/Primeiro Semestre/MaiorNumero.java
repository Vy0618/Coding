/******************************************************************************

 Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.

*******************************************************************************/
import java.util.Scanner;
public class MaiorNumero
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		
		System.out.println("Entre com o primeiro número:");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo número:");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro número:");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3)
		    System.out.println("O maior número é o primeiro");
		        else if (n2 > n1 && n2 > n3)
		        System.out.println("O maior número é o segundo");
		            else 
		            if (n3 > n1 && n3 > n1)
		            System.out.println("O maior número é o terceiro");
		            else 
		            System.out.println("Erro");
		
    	
    }
}