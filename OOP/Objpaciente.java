import java.util.Scanner;

public class ObjPaciente {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        Paciente objPaciente = new Paciente();

        System.out.println("Deseja fazer quantas fichas de paciente: ");
        int info = ler.nextInt();
        ler.nextLine();



        for(int i = 0; i < info; i++){
            System.out.println("insira o nome do paciente:");
            String nome = ler.nextLine();


            System.out.println("insira o endereço do paciente:");
            String endereco = ler.nextLine();


            System.out.println("insira o cpf do paciente:");
            Double cpf = ler.nextDouble();


            System.out.println("insira o sexo do paciente:");
            char sexo = ler.next().charAt(0);
            ler.nextLine();


            System.out.println("insira o nivel de escolaridade do paciente:");
            String nivelEscolaridade = ler.nextLine();


            System.out.println("insira o email do paciente:");
            String email = ler.nextLine();


            System.out.println("insira a data de nascimento do paciente:");
            String datadeNascimento = ler.nextLine();
            ler.nextLine();


            System.out.println("insira o telefone do paciente:");
            Double telefone = ler.nextDouble();



            objPaciente.setNome(nome);
            ler.nextLine();
            objPaciente.setEndereco(endereco);
            objPaciente.setCpf(cpf);
            objPaciente.setSexo(sexo);
            objPaciente.setNiveldeEscolaridade(nivelEscolaridade);
            objPaciente.setEmail(email);
            objPaciente.setdatadeNascimento(datadeNascimento);
            objPaciente.setTelefone(telefone);

            System.out.println("----------paciente:--------------");

            System.out.println(objPaciente.getNome());
            System.out.println(objPaciente.getEndereco());
            System.out.println(objPaciente.getCpf());
            System.out.println(objPaciente.getSexo());
            System.out.println(objPaciente.getNiveldeEscolaridade());
            System.out.println(objPaciente.getEmail());
            System.out.println(objPaciente.getDatadeNascimento());
            System.out.println(objPaciente.getTelefone());



        }
    }
}
