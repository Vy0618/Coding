import java.util.Scanner;

public class ObjFuncionario {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        Funcionario objFuncionario = new Funcionario();

        System.out.println("Deseja fazer quantas fichas de funcionario: ");
        int info = scan.nextInt();



        for(int i = 0; i < info; i++){
            System.out.println("insira o nome do paciente:");
            String nome = scan.nextLine();
            scan.nextLine();

            System.out.println("insira o endereço do paciente:");
            String endereco = scan.nextLine();


            System.out.println("insira o cpf do paciente:");
            Double cpf = scan.nextDouble();


            System.out.println("insira o sexo do paciente:");
            char sexo = scan.next().charAt(0);


            System.out.println("insira o nivel de escolaridade do paciente:");
            String nivelEscolaridade = scan.nextLine();


            System.out.println("insira o email do paciente:");
            String email = scan.nextLine();

            System.out.println("insira o cargo do paciente:");
            String cargo = scan.nextLine();

            System.out.println("insira a data de admissao do paciente:");
            String dataAdmissao= scan.nextLine();

            System.out.println("insira a data de admissao do paciente:");
            String  dataDemissao= scan.nextLine();

            System.out.println("insira o telefone do paciente:");
            Double telefone = scan.nextDouble();



            objFuncionario.setNome(nome);
            scan.nextLine();
            objFuncionario.setEndereco(endereco);
            objFuncionario.setCpf(cpf);
            objFuncionario.setSexo(sexo);
            objFuncionario.setNiveldeEscolaridade(nivelEscolaridade);
            objFuncionario.setEmail(email);
            objFuncionario.setDataAdmissao(dataAdmissao);
            objFuncionario.setTelefone(telefone);
            objFuncionario.setCargo(cargo);
            objFuncionario.setDatadeDemissao(dataDemissao);



            System.out.println("----------paciente:--------------");

            System.out.println(objFuncionario.getNome());
            System.out.println(objFuncionario.getEndereco());
            System.out.println(objFuncionario.getCpf());
            System.out.println(objFuncionario.getSexo());
            System.out.println(objFuncionario.getNiveldeEscolaridade());
            System.out.println(objFuncionario.getEmail());
            System.out.println(objFuncionario.getTelefone());
            System.out.println(objFuncionario.getCargo());
            System.out.println(objFuncionario.getDataAdmissao());
            System.out.println(objFuncionario.getDatadeDemissao());

        }
    }
}
