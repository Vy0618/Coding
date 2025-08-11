import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String corolhos = "", cabelo = "";
        double idade = 0, peso = 0, altura = 0, pesoeidade = 0, qntdolhosazuis = 0, cabeloruivoeolhos = 0, somaidadedosanos = 0, qntanos = 0, porcentolhoazul = 0, mediaalturaeidade = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Insira a idade do indivíduo:");
            idade = ler.nextInt();
            System.out.println("Insira o peso do indivíduo em KGs:");
            peso = ler.nextInt();
            ler.nextLine();
            System.out.println("Insira a altura do indivíduo em metros:");
            altura = ler.nextDouble();
            ler.nextLine();
            System.out.println("Insira a cor dos olhos do indivíduo, sendo A – Azul, P- Preto, V- Verde e C- Castanho:");
            corolhos = ler.nextLine().trim();
            System.out.println("Insira a cor dos cabelos do indivíduo, sendo P - Preto, C- Castanho, L – Louro e R-Ruivo.");
            cabelo = ler.nextLine().trim();


            if (peso < 60 && idade >= 50)
                pesoeidade++;
            if (corolhos.equals("A"))
                qntdolhosazuis++;
            if (cabelo.equals ("R") && !corolhos.equals ("A")) {
                cabeloruivoeolhos++;
            }
            if (altura < 1.50) {
                somaidadedosanos += idade;
                qntanos++;
            }
        }

            double mediadebaixos = (qntanos > 0) ? (double) somaidadedosanos / qntanos : 0;
            porcentolhoazul = (qntdolhosazuis / 5) * 100;


            System.out.println("A média das idades das pessoas com altura inferior a 1,50m é igual a: " + mediadebaixos + ".\nA porcentagem de pessoas com olhos azuis entre as pessoas analisadas é igual a: " + porcentolhoazul + "%.\nA quantidade de pessoas ruivas que não possuem olhos azuis é igual a: " + cabeloruivoeolhos + ".");


        }
    }

