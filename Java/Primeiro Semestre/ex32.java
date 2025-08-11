import java.util.Scanner;
public class ex32{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int numero, contador = 0, maiorNumero = 0;

        while (contador < 5) {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();
            contador++;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
    }
}