import java.util.Scanner;
public class desafio3 {
    public static void main(String[] argos) {
        Scanner ler = new Scanner(System.in);

        double media = 0, notas, decisao = 0, snotas = 0, qntdex = 0, qntdbom = 0, qntdregular = 0, qntdins = 0, classificacao = 0, qntdnotas = 0;

        while (decisao != -1) {

            System.out.println("Insira a nota do aluno, entre 1 e 10:");
            notas = ler.nextInt();

            snotas += notas;
            qntdnotas++;

            if(notas <5)
                qntdins++;
            if(notas >= 5 && notas <7)
                qntdregular++;
            if(notas >= 7 && notas<9)
                qntdbom++;
            if(notas >= 9)
                qntdex ++;


            media = (snotas / qntdnotas);

            System.out.println("Deseja continuar inserindo notas?");
            decisao = ler.nextInt();

            }
            System.out.println("A média das " + qntdnotas + " notas é equivalente a " + media + ".\nQuantidade de notas excelentes: " + qntdex + ".\nQuantidade de notas boas: " + qntdbom + ".\nQuantidade de notas regulares: " + qntdregular + ".\nQuantidade de notas insuficientes: " + qntdins + ".");


        }
    }

