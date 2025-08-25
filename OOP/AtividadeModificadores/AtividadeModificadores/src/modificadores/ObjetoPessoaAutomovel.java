package modificadores;
import java.util.Scanner;
public class ObjetoPessoaAutomovel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ClassePessoa pessoa = new ClassePessoa();


        System.out.println("Informe o nome do carro:");
        String nome = scan.nextLine();
        System.out.println("Informe a cor do carro:");
        String cor = scan.nextLine();
        System.out.println("Informe a velocidade do carro:");
        int velocidade = scan.nextInt();

pessoa.compracarro(cor, nome, velocidade);

ClasseAutomovel carro = pessoa.getAutomovel();

        System.out.println("O carro comprado foi " + carro.getNome() + " de cor " + carro.getCor() + ", com uma velocidade máxima de " + carro.getVelocidade());
    }
}