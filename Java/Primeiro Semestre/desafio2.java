import java.util.Scanner;
public class desafio2
{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int tentativas = 1, dificuldade, randomNum = 0, suposicao = 0 ;

        System.out.println("Escolha a dificuldade do jogo, sendo:\n1)Fácil;\n2)Médio;\n3)Difícil.");
        dificuldade = ler.nextInt();

        switch(dificuldade) {
            case 1:
                randomNum = (int) (Math.random() * 10);
                System.out.println(randomNum);
                break;
            case 2:
                randomNum = (int) (Math.random() * 50);
                System.out.println(randomNum);
                break;
            case 3:
                randomNum = (int) (Math.random() * 100);
                System.out.println(randomNum);
                break;

        }
        while (tentativas <=5){
            System.out.println("Insira o número que acredita ser o correto:");
            suposicao = ler.nextInt();

            if (suposicao != randomNum) {
                tentativas++;

                if (suposicao > randomNum) {
                    if(tentativas <= 5)
                        System.out.println("Você está procurando um número menor que esse. \nTente novamente.");
                } else {
                    if (tentativas <= 5)
                        System.out.println("Você está procurando um número maior que esse. Tente novamente.");
                }

            } else if (suposicao == randomNum){
                System.out.println("Temos um vencedor!");
                break;

            }

        }

        System.out.println("Fim de Jogo.");



    }
}