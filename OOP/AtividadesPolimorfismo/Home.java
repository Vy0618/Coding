import java.util.Scanner;

public class Home implements Interface {
    public void ligar() {
        System.out.println("As luzes se acenderam.");
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
        Home home = new Home();
        Scanner scan = new Scanner(System.in);
        System.out.println("||____\n ///////////\\\n///////////  \\\n|    _    |  |\n|[] | | []|[]|\n|   | |   |  |");
        System.out.println("Deseja ligar as luzes?");
        String resposta = scan.nextLine().toLowerCase();
        if (resposta.equals("sim")) {
            home.ligar();
        } else {
            System.out.println("As luzes permanecem apagadas.");
        }

        System.out.println("O objetivo da atividade foi completo.");
    }
}
