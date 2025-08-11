/******************************************************************************

Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. Se a resposta for positiva
escrever “maior de idade”, senão “menor de idade”.

*******************************************************************************/
import java.util.Scanner;
public class Idade
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Insira a sua idade em anos:");
		idade = ler.nextInt();
		if (idade >= 18)
		System.out.println("Você é maior de idade.");
		else 
		System.out.println("Você é menor de idade");
	}
}