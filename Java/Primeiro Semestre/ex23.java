import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        double peso, speso1 = 0, speso2 = 0, speso3 = 0, speso4 = 0, m1, m2, m3, m4, qntd1 = 0, qntd2 = 0, qntd3 = 0, qntd4 = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.println("Insira a sua idade em anos:");
            idade = ler.nextInt();
            System.out.println("O seu peso em KG:");
            peso = ler.nextDouble();

            if (idade >= 1 && idade <= 10) {
                speso1 += peso;
                qntd1++;
            }
            if (idade >= 10 && idade <= 20) {
                speso2 += peso;
                qntd2++;
            }
            if (idade >= 20 && idade <= 30) {
                speso3 += peso;
                qntd3++;
            }
            if (idade > 30) {
                speso4 += peso;
                qntd4++;
            }
        }

            m1 = (qntd1 > 0) ? speso1 / qntd1 : 0;
            m2 = (qntd2 > 0) ? speso2 / qntd1 : 0;
            m3 = (qntd3 > 0) ? speso3 / qntd1 : 0;
            m4 = (qntd4 > 0) ? speso4 / qntd1 : 0;

            System.out.println("Placeholder:" + m1 + "\n" + m2 + "\n" + m3 + "\n" + m4);



    }
}

