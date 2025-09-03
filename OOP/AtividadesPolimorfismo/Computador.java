package AtividadesPolimorfismo2;

import java.util.Scanner;

public class Computador implements Interface {
    public void ligar() {
        System.out.println("Computador a ligar");
    }

    public void reniciar() {
        System.out.println("Computador a reniciar");
    }

    public void desligar() {
        System.out.println("Computador a desligar");
    }

    public void carregandoSistema() {
        System.out.println("Computador a reniciar");
    }

    public static void main(String[] args) {
        Boolean loopStopper = false;
        Computador computador = new Computador();
        Scanner scan = new Scanner(System.in);
        System.out.println(".----.\n      .---------. | == |\n      |.-\"\"\"\"\"-.| |----|\n      ||       || | == |\n      ||       || |----|\n      |'-.....-'| |::::|\n      `\"\")---(\"\"` |___.|\n     /:::::::::::\\\" _  \"\n    /:::=======:::\\`\\`\\\n    `\"\"\"\"\"\"\"\"\"\"\"\"\"`  '-'");
        if (!loopStopper) {
            System.out.println("Deseja ligar o computador?");
            switch (scan.nextLine().toLowerCase()) {
                case "sim":
                    computador.ligar();
                    System.out.println("Função do código completa: método e interface foram aplicados.");
                    scan.nextLine();
                    break;
                case "nao":
                    computador.desligar();
                    System.out.println("Função do código completa: método e interface foram aplicados.");
                    scan.nextLine();
            }
        }

    }
}
