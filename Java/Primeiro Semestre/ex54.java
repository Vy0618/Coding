import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner scan = new Scanner(System.in);
        int contagemimpar = 0, contagempar = 0, produtoimpar = 1;

        for (int i = 0; i < n.length; i++) { //Clássico, entrada de dados.
            System.out.println("Insira um número inteiro qualquer:");
            n[i] = scan.nextInt();


            if (n[i] % 2 != 0) { //verificação se realmente é impar
                contagemimpar++; //conta a quantidade de números impares
                produtoimpar *= n[i];
            } else {
                contagempar++; //o que sobra vira par

            }

        }

        System.out.println("\nQuantidade de números pares: " + contagempar + "\nProduto dos números ímpares:" + produtoimpar);





    }
}

