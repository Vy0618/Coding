import java.util.Scanner;
public class desafio1 {
    public static void main(String[] argos) {
        Scanner ler = new Scanner(System.in);
     int votos = 0, qv1 = 0, qv2 = 0, qv3 = 0;

        System.out.println("Insira os votos, sendo:\n1)Candidato 1;\n2)Candidato 2;\n3)Candidato 3;\n4)Para parar de contar os votos.");

     while (votos != 4) {


         System.out.println("\n* Dê ENTER para continuar;\n* Digite 4 para parar de votar.");
         votos = ler.nextInt();
         switch (votos) {


             case 1:
                 qv1++;
                 break;
             case 2:
                 qv2++;
                 break;
             case 3:
                 qv3++;
                 break;


         }
     }

        if (qv1 > qv2 && qv1 > qv3)
            System.out.println("O primeiro candidato é o vencedor.");
        else  if (qv2 > qv1 && qv1 > qv3)
            System.out.println("O segundo candidato é o vencedor.");
        else  if (qv3 > qv1 && qv1 > qv2)
            System.out.println("O terceiro candidato é o vencedor.");
        else  if (qv1 == qv2 && qv1 > qv3)
            System.out.println("O primeiro e o segundo candidato são vencedores.");
        else  if (qv3 == qv2 && qv3 > qv1)
            System.out.println("O terceiro e o segundo candidato são vencedores.");
        else if (qv1 == qv3 && qv1 > qv2)
            System.out.println("O primeiro e o terceiro candidato são vencedores.");


    }
}
