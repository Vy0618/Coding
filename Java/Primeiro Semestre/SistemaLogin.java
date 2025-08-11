import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "usuario123", senhaCorreta = "senha123", usuario, senha;
        int tentativas = 0;
        boolean login = false;

        while (tentativas < 3) {

            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();


            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                login = true;
                break;
            } else {

                tentativas++;
                System.out.println("Usuário ou senha incorretos. Você tem " + (3 - tentativas) + " tentativas restantes.");
            }
        }

        if (login == true) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
