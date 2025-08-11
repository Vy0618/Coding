import java.util.Scanner;

public class ex29 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int numstudent, pesostudent, mediapeso = 0, pesototal = 0,  ordinal = 1;

        System.out.println("Qual o numero de alunos cadastrados na academia?");
        numstudent = ler.nextInt();

        while ( ordinal <= numstudent) {
            System.out.println("Qual o peso do " + ordinal +"° aluno(a) em quilogramas?");
            pesostudent = ler.nextInt();

            pesototal += pesostudent;
            ordinal++;

        }

        mediapeso = pesototal / numstudent;
        System.out.println("A média do peso dos alunos é de " + mediapeso + " kg.");

    }
}