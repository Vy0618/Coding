import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, v1, v2, v3,rv1 = 0, rv2 = 0, rv3 = 0;

        for (int i = 0; i <=4; i++){
            System.out.println("Insira um número inteiro qualquer:");
            n = ler.nextInt();

            if (n >= 0 && n <= 100) {
                rv1++;
            }
            if (n >= 101 && n <= 200){
                rv2++;
            }
            if (n > 200)
                rv3++;
        }
        System.out.println("Há " + rv1 + " números entre 0 e 100;\n" + rv2 + " Números entre 101 e 200;\n E" + rv3 + " números maiores que 200.");


        }
    }

