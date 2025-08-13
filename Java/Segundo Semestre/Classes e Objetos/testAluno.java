import java.util.Scanner;
public class testAluno {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


        class aluno {
            int nota;
            String nome;

            public void setNota(int nota) {
                this.nota = nota;
            }
            public int getNota() {
                return nota;
            }
            public void setNome(String nome){
                this.nome = nome;
            }
            public String getNome(){
                return nome;
            }
        }


        System.out.println("Entre com o numero de alunos:");
        int n = scan.nextInt();
        scan.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.println("-- " + (i + 1) + "° Ficha--");
            aluno aluno1 = new aluno();

            System.out.println("Entre com o nome do aluno:");
            String nome1 = scan.nextLine();

            System.out.println("Entre com a nota do aluno:");
            int nota1 = scan.nextInt();
            scan.nextLine();

            aluno1.setNota(nota1);
            aluno1.setNome(nome1);

            System.out.println(aluno1.getNome() + " " + aluno1.getNota());



        }
    }
}
