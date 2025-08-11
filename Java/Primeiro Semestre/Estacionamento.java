

import java.util.Scanner;
public class Estacionamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double vt, vh, hne;
        int h, m, hs, ms, cvs, tcvs, tcv, cv, check, checks;

        System.out.println("Insira a hora em que entrou no estacionamento:");
        h = ler.nextInt();
        System.out.println("Insira o minuto em que entrou no estacionamento:");
        m = ler.nextInt();

        System.out.println("Insira a hora em que saiu do estacionamento:");
        hs = ler.nextInt();
        System.out.println("Insira o minuto em que saiu do estacionamento:");
        ms = ler.nextInt();

        cv = h * 60;
                tcv = cv + m ;

        cvs = hs * 60;
                tcvs = cvs + ms ;

                check = tcv / 60;
                        checks = tcvs/60;

                        hne = checks - check;

                        if (hne <= 1){
                            vt = (hne * 4.00);
                            System.out.println("Você pagará R$4,00 reais de estacionamento.");
                        } else
                            if (hne > 1 && hne <=2  ){
                            System.out.println("Você pagará R$6,00 reais de estacionamento.");
                        } else {
                                vt = (6 + (hne - 2 ));
                                System.out.println("Você pagará R$" + vt + "reais de estacionamento.");


                            }

                }
}