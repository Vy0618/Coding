import java.util.Scanner;
public class Emprestimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double pr, pa, s, vp, porcnt;

        System.out.println("Qual é o valor do empréstimo desejado, em reais?");
        pr = ler.nextDouble();
        System.out.println("Qual é o número de parcelas desejadas?");
        pa = ler.nextDouble();
        System.out.println("Qual é o valor de seu salário, em reais?");
        s = ler.nextDouble();

        vp = (pr / pa);
        porcnt = (s * 30)/100;

        if (vp <= porcnt)
            System.out.println("O empréstimo está aprovado!");
            else
            System.out.println("O empréstimo foi rejeitado.");



    }
}