/*
desenvolva um programa que calcule a soma de dois números
*/
import java.util.Scanner;//Ler as entradas de teclado
public class Soma
{
	public static void main (String[] args) {

	    double a,b,soma;//declaração de variável
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.println("Informe o primeiro valor");
	    a = ler.nextDouble();
	    System.out.println("Informe o segundo valor");
	    b = ler.nextDouble();
	    
	    //processamento
	    soma = a + b;
	    System.out.println("Eis a soma: " + soma);
	    
	}
}