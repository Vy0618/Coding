import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, idadeh=0, idadem=0, sexo, somaidade = 0, somaidadeh = 0, somaidadem = 0, qntdh = 0, qntdm = 0;
        double mediag = 0, mediah = 0, mediam = 0;

        for (int i = 1; i <=5; i++) {
            System.out.println("Insira a sua idade em anos:");
            idade = ler.nextInt();
            System.out.println("Insira o seu sexo, sendo 1 para Masculino e 2 para Feminino:");
            sexo = ler.nextInt();

            somaidade += idade;
            mediag = somaidade / 5;


            if (sexo == 1) {
                qntdh++;
                somaidadeh += idade;
            }
            if (sexo == 2) {
                qntdm++;
                somaidadem += idade;
            }
        }

       mediah = (qntdh > 0) ? mediah = (double) somaidadeh / qntdh : 0;
        mediam = (qntdm > 0) ? mediam = (double) somaidadem / qntdm : 0;

        System.out.println("A média da idade geral do grupo é " + mediag + ".\nA média da idade dos homens é " + mediah + ".\nA média das idades da mulher é " + mediam + ".");


        }
    }

