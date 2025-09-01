package AtividadesHerança;

import java.util.Scanner;
public class MainVeiculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a marca do carro:");
        String marca = scan.nextLine();
        System.out.println("Entre com o modelo do carro:");
        String modelo = scan.nextLine();
        System.out.println("Entre com o ano do carro:");
        String ano = scan.nextLine();
        System.out.println("Entre com a quantidade de portas do carro:");
        String portas = scan.nextLine();
        System.out.println("Entre com o motor do carro:");
        String motor = scan.nextLine();
        System.out.println("Entre com a cor do carro:");
        String cor = scan.nextLine();

        Automovel automovel1 = new Automovel(marca, modelo, ano, portas, motor, cor);

        System.out.println("Automóvel 1:");
        System.out.println(automovel1.getMarca());
        System.out.println(automovel1.getModelo());
        System.out.println(automovel1.getNumeroPortas());
        System.out.println(automovel1.getMotor());
        System.out.println(automovel1.getAno());
        System.out.println(automovel1.getCor());
    }
}
