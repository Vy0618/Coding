import java.util.Scanner;
public class ProvaOOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //minimize the class animal for better visualization. i decided to write everything together to avoid uploading two files.

        class animal {
            String nome;
            String especie;
            int idade;
            Double peso;


            public void setNome (String nome){
                this.nome = nome;
            }
            public String getNome(){
                return nome;
            }

            public void setEspecie (String especie){
                this.especie = especie;
            }
            public String getEspecie(){
                return especie;
            }

            public void setIdade (int idade){
                this.idade = idade;
            }
            public int getIdade(){
                return idade;
            }

            public void setPeso (Double peso){
                this.peso = peso;
            }
            public double getPeso(){
                return peso;
            }
        }


        animal animal1 = new animal();

        System.out.println("Entre com o nome do animal: ");
        animal1.setNome(scan.nextLine());
        System.out.println("Entre com a espécie do animal: ");
        animal1.setEspecie(scan.nextLine());
        System.out.println("Entre com a idade do animal: ");
        animal1.setIdade(scan.nextInt());
        scan.nextLine();
        System.out.println("Entre com o peso do animal: ");
        animal1.setPeso(scan.nextDouble());

        System.out.println("---- REGISTRO DO ANIMAL ----");
        System.out.println("Nome: " + animal1.getNome());
        System.out.println("Espécie: " + animal1.getEspecie());
        System.out.println("Idade: " + animal1.getIdade());
        System.out.println("Peso: " + animal1.getPeso() + " KGs");
    }
}
