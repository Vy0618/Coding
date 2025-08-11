/******************************************************************************

Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.

*******************************************************************************/

import java.util.Scanner;
public class Media
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Insira a primeira nota do aluno:");
		nota1 = ler.nextInt();
		System.out.println("Insira a segunda nota do aluno:");
		nota2 = ler.nextInt();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 7)
		System.out.println("Sua média final foi de " + (media) + ", o suficiente para ser aprovado.");
		else
		System.out.println("Sua média final foi de " + (media) + ", e não é o suficiente para ser aprovado.");
	}
}